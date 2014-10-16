package model.user;

import java.security.Key;
import java.sql.ResultSet;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import model.QueryBuild.QueryBuilder;

public class AuthenticateUser {

	private String encryptionKey = "cdc63491uAf24938"; // Krypteringsnoegle

	private ResultSet resultSet;
	
	private QueryBuilder qb;

	// Metoden faar email og password fra switchen (udtrukket fra en json) samt en boolean der skal saettes til true hvis det er serveren der logger paa, og false hvis det er en klient
	public int authenticate(String email, String password, boolean isAdmin) throws Exception {

		String[] keys = {"userid", "email", "active", "password"};

		qb = new QueryBuilder();

		// Henter info om bruger fra database via querybuilder
		resultSet = qb.selectFrom(keys, "users").where("email", "=", email).ExecuteQuery();

		// Hvis en bruger med forespurgt email findes
		if (resultSet.next()){

			// Hvis brugeren er aktiv
			if(resultSet.getInt("active")==1)
			{					
				// Hvis passwords matcher
				if(resultSet.getString("password").equals(decrypt(password)))
				{
					int userID = resultSet.getInt("userid");
					
					String[] key = {"type"};
					
					resultSet = qb.selectFrom(key, "roles").where("userid", "=", new Integer(userID).toString()).ExecuteQuery();

					// Hvis brugeren baade logger ind og er registreret som admin, eller hvis brugeren baade logger ind og er registreret som bruger
					if((resultSet.getString("type").equals("admin") && isAdmin) || (resultSet.getString("type").equals("user") && !isAdmin))
					{
						return 0; // returnerer "0" hvis bruger/admin er godkendt
					} else {
						return 4; // returnerer fejlkoden "4" hvis brugertype ikke stemmer overens med loginplatform
					}
				} else {
					return 3; // returnerer fejlkoden "3" hvis password ikke matcher
				}
			} else {
				return 2; // returnerer fejlkoden "2" hvis bruger er sat som inaktiv
			}
		} else {
			return 1; // returnerer fejlkoden "1" hvis email ikke findes
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