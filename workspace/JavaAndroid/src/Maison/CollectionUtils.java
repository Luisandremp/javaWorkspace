package Maison;

import java.util.ArrayList;
import java.util.Random;

public class CollectionUtils {
	private static Random random = new Random();

	/**
	 * Remplis la liste de maison de largeur et longueur aléatoires
	 */
	public static void fillList(ArrayList<MaisonBean> maisonArrayList, int nbMaison) {
		for (int i = 0; i < nbMaison; i++) {
			maisonArrayList.add(new MaisonBean());
			maisonArrayList.get(i).largeur = random.nextInt(1000);
			maisonArrayList.get(i).longueur = random.nextInt(1000);
		}
	}

	/**
	 * Affiche la liste dans la console
	 */
	public static void printList(ArrayList<MaisonBean> maisonArrayList) {
		for (MaisonBean maison : maisonArrayList) {
			MaisonUtils.printMaison(maison);
		}
	}

	/**
	 * Affiche et retourne la maison la plus grande
	 */
	public static MaisonBean getMax(ArrayList<MaisonBean> maisonArrayList) {
		MaisonBean currMaxMaison = null;
		for (MaisonBean maison : maisonArrayList) {
			if (currMaxMaison == null
					|| maison.largeur * maison.longueur > currMaxMaison.largeur * currMaxMaison.longueur) {
				currMaxMaison = maison;
			}
		}
		MaisonUtils.printMaison(currMaxMaison);
		return currMaxMaison;

	}

	/**
	 * Retire les maisons de surface impaire
	 */
	public static void supImpaire(ArrayList<MaisonBean> maisonArrayList) {

		for (int i = maisonArrayList.size() - 1; i > 0; i--) {
			if ((maisonArrayList.get(i).largeur * maisonArrayList.get(i).longueur) % 2 != 0) {
				maisonArrayList.remove(maisonArrayList.get(i));
			}
		}
	}

}
