public abstract class Rocket implements SpaceShip {

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

    public abstract boolean launch();

    public abstract boolean land() ;

    @Override
    public boolean canCarry(Item item) {
        if(currentWeight + item.weight /1000 <= maxWeight){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean carry(Item item) {
        if(canCarry(item)){
            currentWeight += item.weight /1000;
            return true;
        }else {
            return false;
        }
    }

}
