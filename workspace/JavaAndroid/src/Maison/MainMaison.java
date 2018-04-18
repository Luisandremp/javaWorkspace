package Maison;

import java.util.ArrayList;

public class MainMaison {

	public static void main(String[] args) {
		/**
		 * OLD
		 */
		/*
		 * MaisonBean chezMoi = new MaisonBean(); chezMoi.largeur = 5;
		 * chezMoi.longueur = 15; MaisonUtils.printMaison(chezMoi);
		 *
		 * MaisonUtils.doubleMaison(chezMoi); MaisonUtils.printMaison(chezMoi);
		 *
		 * System.out.println(); MaisonBean Maison2 = new MaisonBean();
		 *
		 * System.out.println("Maison 01"); MaisonUtils.printMaison(chezMoi);
		 * System.out.println("Maison 02"); MaisonUtils.printMaison(Maison2);
		 * System.out.println("Maison plus grand est:");
		 * MaisonUtils.printMaison(MaisonUtils.big(chezMoi, Maison2));
		 *
		 * MaisonBean[] maisonBeans = new MaisonBean[5];
		 * MaisonUtils.createMaisons(maisonBeans);
		 * MaisonUtils.printMaisons(maisonBeans);
		 * MaisonUtils.bigMaison(maisonBeans);
		 */
		ArrayList<MaisonBean> maisonArrayList = new ArrayList<MaisonBean>();
		CollectionUtils.fillList(maisonArrayList, 10);
		CollectionUtils.printList(maisonArrayList);
		System.out.println("Le Maison plus large est: ");
		CollectionUtils.getMax(maisonArrayList);
		System.out.println("Suprimer les impaire: ");
		CollectionUtils.supImpaire(maisonArrayList);
		CollectionUtils.printList(maisonArrayList);

	}

}
