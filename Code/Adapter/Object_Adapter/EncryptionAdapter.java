package Adapter.Object_Adapter;

public class EncryptionAdapter implements Encryption{
	
	private ThirdPartyEncryption thirdPartyEncryption;
	
	public EncryptionAdapter() {
		thirdPartyEncryption = new ThirdPartyEncryption();
	}

	@Override
	public String encrypt(String original) {
		return thirdPartyEncryption.thirdPartyEncrypt(original);
	}

	@Override
	public String decrypt(String cipher) {
		return thirdPartyEncryption.thirdPartyDecrypt(cipher);
	}

}
