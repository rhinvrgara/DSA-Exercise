import java.io.*;

class SubstituteCipher {
	BufferedReader reader;

	public SubstituteCipher() {
		reader = new BufferedReader(new InputStreamReader(System.in));
	}

	String getMessage() {
		try {
			return reader.readLine();
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	String  getROT13(String plainText) {
		StringBuffer cipherText = new StringBuffer();

		for (int i = 0; i < plainText.length(); i++) {
			char pChar = plainText.charAt(i);

			if ((pChar >= 65) && (pChar <= 77))
				pChar = (char)(pChar + 13);

			else if ((pChar >= 97) && (pChar <= 109)) 
				pChar = (char)(pChar - 13);

			else if ((pChar >= 78) && (pChar <= 122))
				pChar = (char)(pChar - 13);

			else if ((pChar >= 53) && (pChar <= 57))
				pChar = (char)(pChar - 5);

			cipherText.append(" " + pChar);
		}
		return cipherText.toString();
	}
	public static void main(String args[]) {
		SubstituteCipher sc;
		sc = new SubstituteCipher();

		System.out.print("Enter Sentence to Encrypt: ");
		String plainText = sc.getMessage();

		String encoded = sc.getROT13(plainText);
		String decoded = sc.getROT13(encoded);

		System.out.println("\n--------------------------------------");
		System.out.println("Plain sentence: " + plainText);
		System.out.println("Encrypted Text: " + encoded);
		System.out.println("Decrypted Text: " + plainText);
		System.out.println();
		System.out.println("Thanks for Using Me! :)");
		System.out.println("I'm Ciphyy!");
	}
}
