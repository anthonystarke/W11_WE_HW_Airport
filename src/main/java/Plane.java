import java.util.ArrayList;

public class Plane {

    private PlaneType type;
    private String airline;
    private ArrayList<Passenger> passengersCollection;

    public Plane(){

    }

    public Plane(PlaneType type,String airline){
        this.type = type;
        this.airline = airline;
        this.passengersCollection = new ArrayList<>();
    }

    public PlaneType returnType(){
        return this.type;
    }

    public String returnAirline(){
        return this.airline;
    }

    public void addPassenger(Passenger person){
        passengersCollection.add(person);
    }

    public void removePassenger(Passenger person){
        passengersCollection.remove(person);
    }

    public int passengerCount(){
        return passengersCollection.size();
    }
}
