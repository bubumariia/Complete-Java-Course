package OOP.Airport;

public class Plane {
    public String model;
    public Pilot[] pilots;
    public FlightAttendants[] flightAttendants;
    public Flight flight;


    public void showDetailsAboutThePlane(){
        System.out.println("Model: "+model);
        System.out.println("Flight: "+flight.showDataAboutFlight());
        for (Pilot pilot: pilots){
            System.out.println("Pilot's name is "+pilot.name);
        }

        for (FlightAttendants flightAttendant: flightAttendants){
            System.out.println(flightAttendant.name);
        }


    }

}
