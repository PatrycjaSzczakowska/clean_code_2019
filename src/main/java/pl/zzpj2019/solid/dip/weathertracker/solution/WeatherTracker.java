package pl.zzpj2019.solid.dip.weathertracker.solution;

public class WeatherTracker {
    private String currentConditions;
    private WeatherAlertGenerator weatherAlertGenerator;

    public WeatherTracker(final WeatherAlertGenerator weatherAlertGenerator) {
        this.weatherAlertGenerator = weatherAlertGenerator;
    }

    public void setCurrentConditions(String currentConditions) {
        this.currentConditions = currentConditions;
        weatherAlertGenerator.generateAlert(currentConditions);
    }
}
