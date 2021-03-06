package exode;

public class Controler {

    private PartieBean partieBean;
    private JeuDeWindowApplication ihm;

    public Controler() {
        partieBean = new PartieBean("Toto", "Tata");
    }

    //---------------
    // Action
    //----------------
    public void lancerJ1() {
        partieBean.getJ1().lancer();
        //Le j1 joue
        if (partieBean.getJ1().getGobeletBean().getScoreDe() >= PartieBean.SCORE_A_ATTEINDRE) {
            partieBean.getJ1().ajouter1Pts();
        }
        partieBean.changerJoueurCourant();
        refreshScreen();
    }

    public void lancerJ2() {
        partieBean.getJ2().lancer();
        //Le j1 joue
        if (partieBean.getJ2().getGobeletBean().getScoreDe() >= PartieBean.SCORE_A_ATTEINDRE) {
            partieBean.getJ2().ajouter1Pts();
        }
        partieBean.changerJoueurCourant();
        partieBean.setTourEnCours(partieBean.getTourEnCours() + 1);
        refreshScreen();
    }

    public void restart() {
        partieBean = new PartieBean("Toto", "Tata");
        refreshScreen();
    }

    public void setIhm(JeuDeWindowApplication ihm) {
        this.ihm = ihm;
        refreshScreen();
    }

    public void setJ1Tricheur(boolean isTricheur) {
        partieBean.getJ1().setTricheur(isTricheur);
    }

    public void setJ2Tricheur(boolean isTricheur) {
        partieBean.getJ2().setTricheur(isTricheur);
    }

    //--------------------
    // Private
    //---------------------

    private void refreshScreen() {

        boolean lancerJ1Visible = true;
        boolean lancerJ2Visible = true;
        boolean lancerRestartVisible = true;
        int de1 = 1;
        int de2 = 1;
        if (partieBean.isTerminee()) {
            lancerJ1Visible = false;
            lancerJ2Visible = false;
        }
        else if (partieBean.getJoueurCourant() == partieBean.getJ1()) {
            lancerJ2Visible = false;
            lancerRestartVisible = false;
            de1 = partieBean.getJ2().getGobeletBean().getDe1().getValue();
            de2 = partieBean.getJ2().getGobeletBean().getDe2().getValue();
        }
        else {
            lancerJ1Visible = false;
            lancerRestartVisible = false;
            de1 = partieBean.getJ1().getGobeletBean().getDe1().getValue();
            de2 = partieBean.getJ1().getGobeletBean().getDe2().getValue();
        }

        // Joueur1
        ihm.updateJ1(partieBean.getJ1().getNom(), partieBean.getJ1().getScorePartie(), lancerJ1Visible);
        ihm.updateJ2(partieBean.getJ2().getNom(), partieBean.getJ2().getScorePartie(), lancerJ2Visible);
        ihm.updateNbTour(partieBean.getTourEnCours());
        ihm.updateDes(de1, de2);
        ihm.updateRestart(lancerRestartVisible);

    }

    //--------------------
    // Getter / setter
    //---------------------

    public PartieBean getPartieBean() {
        return partieBean;
    }

    public void setPartieBean(PartieBean partieBean) {
        this.partieBean = partieBean;
    }

    public JeuDeWindowApplication getIhm() {
        return ihm;
    }

}
