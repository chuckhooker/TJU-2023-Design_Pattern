package Adapter.Class_Adapter;

public class Main {
	
	public static void main(String[] args) {
		Encryption encryption = new EncryptionAdapter();
		System.out.println(encryption.encrypt("'This is the string of original data'"));
		System.out.println(encryption.decrypt("'This is the string of cipher'"));
	}

}
