
public class Exo {
	public static void affichePlus5(int myInt) {
		System.out.println("Original number was: " + myInt + ".  This number plus 5 is: " + (myInt + 5));
	}

	public static void subAB(int a, int b) {
		System.out.println("Original numbers were: " + a + " , " + b + ".  the result of a - b is: " + (a - b));
	}

	public static int maxNB(int a, int b, int c) {
		int max = Integer.MIN_VALUE;
		/*
		 * if (a > max) { max = a; } if (b > max) { max = b; } if (c > max) {
		 * max = c; }
		 */
		int[] params = new int[] { a, b, c };

		for (int i = 0; i < params.length; i++) {
			if (params[i] > max) {

			}
		}
		return max;
	}

	public static void multiples47() {
		String result = "";
		boolean isFirst = true;

		for (int i = 1; i < 10000; i++) {
			if (i % 47 == 0) {
				if (isFirst) {
					isFirst = false;
					result += "lest multiples de 47 entre 1 et 10000. Resultats: " + i + " ";
				} else {
					result += ", " + i;
				}
			}
		}
		System.out.println(result);
	}

	public static void lePlusPetiteNB() {
		int i = 1;
		while (true) {
			i++;
			if (i % 7 == 0 && i % 11 == 0 && i % 5 == 0) {
				if ((i + (i - 1)) % 36 == 1) {
					System.out.println(
							"le plus petit nombre respectant toutes ces conditions : Divisible par 7, par 11, par 5,(Dont la somme avec son prédécesseur) divisé par 36 donne un reste de 1. RESULTAT: "
									+ i);
					break;
				}
			}
		}
	}

}
