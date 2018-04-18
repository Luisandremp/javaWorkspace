package exode;

public class GobeletBean {

    private DeBean de1, de2;

    public GobeletBean() {
        this(false);
    }

    public GobeletBean(boolean truque) {
        if (truque) {
            de1 = new DePipeeBean();
            de2 = new DePipeeBean();
        }
        else {
            de1 = new DeBean();
            de2 = new DeBean();
        }

    }

    public void lancer() {
        de1.lancer();
        de2.lancer();
    }

    public int getScoreDe() {
        return de1.getValue() + de2.getValue();
    }

    //------------------
    // Getter/ setter
    //----------------------

    public DeBean getDe1() {
        return de1;
    }

    public void setDe1(DeBean de1) {
        this.de1 = de1;
    }

    public DeBean getDe2() {
        return de2;
    }

    public void setDe2(DeBean de2) {
        this.de2 = de2;
    }

}
