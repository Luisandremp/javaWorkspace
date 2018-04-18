package Eleve;

import java.util.ArrayList;
import java.util.HashMap;

public class MainEleve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * EleveBean[] mesEleves = new EleveBean[20];
		 * EleveUtils.createEleves(mesEleves);
		 * EleveUtils.printEleves(mesEleves);
		 *
		 * System.out.println();
		 * System.err.println(EleveUtils.bestBob(mesEleves).prenom + " note: " +
		 * EleveUtils.bestBob(mesEleves).note);
		 */

		HashMap<Integer, ArrayList<EleveBean>> mesEleves = new HashMap<Integer, ArrayList<EleveBean>>();
		EleveMapUtils.creerMesEleves(mesEleves);
		EleveMapUtils.printMesEleves(mesEleves);
	}

}
