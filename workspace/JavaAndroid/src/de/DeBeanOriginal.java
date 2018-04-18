package de;

import java.util.Random;

public class DeBeanOriginal {
	private int valeur;
	private int maxDefault = 6;

	public DeBeanOriginal() {
		this(6);
	}

	public DeBeanOriginal(int maxDefault) {
		this.maxDefault = maxDefault;
	}

	public int getValeur() {
		return this.valeur;
	}

	public void setValeur(int i) {
		this.valeur = i;
	}

	public void lancer() {
		Random random = new Random();
		this.valeur = random.nextInt(this.maxDefault) + 1;
	}

	public void lancer(int maxValue) {
		Random random = new Random();
		this.valeur = random.nextInt(maxValue) + 1;
	}
}
