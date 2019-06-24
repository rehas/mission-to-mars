import java.io.File;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, Mars");

//        testForFile();

        RunForPhaseU1(1);
        RunForPhaseU1(2);

        RunForPhaseU2(1);
        RunForPhaseU2(2);
    }

    public static void testForFile(){
        Simulation sm = new Simulation();

        File test1 = new File("/Users/reha/Documents/playground/MissionToMars/src/resources/phase-1.txt");

        ArrayList<Item> a = sm.loadItems(test1);

        for (Item i : a){
            System.out.println(i.name + " " + Integer.toString( i.weight));
        }

        ArrayList<U1> U1Fleet = sm.loadU1(a);

        for (Rocket u1 : U1Fleet){

            System.out.println(u1.currentWeight + " " + u1.maxWeight);
        }

        float totalCostU1 = sm.runSimulation(U1Fleet);
        float totalCostU11 = sm.runSimulation(U1Fleet);

        System.out.println(totalCostU1);
        System.out.println(totalCostU11);


    }

    public static void RunForPhaseU1(int phase){
        Simulation sm = new Simulation();

        File test1 = new File("/Users/reha/Documents/playground/MissionToMars/src/resources/phase-"+phase+".txt");

        ArrayList<Item> a = sm.loadItems(test1);

//        for (Item i : a){
//            System.out.println(i.name + " " + Integer.toString( i.weight));
//        }

        ArrayList<U1> U1Fleet = sm.loadU1(a);

        for (Rocket u1 : U1Fleet){

            System.out.println(u1.currentWeight + " " + u1.maxWeight);
        }

        float totalCostU1 = sm.runSimulation(U1Fleet);
        float totalCostU11 = sm.runSimulation(U1Fleet);

        System.out.println(totalCostU1);
        System.out.println(totalCostU11);
    }

    public static void RunForPhaseU2(int phase){
        Simulation sm = new Simulation();

        File test1 = new File("/Users/reha/Documents/playground/MissionToMars/src/resources/phase-"+phase+".txt");

        ArrayList<Item> a = sm.loadItems(test1);

//        for (Item i : a){
//            System.out.println(i.name + " " + Integer.toString( i.weight));
//        }

        ArrayList<U2> U2Fleet = sm.loadU2(a);

        for (Rocket u2 : U2Fleet){

            System.out.println(u2.currentWeight + " " + u2.maxWeight);
        }

        float totalCostU1 = sm.runSimulation(U2Fleet);
        float totalCostU11 = sm.runSimulation(U2Fleet);

        System.out.println(totalCostU1);
        System.out.println(totalCostU11);
    }



}
