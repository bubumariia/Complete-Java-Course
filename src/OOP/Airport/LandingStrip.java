package OOP.Airport;

public class LandingStrip {
    public String location;
    public String name;

    public void landPlane(Plane plane){
        System.out.println("Plane " + plane.model + " is landing");
        plane.showDetailsAboutThePlane();
    }

}
