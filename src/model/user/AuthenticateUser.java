package model.user;

import java.security.Key;
import java.sql.ResultSet;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import model.QueryBuild.QueryBuilder;

public class AuthenticateUser {

	private String encryptionKey = "cdc63491uAf24938"; // Krypteringsnøgle

	private ResultSet resultSet;

	public boolean authenticate(String email, String password, boolean isAdmin) throws Exception {

		String[] keys = {"userid", "email", "active", "password"};

		QueryBuilder qb = new QueryBuilder();

		// Henter info om bruger fra database via querybuilder
		resultSet = qb.selectFrom(keys, "users").where("email", "=", email).ExecuteQuery();

		// Hvis en bruger med forespurgt email findes
		if (resultSet.next()){

			// Hvis brugeren er aktiv
			if(resultSet.getBoolean("active"))
			{					
				// Hvis passwords matcher
				if(resultSet.getString("password").equals(decrypt(password)))
				{
					int userID = resultSet.getInt("userid");

					resultSet.qb.selectFrom("userrole", "userroles").where("userid", "=", userID).ExecuteQuery();

					// Hvis brugeren både logger ind og er registreret som admin, eller hvis brugeren både logger ind og er registreret som bruger
					if((resultSet.getString("userrole").equals("admin") && isAdmin) || (resultSet.getString("userrole").equals("user") && !isAdmin))
					{
						return true;
					} else {
						return false;
					}

				} else {
					return false;
				}
			} else {
				return false;
			}

		} else {
			return false;
		}
	}

	// Metode til at dekryptere en string med AES 128 encryption
	private String decrypt(String toDecrypt) throws Exception{

		// Lav key og cipher
		Key aesKey = new SecretKeySpec(encryptionKey.getBytes(), "AES");
		Cipher cipher = Cipher.getInstance("AES");

		// Dekrypterer String
		cipher.init(Cipher.DECRYPT_MODE, aesKey);
		String decrypted = new String(cipher.doFinal(toDecrypt.getBytes()));

		return decrypted;
	}

	/*
	 * Nedenstaaende metode skal implementeres i klienterne. Metoden kan kryptere strings med AES 128 bit encryption. (encryptionKey = "cdc63491uAf24938")
	 */
	//	private String encrypt(String toEncrypt) throws Exception {
	//		
	//		Key aesKey = new SecretKeySpec(encryptionKey.getBytes(), "AES");
	//		Cipher cipher = Cipher.getInstance("AES");
	//
	//		cipher.init(Cipher.ENCRYPT_MODE, aesKey);
	//		byte[] encrypted = cipher.doFinal(toEncrypt.getBytes());
	//
	//		return new String(encrypted);
	//	}

}