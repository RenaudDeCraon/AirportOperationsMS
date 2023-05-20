package UserPack;

public class passanger {
    String name;
    String surname;
    String YearOfBirth;
    String LuggageCount;
    String isVIP;

    public flight getDestination() {
        return destination;
    }

    public void setDestination(flight destination) {
        this.destination = destination;
    }

    flight destination;

    public passanger(String name) {
        this.name = name;
    }

    public passanger(String name, String surname, String luggageCount, String yearOfBirth, String isVIP) {
        this.name = name;
        this.surname = surname;
        YearOfBirth = yearOfBirth;
        LuggageCount = luggageCount;
        this.isVIP = isVIP;
    }

    @Override
    public String toString() {
        return
                name  +
                " " + surname  +
                " " + YearOfBirth  +
                " " + LuggageCount +
                " " + isVIP ;
    }
}
