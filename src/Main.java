import java.io.File;
import java.util.ArrayList;

public class Main {

    private static File phase1 = new File("/Users/reha/Documents/playground/MissionToMars/src/resources/phase-1.txt");

    private static File phase2 = new File("/Users/reha/Documents/playground/MissionToMars/src/resources/phase-2.txt");


    public static void main(String[] args) {

        System.out.println("Hello, Mars");

//        testForFile();

        RunForU1();
//        RunForU1(2);

        RunForU2();
//        RunForU2(2);
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

    public static void RunForU1(){
        Simulation smPhase1 = new Simulation();

        ArrayList<Item> itemsPhase1 = smPhase1.loadItems(phase1);

//        for (Item i : a){
//            System.out.println(i.name + " " + Integer.toString( i.weight));
//        }

        ArrayList<U1> U1FleetPhase1 = smPhase1.loadU1(itemsPhase1);

//        for (Rocket u1 : U1FleetPhase1){
//
//            System.out.println(u1.currentWeight + " " + u1.maxWeight);
//        }

        float totalCostU1Phase1 = smPhase1.runSimulation(U1FleetPhase1);

        System.out.println("U1 -> Phase1: " + totalCostU1Phase1);

        Simulation smPhase2 = new Simulation();

        ArrayList<Item> itemsPhase2 = smPhase2.loadItems(phase2);

        ArrayList<U1> U1FleetPhase2 = smPhase2.loadU1(itemsPhase2);

        float totalCostU1Phase2 = smPhase2.runSimulation(U1FleetPhase2);

        System.out.println("U1 -> Phase2: " + totalCostU1Phase2);



    }

    public static void RunForU2(){
        Simulation smPhase1 = new Simulation();

        ArrayList<Item> itemsPhase1 = smPhase1.loadItems(phase1);

//        for (Item i : a){
//            System.out.println(i.name + " " + Integer.toString( i.weight));
//        }

        ArrayList<U2> U2FleetPhase1 = smPhase1.loadU2(itemsPhase1);

//        for (Rocket u2 : U2FleetPhase1){
//
//            System.out.println(u2.currentWeight + " " + u2.maxWeight);
//        }

        float totalCostU2Phase1 = smPhase1.runSimulation(U2FleetPhase1);

        System.out.println("U2 -> Phase1: " + totalCostU2Phase1);


        Simulation smPhase2 = new Simulation();

        ArrayList<Item> itemsPhase2 = smPhase2.loadItems(phase2);

        ArrayList<U1> U2FleetPhase2 = smPhase2.loadU1(itemsPhase2);

        float totalCostU2Phase2 = smPhase2.runSimulation(U2FleetPhase2);

        System.out.println("U2 -> Phase2: " + totalCostU2Phase2);


    }



}
