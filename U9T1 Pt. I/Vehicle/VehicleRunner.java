package Vehicle;
public class VehicleRunner {
    public static void main(String[] args) {
        // testing all available methods on a Vehicle object
        Vehicle myVehicle = new Vehicle("Generic Vehicle", 6);
        System.out.println(myVehicle.getName());
        System.out.println(myVehicle.getWheels());
        myVehicle.move(10);
        myVehicle.turn();
        myVehicle.brake();

        // testing all available methods on a Car object
        Car myCar = new Car("Honda Civic", 4, "leather");
        System.out.println(myCar.getName()); // inherited method
        System.out.println(myCar.getWheels()); // inherited method
        System.out.println(myCar.getFabric()); // method ONLY available on Car objects
        myCar.move(30); // inherited method
        myCar.turn(); // inherited method
        myCar.brake(); // inherited method
        myCar.honk(); // method ONLY available on Car objects
        myCar.lockDoors(); // method ONLY available on Car objects

        // ---- WRITE YOUR BICYCLE TEST CODE BELOW ----


        Bicycle mybike = new Bicycle("CitiBike", 2, 10);
        System.out.println(mybike.getName());
        System.out.println(mybike.getWheels());
        System.out.println(mybike.getGearCount());
        mybike.move(50);
        mybike.turn();
        mybike.brake();
        mybike.ringBell();



        // Airplane Test CODE

        Airplane myAirplane = new Airplane("Aeronca C-2", 6, 68574);
        System.out.println(myAirplane.getName());
        System.out.println(myAirplane.getWheels());
        System.out.println(myAirplane.getFlightID());
        myAirplane.move(80);
        myAirplane.turn();
        myAirplane.brake();
        myAirplane.takenFlight();
    }
}