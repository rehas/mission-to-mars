import java.io.File;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, Mars");

        testForFile();

    }

    public static void testForFile(){
        Simulation sm = new Simulation();

        File test1 = new File("/Users/reha/Documents/playground/MissionToMars/src/resources/phase-1.txt");

        ArrayList<Item> a = sm.loadItems(test1);

        for (Item i : a){
            System.out.println(i.name + " " + Integer.toString( i.weight));
        }
    }
}
