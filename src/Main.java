import java.io.File;
import java.util.ArrayList;

public class Main {

    private static File phase1 = new File("/Users/reha/Documents/playground/MissionToMars/src/resources/phase-1.txt");

    private static File phase2 = new File("/Users/reha/Documents/playground/MissionToMars/src/resources/phase-2.txt");


    public static void main(String[] args) {

        System.out.println("Hello, Mars\n\n");

        RunForU1(false);
//        RunForU1(true);

        RunForU2(false);
//        RunForU2(true);
    }

    public static void RunForU1(boolean verbose){
        System.out.println("Simulation For U1 Type Rocket log type: " + (verbose?"verbose" : "lean") );
        Simulation smPhase1 = new Simulation();

        ArrayList<Item> itemsPhase1 = smPhase1.loadItems(phase1);

        ArrayList<U1> U1FleetPhase1 = smPhase1.loadU1(itemsPhase1);

        float totalCostU1Phase1 = smPhase1.runSimulation(U1FleetPhase1);

        System.out.println("U1 -> Phase1 Cost: " + totalCostU1Phase1);

        Simulation smPhase2 = new Simulation();

        ArrayList<Item> itemsPhase2 = smPhase2.loadItems(phase2);

        ArrayList<U1> U1FleetPhase2 = smPhase2.loadU1(itemsPhase2);

        float totalCostU1Phase2 = smPhase2.runSimulation(U1FleetPhase2);

        System.out.println("U1 -> Phase2 Cost: " + totalCostU1Phase2);

        if(verbose){
            verboseModeLogger(itemsPhase1, U1FleetPhase1, itemsPhase2, U1FleetPhase2);

        }

    }


    public static void RunForU2(boolean verbose){
        System.out.println("Simulation For U2 Type Rocket log type: " + (verbose?"verbose" : "lean") );

        Simulation smPhase1 = new Simulation();

        ArrayList<Item> itemsPhase1 = smPhase1.loadItems(phase1);

        ArrayList<U2> U2FleetPhase1 = smPhase1.loadU2(itemsPhase1);

        float totalCostU2Phase1 = smPhase1.runSimulation(U2FleetPhase1);

        System.out.println("U2 -> Phase1 Cost: " + totalCostU2Phase1);

        Simulation smPhase2 = new Simulation();

        ArrayList<Item> itemsPhase2 = smPhase2.loadItems(phase2);

        ArrayList<U2> U2FleetPhase2 = smPhase2.loadU2(itemsPhase2);

        float totalCostU2Phase2 = smPhase2.runSimulation(U2FleetPhase2);

        System.out.println("U2 -> Phase2 Cost: " + totalCostU2Phase2);

        if(verbose){
            verboseModeLogger(itemsPhase1, U2FleetPhase1, itemsPhase2, U2FleetPhase2);

        }

    }

    private  static <T extends Rocket> void verboseModeLogger(ArrayList<Item> itemsPhase1,
                                          ArrayList<T> u1FleetPhase1,
                                          ArrayList<Item> itemsPhase2,
                                          ArrayList<T> u1FleetPhase2)
    {
        System.out.println("Verbose Mode \n\n");

        System.out.println("Items Phase1");
        for (Item i : itemsPhase1){
            System.out.println(i.name + " " + Integer.toString( i.weight));
        }

        for (Rocket u1 : u1FleetPhase1){

            System.out.println(u1.currentWeight + " " + u1.maxWeight);
        }

        for (Item i : itemsPhase2){
            System.out.println(i.name + " " + Integer.toString( i.weight));
        }

        for (Rocket u1 : u1FleetPhase2){

            System.out.println(u1.currentWeight + " " + u1.maxWeight);
        }

        System.out.println("Verbose Mode End \n\n");
    }
    public static void testForFile(){
        Simulation sm = new Simulation();

        ArrayList<Item> a = sm.loadItems(phase1);

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

}
