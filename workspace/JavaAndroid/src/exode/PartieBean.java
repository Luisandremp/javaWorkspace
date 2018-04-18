package exode;

public class PartieBean {

    public static final int NB_TOUR = 10;
    public static final int SCORE_A_ATTEINDRE = 7;

    private int tourEnCours;
    private JoueurBean j1, j2;
    private JoueurBean joueurCourant;

    public PartieBean(String nomJ1, String nomJ2) {
        j1 = new JoueurBean(nomJ1);
        j2 = new JoueurBean(nomJ2);
        tourEnCours = 1;
        joueurCourant = j1;
    }

    public boolean isTerminee() {
        return tourEnCours > NB_TOUR;
    }

    public void lancerJ1() {
        j1.lancer();

    }

    public void lancerJ2() {
        j2.lancer();
    }

    public void changerJoueurCourant() {
        if (joueurCourant == j1) {
            joueurCourant = j2;
        }
        else {
            joueurCourant = j1;
        }
    }

    //---------------
    //GETTER SETTER
    //---------------

    public int getTourEnCours() {
        return tourEnCours;
    }

    public void setTourEnCours(int tourEnCours) {
        this.tourEnCours = tourEnCours;
    }

    public JoueurBean getJ1() {
        return j1;
    }

    public void setJ1(JoueurBean j1) {
        this.j1 = j1;
    }

    public JoueurBean getJ2() {
        return j2;
    }

    public void setJ2(JoueurBean j2) {
        this.j2 = j2;
    }

    public JoueurBean getJoueurCourant() {
        return joueurCourant;
    }

    public void setJoueurCourant(JoueurBean joueurCourant) {
        this.joueurCourant = joueurCourant;
    }

}
