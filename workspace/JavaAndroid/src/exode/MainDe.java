package exode;

public class MainDe {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        PartieBean partieBean = new PartieBean("Toto", "Tata");

        for (int i = 0; i < PartieBean.NB_TOUR; i++) {

            //Le j1 joue
            partieBean.lancerJ1();
            if (partieBean.getJ1().getGobeletBean().getScoreDe() >= PartieBean.SCORE_A_ATTEINDRE) {
                partieBean.getJ1().ajouter1Pts();
            }

            //Le j2 joue
            partieBean.getJ2().lancer();
            if (partieBean.getJ2().getGobeletBean().getScoreDe() >= PartieBean.SCORE_A_ATTEINDRE) {
                partieBean.getJ2().ajouter1Pts();
            }
        }

        //Résultat
        if (partieBean.getJ1().getScorePartie() > partieBean.getJ2().getScorePartie()) {
            System.out.print("J1 a gagné : ");
        }
        else if (partieBean.getJ1().getScorePartie() < partieBean.getJ2().getScorePartie()) {
            System.out.print("J2 a gagné : ");
        }
        else {
            System.out.print("Egalité : ");
        }
        System.out.println(partieBean.getJ1().getScorePartie() + " - " + partieBean.getJ2().getScorePartie());
    }

}
