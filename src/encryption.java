import javax.xml.bind.ParseConversionEvent;

import config.Configurations;


public class encryption {
//	Decryption path
	public String decrypt(byte[] b)
	{
		Configurations CF = new Configurations();
//		Defines the decryption value of the byte
		//The 4 lines below needs to work later on, but for now, it will be hardcode
		//System.out.println(CF.getFfcryptkey());
		System.out.println(CF.getFfcryptkey());
		String crypKey = CF.getFfcryptkey();
		System.out.println(crypKey);
		double gladKo = Double.parseDouble(crypKey);
		byte ff = (byte) gladKo;
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
