package UserPack;

public class runway {
    String runwayName;
    String empty;

    public runway(String runwayName) {
        this.runwayName = runwayName;
        this.empty="empty";
    }

    public String getEmpty() {
        return empty;
    }

    public void setEmpty(String empty) {
        this.empty = empty;
    }

    @Override
    public String toString() {
        return runwayName+ " No Runway is " + empty;
    }
}
