package exode;

public class DePipeeBean extends DeBean {

    @Override
    public void lancer() {
        if (RANDOM.nextBoolean()) {
            super.lancer();
        }
        else {
            value = 6;
        }

    }

}
