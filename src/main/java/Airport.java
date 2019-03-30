import java.util.ArrayList;

public class Airport {

    private ArrayList<Hanger> hangerCollection;
    private String airportCode;

    public Airport(String code){
        this.hangerCollection = new ArrayList<>();
        this.airportCode = code;
    }

    public String getCode(){
        return this.airportCode;
    }

    public int hangerCount(){
        return this.hangerCollection.size();
    }

    public void addHanger(Hanger hanger){
        this.hangerCollection.add(hanger);
    }

    public Hanger firstAvailableHanger(){

        Hanger returnHanger = new Hanger();
        for (Hanger hanger :this.hangerCollection){

            if(hanger.hasSpace()){
                returnHanger = hanger;
                break;
            }
        }
        return returnHanger;
    }

    public Hanger getHanger(){
        return firstAvailableHanger();
    }

    public void addPlane(Plane plane){
        Hanger newHanger;

        newHanger = getHanger();
        newHanger.addPlane(plane);

    }

    public int returnAllPlaneCount(){

        int planeCount = 0;

        for(Hanger hanger: this.hangerCollection){
            planeCount += hanger.returnPlaneCount();
        }
        return planeCount;
    }

    public int planeCountFromHanger(Hanger hanger){

        Hanger newHanger;
        newHanger = this.hangerCollection.get(this.hangerCollection.indexOf(hanger));
        return newHanger.returnPlaneCount();
    }

    public Plane getAvailablePlane(){
        Plane newPlane = new Plane();

        for (Hanger hanger: this.hangerCollection){
            if(hanger.returnPlaneCount() > 0){
                newPlane = hanger.getPlane();
            }
        }
        return newPlane;
    }

    public Plane getPlane(){
        return getAvailablePlane();
    }

    public boolean sellTicket(Passenger person){
        Plane plane = new Plane();
        plane = getPlane();

        if(plane.returnType() != null){

            plane.addPassenger(person);
            return true;
        }

        return false;
    }

}
