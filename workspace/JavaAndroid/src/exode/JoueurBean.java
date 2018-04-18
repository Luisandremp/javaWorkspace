package exode;

public class JoueurBean {

    private String nom;
    private int scorePartie;
    private GobeletBean gobeletBean;
    private boolean tricheur;

    public JoueurBean(String nom) {
        this.nom = nom;
        gobeletBean = new GobeletBean();
        scorePartie = 0;
    }

    public void lancer() {
        gobeletBean.lancer();
    }

    public void ajouter1Pts() {
        scorePartie++;
    }

    public void setTricheur(boolean tricheur) {
        this.tricheur = tricheur;
        gobeletBean = new GobeletBean(tricheur);
    }

    //-----------------
    //GETTER SETTER
    //-------------

    public boolean isTricheur() {
        return tricheur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getScorePartie() {
        return scorePartie;
    }

    public void setScorePartie(int scorePartie) {
        this.scorePartie = scorePartie;
    }

    public GobeletBean getGobeletBean() {
        return gobeletBean;
    }

    public void setGobeletBean(GobeletBean gobeletBean) {
        this.gobeletBean = gobeletBean;
    }

}
