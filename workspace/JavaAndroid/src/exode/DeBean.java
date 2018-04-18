package exode;

import java.util.Random;

public class DeBean {

    public static final Random RANDOM = new Random();
    protected int value;

    public DeBean() {
        this(1);
    }

    public DeBean(int value) {
        this.value = value;
    }

    public void lancer() {
        value = RANDOM.nextInt(6) + 1;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
