package Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Random;

public class EleveMapUtils {

	public static void creerMesEleves(HashMap<Integer, ArrayList<EleveBean>> mesEleves) {
		Random random = new Random();
		for (int i = 0; i < 50; i++) {

			int nb = random.nextInt(10) + 1;
			String nom = Integer.valueOf(nb) + "Eleve" + Integer.valueOf(i);

			EleveBean eleve = new EleveBean();
			eleve.prenom = nom;

			if (mesEleves.containsKey(nb)) {
				mesEleves.get(nb).add(eleve);
			} else {
				mesEleves.put(nb, new ArrayList<EleveBean>());
				mesEleves.get(nb).add(eleve);
			}
		}
	}

	public static void printMesEleves(HashMap<Integer, ArrayList<EleveBean>> mesEleves) {
		for (Entry<Integer, ArrayList<EleveBean>> unEleve : mesEleves.entrySet()) {

			Integer cle = unEleve.getKey();
			ArrayList<EleveBean> temp = unEleve.getValue();
			String listNom = " ";

			for (EleveBean eleveBean : temp) {
				listNom += eleveBean.prenom + ", ";
			}

			System.out.println(cle + ": " + listNom);
		}

	}

	/**
	 * Créez 50 élèves avec un prénom commençant par un chiffre(0-9) aléatoire.
	 * Les positionner dans une HashMap<Integer, ArrayList<EleveBean>> en
	 * fonction de leur chiffre de départ. Afficher dans la console la HashMap
	 * sous cette forme : 0 : 0Eleve32 0Eleve35 0Eleve42 1 : 1Eleve3 1Eleve33
	 * 1Eleve43
	 */

}
