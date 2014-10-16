
public class encryption {
//	Encryption pass
	public String StringEncryption(String stringToEncryption)
	{
//		Defines what value the byte is generated with
		byte ff = (byte) 3.1470;
//		Creates an Array containing encryptedBytes
		byte[] encryptedBytes = stringToEncryption.getBytes();
		
//		For loop which defines rules for Array
				for(int i = 0 ; i<encryptedBytes.length ; i++)
		{
			encryptedBytes[i] = (byte)(encryptedBytes[i]^ff);
		}
//		Generates new String containing "encrypted bytes"		
		String encrypted = new String(encryptedBytes);
//		Returns the encrypted values
		return encrypted;
	}

//	Decryption path (test)
	public String decrypt(byte[] b)
	{
//		Defines the decryption value of the byte
		byte ff = (byte) 3.1470;
//		Generates for loop containing decryption value
		for(int i = 0 ; i<b.length ; i++)
		{
			b[i] = (byte)(b[i]^ff);
		}
//		Generates new String without any white spaces following or leading
		String encrypted = new String(b).trim();
//		Returns decrypted String
		return encrypted;
	}
}
