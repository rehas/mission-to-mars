public class U2 extends Rocket {
    public U2() {
        super(18, 120, 29);
    }

    @Override
    public boolean launch() {
        double probabilityOfExplosion = 0.04 * (currentWeight / maxWeight);

        double chance  = Math.random();

        if(chance >= probabilityOfExplosion ){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean land() {
        double probabilityOfExplosion = 0.08 * (currentWeight/maxWeight);
        double chance = Math.random();

        if(chance >= probabilityOfExplosion){
            return true;
        }else{
            return false;
        }
    }
}
