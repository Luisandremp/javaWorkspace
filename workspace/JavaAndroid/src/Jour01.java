public class Jour01 {

	public static void main(String[] args) {
		// Exo.affichePlus5(5);
		// Exo.affichePlus5(10);
		// Exo.subAB(5, 100);
		// Exo.subAB(100, 5);
		// System.out.println(maxNB(7, 5, 3));
		// multiples47();
		// lePlusPetiteNB();
		/*
		 * int[] tab = new int[10]; ArrayUtils.fillTab(tab);
		 * ArrayUtils.printTab(tab); System.out.println(); int max =
		 * ArrayUtils.getMax(tab); System.out.println("max= " + max);
		 * System.out.println("somme: " + ArrayUtils.getSomme(tab));
		 * System.out.println("Moyen: " + ArrayUtils.getMoyen(tab));
		 * ArrayUtils.printValSupMoyen(tab); System.out.println("nb occurance: "
		 * + ArrayUtils.getNbOcurrValMax(tab)); System.out.println();
		 * System.out.println("Sorted:"); ArrayUtils.sortTab(tab);
		 * ArrayUtils.printTab(tab); System.out.println(); System.out.println(
		 * "Fusion: "); ArrayUtils.printTab(ArrayUtils.fusion(tab, tab));
		 * System.out.println(); System.out.println("Fusion sort: ");
		 * ArrayUtils.printTab(ArrayUtils.fusionSort(tab, tab));
		 * System.out.println();
		 *
		 * int[] tabTest = new int[10000]; long millis =
		 * System.currentTimeMillis(); for (int i = 1; i < 100; i++) {
		 * ArrayUtils.fillTab(tabTest); ArrayUtils.sortTab(tabTest); }
		 * System.out.println("time: ");
		 * System.out.println(System.currentTimeMillis() - millis);
		 *
		 * millis = System.currentTimeMillis(); for (int i = 1; i < 100; i++) {
		 * ArrayUtils.fillTab(tabTest); Arrays.sort(tabTest); }
		 * System.out.println("time: ");
		 * System.out.println(System.currentTimeMillis() - millis);
		 */

		/*
		 * int[] tab2 = new int[] { 0, 2, 1, 0, 1, 1, 1, 1, 0, 0, 0, 2, 2, 2, 0
		 * }; trie(tab2); ArrayUtils.printTab(tab2);
		 */

		//////////////////////////////////////////////////////////////////////////////
		/// OBJ /////////////
		//////////////////////////////////////////////////////////////////////////////

	}

	public static void trie(int[] tab2) {
		int temp;
		int index0 = 0;
		int index2 = tab2.length - 1;

		for (int i = 0; i <= index2;) {
			if (tab2[i] == 0) {
				temp = tab2[index0];
				tab2[index0] = tab2[i];
				tab2[i] = temp;
				index0++;
				i++;
			} else if (tab2[i] == 2) {
				temp = tab2[index2];
				tab2[index2] = tab2[i];
				tab2[i] = temp;
				index2--;
			} else {
				i++;
			}
		}
	}

}
