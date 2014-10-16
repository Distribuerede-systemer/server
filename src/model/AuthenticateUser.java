package model;

import java.security.Key;
import java.sql.ResultSet;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import model.QueryBuild.QueryBuilder;

public class AuthenticateUser {
	
	private String encryptionKey = "cdc63491uAf24938";

    private ResultSet resultSet;
	public boolean authenticate(String email, String password) throws Exception {

		String[] keys = {"email", "password"};

		QueryBuilder qb = new QueryBuilder();
		resultSet = qb.selectFrom(keys, "users").where("email", "=", email).ExecuteQuery();

		if (resultSet.next()){
			String passFromData = resultSet.getString("password");
			resultSet.close();

			if(passFromData.equals(decrypt(password)))
			{
				return true;
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
	 * Nedenst�ende metode skal implementeres i klienterne. Metoden kan kryptere strings med AES 128 bit encryption. (encryptionKey = "cdc63491uAf24938")
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