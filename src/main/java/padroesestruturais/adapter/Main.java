package padroesestruturais.adapter;

public class Main {

    public static void main(String[] args) {
        SensorFahrenheitLegado legado = new SensorFahrenheitLegado(98.6);
        Termometro termometro = new Termometro(new AdaptadorSensorFahrenheit(legado));
        System.out.println(termometro.exibir());
    }
}
