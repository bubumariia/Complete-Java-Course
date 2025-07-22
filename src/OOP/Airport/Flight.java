package OOP.Airport;

public class Flight {
    public String date;
    public Place from;
    public Place destination;
    public Flight flight;

    public String showDataAboutFlight(){
        StringBuilder stringBuilder = new StringBuilder("Date: "+ date);
        stringBuilder.append(System.lineSeparator());
        stringBuilder.append("From " + from.name);
        stringBuilder.append(System.lineSeparator() +"Destination "+ destination.name);
        return stringBuilder.toString();
    }
}
