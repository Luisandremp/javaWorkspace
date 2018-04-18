public class ArrayUtils {
	/** Remplis le tableau de valeurs aléatoires comprises entre 0 et99 */
	public static void fillTab(int[] tab) {
		for (int i = 0; i < tab.length; i++) {
			tab[i] = (int) Math.floor(Math.random() * 99);
		}
	}

	/** Affiche le tableau dans la console sur 1 seule ligne */
	public static void printTab(int[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.print(i + ": " + tab[i] + "    ");

		}
	}

	/** Retourne la valeur maximum du tableau */
	public static int getMax(int[] tab) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] > max) {
				max = tab[i];
			}
		}
		return max;
	}

	// Retourne la somme
	public static int getSomme(int[] tab) {
		int somme = 0;

		for (int i = 0; i < tab.length; i++) {
			somme += tab[i];
		}
		return somme;
	}

	// Retourne la moyenne
	public static int getMoyen(int[] tab) {
		int moyen = getSomme(tab) / tab.length;
		return moyen;
	}

	// Affiche les valeurs supérieurs à la moyenne (ne retourne rien)
	public static void printValSupMoyen(int[] tab) {
		String result = "Valeurs superior a moyen: ";
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] > getMoyen(tab)) {
				result += tab[i] + "  ";
			}
		}
		System.out.println(result);
	}

	// Retourne le nombre d’occurrence de la valeur maximum (Version o(2n) et
	// O(n))
	public static int getNbOcurrValMax(int[] tab) {
		int max = getMax(tab);
		int nbOcc = 0;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == max) {
				nbOcc++;
			}
		}
		return nbOcc;
	}

	/**
	 * Crée et retourne un nouveau tableau qui est la concaténation des 2
	 * tableaux
	 **/
	public static int[] fusion(int[] tab1, int[] tab2) {
		int[] tabF = new int[tab1.length + tab2.length];
		for (int i = 0; i < tab1.length; i++) {
			tabF[i] = tab1[i];
		}
		for (int i = 0; i < tab2.length; i++) {
			tabF[i + tab1.length] = tab2[i];
		}
		return tabF;
	}

	/** Trie le tableau */
	public static void sortTab(int[] tab) {
		boolean notSorted = true;
		while (notSorted) {
			boolean isBubbles = false;
			for (int i = 0; i < tab.length; i++) {
				if (i != tab.length - 1) {
					if (tab[i] > tab[i + 1]) {
						int temp = tab[i];
						tab[i] = tab[i + 1];
						tab[i + 1] = temp;
						isBubbles = true;
					}
				}
			}
			if (!isBubbles) {
				notSorted = false;
			}

		}
	}

	/**
	 * Crée et retourne un tableau trié qui est la fusion des 2 tableaux triés
	 **/
	public static int[] fusionSort(int[] sortTab1, int[] sortTab2) {
		int[] resultArray = new int[sortTab1.length + sortTab2.length];
		for (int i = 0, it1 = 0, it2 = 0; i < resultArray.length;) {
			if (it1 >= sortTab1.length) {
				resultArray[i] = sortTab2[it2];
				it2++;
			} else if (it2 >= sortTab2.length) {
				resultArray[i] = sortTab1[it1];
				it1++;
			} else if (sortTab1[it1] >= sortTab2[it2]) {
				resultArray[i] = sortTab1[it1];
				it1++;
			} else if (sortTab2[it2] >= sortTab1[it1]) {
				resultArray[2] = sortTab1[it2];
				it1++;
			}
		}

		return resultArray;
	}

}
