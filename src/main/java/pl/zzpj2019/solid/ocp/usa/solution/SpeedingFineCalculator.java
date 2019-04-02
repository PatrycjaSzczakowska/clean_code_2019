package pl.zzpj2019.solid.ocp.usa.solution;

public class SpeedingFineCalculator {
    public double calculateSpeedLimitFine(SpeedingPolicy speedingPolicy, int speed) {
        return speedingPolicy.calculateFine(speed);
    }
};
