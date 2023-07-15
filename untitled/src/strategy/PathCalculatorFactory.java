package strategy;

public class PathCalculatorFactory {

    public static WalkPathCalculator walkPath = new WalkPathCalculator();
    public static BikePathCalculator bikePath = new BikePathCalculator();
    public static CarPathCalculator carPath = new CarPathCalculator();

    public static PathCalculatorStrategy getPathCalculatorMode(String mode) {
        if(mode.equals("Walk")) {
            return walkPath;
        } else if(mode.equals(bikePath)) {
            return bikePath;
        } else {
            return carPath;
        }
    }
}
