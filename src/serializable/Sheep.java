package serializable;

import java.io.Serializable;

public class Sheep implements Serializable {
    String name;
    int alter;
    boolean geschoren;

    public Sheep () {

    }
    public String getName() {
        return name;
    }

    public int getAlter() {
        return alter;
    }

    public boolean isGeschoren() {
        return geschoren;
    }

    Sheep(String name, int alter, boolean geschoren) {
        this.name = name;
        this.alter = alter;
        this.geschoren = geschoren;
    }

}
