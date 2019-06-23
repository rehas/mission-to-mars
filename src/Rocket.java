public class Rocket implements SpaceShip {

    protected int cost;
    protected final int baseWeight;
    protected final int maxWeight;
    protected int currentWeight;

    public Rocket(int baseWeight, int cost, int maxWeight) {
        this.baseWeight = baseWeight;
        this.cost = cost;
        this.maxWeight = maxWeight;
        this.currentWeight = baseWeight;
    }

    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean canCarry(Item item) {
        if(currentWeight + item.weight <= maxWeight){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean carry(Item item) {
        if(canCarry(item)){
            currentWeight += item.weight;
            return true;
        }else {
            return false;
        }
    }

}
