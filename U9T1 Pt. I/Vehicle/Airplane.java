package Vehicle;
public class Airplane extends Vehicle {
    
    public int flightID;

    public Airplane(String name, int wheels, int flightID) {
        super(name, wheels);
        this.flightID = flightID;
    }

    public int getFlightID() {
        return flightID; 
}

    public void takenFlight() {
        System.out.println("Airplane " + flightID + " has taken flight");
    }
}
