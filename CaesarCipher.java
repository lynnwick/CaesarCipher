package ie.gmit.dip;

public class CaesarCipher {
	private int key;
	
	public CaesarCipher(int key) {
		this.key= key;
	}

	public String encrypt(String plainText) {
		return transform(plainText, true);
		}
		
	
	public String decrypt(String cipherText) {
		return transform(cipherText, false);
		}
		
	private String transform (String s, boolean encrypt) {
		StringBuilder  sb = new StringBuilder();
		
		for (int i = 0; i < s.length(); i++) {
			char c = (char) (encrypt? s.codePointAt(i) + key : s.codePointAt(i) - key);
			sb.append(c);
		}
			
		return sb.toString();
	
	}
	
	public static void main(String[] args) {
		CaesarCipher cc = new CaesarCipher(9);
		String s = "Gauls are large and dangerous!";
		
		String t = cc.encrypt(s);
		System.out.println("Encrypted: " + t);
		System.out.println("Decrypted: " + cc.decrypt(t));	
	}  
}
