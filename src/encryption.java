
public class encryption {
	public String StringEncryption(String stringToEncryption)
	{
		byte ff = (byte) 3.1470;
		byte[] encryptedBytes = stringToEncryption.getBytes();
		for(int i = 0 ; i<encryptedBytes.length ; i++)
		{
			encryptedBytes[i] = (byte)(encryptedBytes[i]^ff);
		}
		String encrypted = new String(encryptedBytes);
		return encrypted;
	}

	
	public String decrypt(byte[] b)
	{
		byte ff = (byte) 3.1470;
		for(int i = 0 ; i<b.length ; i++)
		{
			b[i] = (byte)(b[i]^ff);
		}
		String encrypted = new String(b).trim();
		return encrypted;
	}
}
