import java.io.*;
import java.util.ArrayList;

public class Simulation {


    private Integer totalBudget;

    public void updateBudget(Rocket r){
        totalBudget += r.cost;
    }

    public ArrayList<Item> loadItems (File inventory){
        ArrayList result = new ArrayList();
        try {
            BufferedReader reader =
                    new BufferedReader(new FileReader(inventory.getPath()));

            String line = reader.readLine();

            while(line != null){
                Item newItem = parseLineToItem(line);
                result.add(newItem);
                line = reader.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        return result;
    }

    private Item parseLineToItem(String line) {
        String[] data =line.split("=");

        return new Item(data[0], Integer.parseInt(data[1]));

    }

    public ArrayList<U1> loadU1 (ArrayList<Item> itemsForU1){

        U1 ship = new U1();
        ArrayList<U1> fleetU1 = new ArrayList<U1>();
        for (int i = 0; i< itemsForU1.size(); i++ ){

            Item it = itemsForU1.get(i);

            if(!ship.canCarry(it)){
                fleetU1.add(ship);
                ship = new U1();
                i--;
            }else{
                ship.carry(it);
            }
        }
        return fleetU1;
    }

    public ArrayList<U2> loadU2 (ArrayList<Item> itemsForU2){
        U2 ship = new U2();
        ArrayList<U2> fleetU2 = new ArrayList<U2>();
        for (int i = 0; i< itemsForU2.size(); i++ ){

            Item it = itemsForU2.get(i);


            if(!ship.canCarry(it)){
                fleetU2.add(ship);
                ship = new U2();
                i--;
            }else{
                ship.carry(it);
            }
        }
        return fleetU2;
    }

    public <T extends Rocket> float runSimulation(ArrayList< T> rocketsToTest){
        float budget = 0;
        int count = 1;

        for (int i =0; i<rocketsToTest.size(); i++){
            T r = rocketsToTest.get(i);

            boolean isThisRocketSuccessful = r.launch() && r.land();

            if(!isThisRocketSuccessful){
                count++;
                System.out.println("Rocket at index ["+i+"] crashed");
                i--;
            }else{
                count =1;
            }


            budget += count * r.cost;

        }

        return budget;
    }
}
