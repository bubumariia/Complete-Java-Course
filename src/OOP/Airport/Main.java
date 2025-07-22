package OOP.Airport;

public class Main {
    public static void main(String[] args){
        FlightAttendants flightAttendant = new FlightAttendants();
        flightAttendant.name = "Gloria";
        FlightAttendants flightAttendant1 = new FlightAttendants();
        flightAttendant1.name = "Daisy";

        Pilot pilot = new Pilot();
        pilot.name = "Sam";
        Pilot pilot1 = new Pilot();
        pilot1.name = "John";

        LandingStrip landingStrip = new LandingStrip();
        landingStrip.name = "LS1";

        Place place = new Place();
        place.name = "P1";
        Place place1 = new Place();
        place1.name = "P2";


        Flight flight = new Flight();
        flight.date = "12/12/2020";
        flight.from = place;
        flight.destination = place1;

        Plane plane = new Plane();
        plane.flight = flight;
        plane.flightAttendants = new FlightAttendants[]{
                flightAttendant,
                flightAttendant1};
        plane.pilots = new Pilot[]{pilot};
        plane.model = "Plane1";
        plane.showDetailsAboutThePlane();



    }
}
