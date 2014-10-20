package model.user;
import java.security.Key;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Cipher;

import sun.misc.*;


public class encryptionAES {
	
		private static String algorithm = "AES";
		private static byte[] keyValue=new byte[] 
		{ 'D', 'I', 'S', 'T', '@', 'D', 'O', 'E', 'K', '4', 'E', 'V', 'A', 'H', '!', '!' };

		        // Performs Encryption
		        @SuppressWarnings("restriction")
				public static String encrypt(String plainText) throws Exception 
		        {
		                Key key = generateKey();
		                Cipher chiper = Cipher.getInstance(algorithm);
		                chiper.init(Cipher.ENCRYPT_MODE, key);
		                byte[] encVal = chiper.doFinal(plainText.getBytes());
		                String encryptedValue = new BASE64Encoder().encode(encVal);
		                return encryptedValue;
		        }

		        // Performs decryption
		        @SuppressWarnings("restriction")
				public static String decrypt(String encryptedText) throws Exception 
		        {
		                // generate key 
		                Key key = generateKey();
		                Cipher chiper = Cipher.getInstance(algorithm);
		                chiper.init(Cipher.DECRYPT_MODE, key);
		                byte[] decordedValue = new BASE64Decoder().decodeBuffer(encryptedText);
		                byte[] decValue = chiper.doFinal(decordedValue);
		                String decryptedValue = new String(decValue);
		                return decryptedValue;
		        }

		//generateKey() is used to generate a secret key for AES algorithm
		        private static Key generateKey() throws Exception 
		        {
		                Key key = new SecretKeySpec(keyValue, algorithm);
		                return key;
		        }

		        // performs encryption & decryption 
		        public static void main(String[] args) throws Exception 
		        {
		        	
		                String plainText = "1234";
		                String encryptedText = encrypt(plainText);
		                String decryptedText = decrypt(encryptedText);

		                System.out.println("Plain Text : " + plainText);
		                System.out.println("Encrypted Text : " + encryptedText);
		                System.out.println("Decrypted Text : " + decryptedText);
		        }

}


