import java.util.ArrayList;

public class Hanger {

    private ArrayList<Plane> planeCollection;
    private int capacity;


    public Hanger(){
        planeCollection = new ArrayList<>();
        capacity = 2;
    }

    public boolean hasSpace(){
        if(this.capacity > this.planeCollection.size()){
            return true;
        }
        return false;
    }

    public void addPlane(Plane plane){
        planeCollection.add(plane);
    }

    public int returnPlaneCount(){
        return planeCollection.size();
    }

    public Plane getPlane(){
        return planeCollection.remove(0);
    }
}
