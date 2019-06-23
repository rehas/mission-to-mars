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
        return new ArrayList<>();
    }

    public ArrayList<U2> loadU2 (ArrayList<Item> itemsForU1){
        return new ArrayList<>();
    }
}
