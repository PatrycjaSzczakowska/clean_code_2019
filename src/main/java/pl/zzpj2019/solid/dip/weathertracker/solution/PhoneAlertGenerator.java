package pl.zzpj2019.solid.dip.weathertracker.solution;

public class PhoneAlertGenerator implements WeatherAlertGenerator {
    @Override
    public void generateAlert(String weatherConditions) {
        String alert = "It is " + weatherConditions;
        System.out.println(alert);
    }
}
