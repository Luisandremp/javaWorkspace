import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import Model.EleveBean;
import Model.WSUtils;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// cree la list de eleves
		HashMap<Integer, ArrayList<EleveBean>> mesEleves = new HashMap<Integer, ArrayList<EleveBean>>();

		try {
			mesEleves = WSUtils.getEleves();
			printMesEleves(mesEleves);
			mesEleves = WSUtils.updateEleves(mesEleves);
			printMesEleves(mesEleves);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// function utilitaire pour representer la liste d'eleves
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

}
