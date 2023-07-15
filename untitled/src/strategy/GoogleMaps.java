package strategy;

public class GoogleMaps {

    public void findPath(String mode, String from, String to) {
        PathCalculatorStrategy pathType = PathCalculatorFactory.getPathCalculatorMode(mode);

        pathType.findPath(from, to);
    }
}
