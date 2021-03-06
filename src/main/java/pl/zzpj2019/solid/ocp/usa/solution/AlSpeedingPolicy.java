package pl.zzpj2019.solid.ocp.usa.solution;

public class AlSpeedingPolicy implements SpeedingPolicy {
    private static final int SPEED_LIMIT = 110;

    @Override
    public double calculateFine(int speed) {
        if (speed > SPEED_LIMIT)
            return speed - (double) SPEED_LIMIT;
        return 0.0;
    }
}
