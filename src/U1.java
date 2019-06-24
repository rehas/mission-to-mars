public class U1 extends Rocket {
    public U1() {
        super(10, 100, 18);
    }

    @Override
    public boolean launch() {
        double probabilityOfExplosion = 0.05 * (currentWeight * 1.00 / maxWeight);

        double chance  = Math.random();

        if(chance >= probabilityOfExplosion ){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean land() {
        double probabilityOfExplosion = 0.01 * (currentWeight *  1.00 /maxWeight);
        double chance = Math.random();

        if(chance >= probabilityOfExplosion){
            return true;
        }else{
            return false;
        }
    }
}
