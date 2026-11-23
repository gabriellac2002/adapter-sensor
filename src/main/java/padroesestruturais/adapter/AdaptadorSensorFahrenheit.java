package padroesestruturais.adapter;

public class AdaptadorSensorFahrenheit implements SensorCelsius {

    private final SensorFahrenheitLegado sensor;

    public AdaptadorSensorFahrenheit(SensorFahrenheitLegado sensor) {
        this.sensor = sensor;
    }

    @Override
    public double lerTemperatura() {
        return (sensor.lerFahrenheit() - 32) * 5 / 9;
    }
}
