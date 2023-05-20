package UserPack;

import java.util.ArrayList;

public class flight {
    String departure;
    String landing;
    String departureDate;
    String landingDate;
    int capacity;
    ArrayList<passanger> passengers = new ArrayList<passanger>(capacity);


    public ArrayList<passanger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<passanger> passengers) {
        this.passengers = passengers;
    }

    public flight(String departure, String landing, String departureDate, String landingDate, int capacity) {
        this.departure = departure;
        this.landing = landing;
        this.departureDate = departureDate;
        this.landingDate = landingDate;
        this.capacity = capacity;
        for(int i = 0 ; i<capacity;i++){
            passengers.add(new passanger("Seat" + i));
        }
    }

    @Override
    public String toString() {
        return departure + " "+landing +" " + departureDate+" " + landingDate+" " + capacity;

    }
}
