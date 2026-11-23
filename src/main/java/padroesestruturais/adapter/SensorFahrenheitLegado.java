package padroesestruturais.adapter;

public class SensorFahrenheitLegado {

    private final double leituraFahrenheit;

    public SensorFahrenheitLegado(double leituraFahrenheit) {
        this.leituraFahrenheit = leituraFahrenheit;
    }

    public double lerFahrenheit() {
        return leituraFahrenheit;
    }
}
