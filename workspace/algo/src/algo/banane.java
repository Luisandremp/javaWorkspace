package algo;

public class banane {
	public static void main(String[] args) {
		int banane = 3000;
		int voyage = 1000;
		int banane2 = 3000;
		int voyage2 = 1000;

		for (; voyage >= 0; voyage--) {
			if (banane > 2002) {
				banane -= 5;
			} else if (banane > 1002) {
				banane -= 3;
			} else {
				banane -= 1;
			}
		}

		System.out.println(banane);
		System.out.println(countBanane(banane2, voyage2));
	}

	public static int countBanane(int nbBanane, int nbKilometre) {
		for (; nbKilometre >= 0; nbKilometre--) { // ammener tout les banannes à
													// chaque kilometre
													// (kilometre total --)
			if (nbBanane < 1002) { // sii il a moins de 1000 bananes ou si les
									// bannanes restant sont pas sufisant pour
									// fair le aller retour (2 bannanes manger a
									// chaque aler retour)
				nbBanane -= 1;
			} else if (nbBanane % 1000 > 2) { // si il a plus de bannanes qui le
												// dromedaire peut porter (1000)
												// et si dans le dernier aller
												// retour il ha plus que 2
												// banannes
				nbBanane -= ((nbBanane / 1000) * 2) + 1;
			} else { // si les dernier aller retour est 2 ou moins
				nbBanane -= (((nbBanane - 2) / 1000) * 2) + 1;
			}

		}
		return nbBanane;
	}
}
