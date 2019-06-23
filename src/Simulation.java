import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Simulation {

    private Integer totalBudget;

    public void updateBudget(Rocket r){
        totalBudget += r.cost;
    }

    public ArrayList<Item> loadItems (File inventory){
        return new ArrayList<>();
    }

    public ArrayList<U1> loadU1 (ArrayList<Item> itemsForU1){
        return new ArrayList<>();
    }

    public ArrayList<U2> loadU2 (ArrayList<Item> itemsForU1){
        return new ArrayList<>();
    }
}
