package Palindromes;

public class Palindromes {

	public boolean isPalindrome(String words) {
		// TODO Auto-generated method stub
		String cwords;
		boolean isPalindrome = true;
		for (int i = 0; i < words.length() / 2; i++) {
			if (Character.toLowerCase(words.charAt(i)) == words.charAt(words.length() - i)) {

			} else {
				isPalindrome = false;
			}
		}

		return isPalindrome;
	}

}
