package Maison;

import java.util.Random;

public class MaisonUtils {
	/** Affiche la largeur, longueur couleur de la maison */
	public static void printMaison(MaisonBean MaisonBeanm) {
		if (MaisonBeanm != null) {
			System.out.println(
					"Ce Maison a " + MaisonBeanm.largeur + " de largeur et  " + MaisonBeanm.longueur + " de longueur;");
		} else {
			System.err.println("Maison Null");
		}
	}

	/** Double les tailles de la maison */
	public static void doubleMaison(MaisonBean MaisonBeanm) {
		if (MaisonBeanm != null) {
			MaisonBeanm.largeur *= 2;
			MaisonBeanm.longueur *= 2;
		} else {
			System.err.println("Maison Null");
		}
	}

	/** Retourne la maison la plus grande */
	public static MaisonBean big(MaisonBean MaisonBeanm1, MaisonBean MaisonBeanm2) {
		if (MaisonBeanm1 != null && MaisonBeanm2 != null) {
			int MaisonBeanm1size = MaisonBeanm1.largeur * MaisonBeanm1.longueur;
			int MaisonBeanm2size = MaisonBeanm2.largeur * MaisonBeanm2.longueur;
			if (MaisonBeanm1size == MaisonBeanm2size) {
				System.out.println("Les maisons ont le meme taille!");
				return MaisonBeanm1;
			} else if (MaisonBeanm1size > MaisonBeanm2size) {
				return MaisonBeanm1;
			} else {
				return MaisonBeanm2;
			}
		} else {
			System.err.println("Maison Null");
			return null;
		}

	}

	/** Remplit le tableau de maison avec des tailles aléatoires */
	public static void createMaisons(MaisonBean[] tab) {
		Random random = new Random();
		for (int i = 0; i < tab.length; i++) {
			tab[i] = new MaisonBean();
			tab[i].largeur = random.nextInt(1000);
			tab[i].longueur = random.nextInt(1000);
		}
	}

	/** Affiche les maisons avec leur taille. 1 maison par ligne */
	public static void printMaisons(MaisonBean[] tab) {
		for (int i = 0; i < tab.length; i++) {
			printMaison(tab[i]);
		}

	}

	/** Retourne la maison la plus grande (Longueur * largeur) */
	public static MaisonBean bigMaison(MaisonBean[] tab) {
		int max = Integer.MIN_VALUE;
		MaisonBean m = null;
		for (int i = 0; i < tab.length; i++) {
			if (max < (tab[i].largeur * tab[i].longueur)) {
				max = (tab[i].largeur * tab[i].longueur);
				m = tab[i];
			}
		}
		return m;

	}
}
