package de;

public class mainDE {
	public static void main(String[] args) {
		DeBeanOriginal d4 = new DeBeanOriginal(4);
		DeBeanOriginal d6 = new DeBeanOriginal(6);
		DeBeanOriginal d8 = new DeBeanOriginal(8);
		DeBeanOriginal d10 = new DeBeanOriginal(10);
		DeBeanOriginal d12 = new DeBeanOriginal(12);
		DeBeanOriginal d20 = new DeBeanOriginal(20);
		DeBeanOriginal d100 = new DeBeanOriginal(100);

		DeBeanOriginal monDe = new DeBeanOriginal();
		System.out.println(monDe.getValeur());
		monDe.lancer();
		System.out.println(monDe.getValeur());
		monDe.lancer(20);
		System.out.println(monDe.getValeur());

		System.out.println();
		d4.lancer();
		d6.lancer();
		d8.lancer();
		d10.lancer();
		d12.lancer();
		d20.lancer();
		d100.lancer();
		System.out.println("d4: " + d4.getValeur());
		System.out.println("d6: " + d6.getValeur());
		System.out.println("d8: " + d8.getValeur());
		System.out.println("d10: " + d10.getValeur());
		System.out.println("d12: " + d12.getValeur());
		System.out.println("d20: " + d20.getValeur());
		System.out.println("d100: " + d100.getValeur());

	}

}
