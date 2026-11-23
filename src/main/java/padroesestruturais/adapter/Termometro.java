package padroesestruturais.adapter;

import java.util.Locale;

public class Termometro {

    private final SensorCelsius sensor;

    public Termometro(SensorCelsius sensor) {
        this.sensor = sensor;
    }

    public String exibir() {
        return String.format(Locale.US, "Temperatura: %.1f C", sensor.lerTemperatura());
    }
}
