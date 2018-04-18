package algo;

public class algo3 {
	public static void main(String[] args) {
		String chain = "aabcdefghijklmnopqrstuvwxyz";

		// System.out.println("inverse: " + checkPalindrome(chain));
		// System.out.println("Faire en palindrome? " + makePalingdrome(chain));
		// System.out.println("Cherche le char 'a': " + chercheChar(chain,
		// 'a'));
		// System.out.println("Cherche le char 'b': " + chercheChar(chain,
		// 'b'));
		// System.out.println("Cherche le char 'y': " + chercheChar(chain,
		// 'y'));
		// System.out.println("Cherche le char 'z': " + chercheChar(chain,
		// 'z'));
		// System.out.println("Cherche le char 'A': " + chercheChar(chain,
		// 'A'));
		// System.out.println("Cherche le char: " + chercheChar(chain, '!'));
		System.out.println("triage: " + triage("aaazezezezeaba"));
		System.out.println("triage: " + trierChaineAvecDoublon("aaazezezezeaba"));
	}

	static String trierChaineAvecDoublon(String textAvecDoublon) { // code de
																	// fred

		String res = "";
		char minSave = 0;

		for (int i2 = 0; i2 < textAvecDoublon.length(); i2++) {
			char min = Character.MAX_VALUE;
			for (int i = 0; i < textAvecDoublon.length(); i++) {
				char c = textAvecDoublon.charAt(i);
				if ((c > minSave) && (c < min)) {
					min = c;
				}
			}
			for (int i = 0; i < textAvecDoublon.length(); i++) {
				char c = textAvecDoublon.charAt(i);
				if (c == min) {
					res += min;
				}
			}
			minSave = min;
		}
		return res;
	}

	static String triage(String s1) {
		String result = "";

		for (int i1 = 0; i1 < s1.length(); i1++) {
			char charPetit = Character.MAX_VALUE;
			String ajouter = "";

			for (int i = 0; i < s1.length(); i++) {
				char curr = s1.charAt(i);
				if (i1 > 0) {
					if (curr < charPetit && curr > result.charAt(result.length() - 1)) {
						charPetit = curr;
						ajouter = "";
					} else if (curr == charPetit && curr > result.charAt(result.length() - 1)) {
						ajouter += charPetit;

					}
				} else {
					if (curr < charPetit) {
						charPetit = curr;
						ajouter = "";
					} else if (curr == charPetit) {
						ajouter += charPetit;

					}
				}
			}
			i1 += ajouter.length() + 1;
			result += (ajouter + charPetit);
		}
		return result;
	}

	static boolean chercheChar(String s1, char c) {

		for (int debout = 0, fin = s1.length() - 1; debout <= fin;) {
			int i = debout + ((fin - debout) / 2);
			char currC = s1.charAt(i);

			if (c == currC) {
				return true;
			} else if (c < currC) {
				fin = i - 1;
			} else if (c > currC) {
				debout = i + 1;
			}
		}
		return false;
	}

	static String inverse(String s1) {
		String inverse = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			inverse += s1.charAt(i);
		}

		return inverse;
	}

	static Boolean checkPalindrome(String s1) {
		String inverse = inverse(s1);
		if (inverse.equals(s1)) {
			return true;
		} else {
			return false;
		}
	}

	static String makePalingdrome(String s1) {
		String res = "";
		if (checkPalindrome(s1)) {
			res = "Il est deja un palindrome:  " + s1;
		} else {
			res = "noveau palindrome:  " + s1 + inverse(s1);
		}
		return res;
	}

}
