package UserPack;

public class plane {
    String tailNumber;
    String Available;
    Hangar hangar;
    runway runway;

    public Hangar getHangar() {
        return hangar;
    }

    public void setHangar(Hangar hangar) {
        this.hangar = hangar;
    }

    public runway getRunway() {
        return runway;
    }

    public void setRunway(runway runway) {
        this.runway = runway;
    }

    @Override
    public String toString() {
       if(Available.equals("Available")) {
           return tailNumber + " " + "Available";
       }else{
           return tailNumber + " " + "Not-Available";

        }
    }

    public plane(String tailNumber, String available) {
        this.tailNumber = tailNumber;
        this.Available = available;
    }
}
