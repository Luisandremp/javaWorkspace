package Eleve;

import java.util.Random;

public class EleveUtils {
	/** Remplit le tableau d’élève avec des noms et une note aléatoire */
	public static void createEleves(EleveBean[] tab) {
		for (int i = 0; i < tab.length; i++) {
			tab[i] = new EleveBean();
			tab[i].prenom = getRandomName();
			tab[i].note = new Random().nextInt(21);
		}
	}

	/** Affiche les élèves avec leur note */
	public static void printEleves(EleveBean[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i].prenom + ": " + tab[i].note);
		}
	}

	/** Retourne l’élève s’appelant bob ayant la meilleurs note */
	public static EleveBean bestBob(EleveBean[] tab) {
		EleveBean leBob = null;
		int bestNote = Integer.MIN_VALUE;
		for (int i = 0; i < tab.length; i++) {
			if ("Bob".equals(tab[i].prenom) && tab[i].note > bestNote) {
				leBob = tab[i];
				bestNote = tab[i].note;
			}
		}
		return leBob;
	}

	/** Retourne un prénom aléatoire */
	public static String getRandomName() {
		String[] name = new String[] { "Toto", "Tata", "Titi", "Bob", "Alfred" };
		return name[new Random().nextInt(name.length)];
	}
}
