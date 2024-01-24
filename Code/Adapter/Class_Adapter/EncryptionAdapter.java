package Adapter.Class_Adapter;

public class EncryptionAdapter extends ThirdPartyEncryption implements Encryption {
	


	@Override
	public String encrypt(String original) {
		return thirdPartyEncrypt(original);
	}

	@Override
	public String decrypt(String cipher) {
		return thirdPartyDecrypt(cipher);
	}

}
