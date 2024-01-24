package Adapter.Class_Adapter;

public class ThirdPartyEncryption {
	
	public String thirdPartyEncrypt(String original) {
		return "The Encrypt Result of " + original + " through Third Party Encrypt" ;
		
	}
	
	public String thirdPartyDecrypt(String cipher) {
		return "The Decrypt Result of " + cipher + " through Third Party Decrypt" ;
	}

}
