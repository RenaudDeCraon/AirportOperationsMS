package UserPack;

public class Hangar {
    String empty;
    String hangarNumber;

    public Hangar(String hangarNumber) {
        this.hangarNumber = hangarNumber;
        this.empty="Available";

    }

    @Override
    public String toString() {
        return hangarNumber+" No Hangar is "+empty;
    }

    public String getEmpty() {
        return empty;
    }

    public void setEmpty(String empty) {
        this.empty = empty;
    }
}
