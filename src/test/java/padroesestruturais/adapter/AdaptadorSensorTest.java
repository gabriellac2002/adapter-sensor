package padroesestruturais.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdaptadorSensorTest {

    @Test
    void deveConverterPontoDeEbulicao() {
        SensorCelsius sensor = new AdaptadorSensorFahrenheit(new SensorFahrenheitLegado(212.0));
        assertEquals(100.0, sensor.lerTemperatura(), 0.001);
    }

    @Test
    void deveConverterPontoDeCongelamento() {
        SensorCelsius sensor = new AdaptadorSensorFahrenheit(new SensorFahrenheitLegado(32.0));
        assertEquals(0.0, sensor.lerTemperatura(), 0.001);
    }

    @Test
    void deveConverterTemperaturaNegativa() {
        SensorCelsius sensor = new AdaptadorSensorFahrenheit(new SensorFahrenheitLegado(-40.0));
        assertEquals(-40.0, sensor.lerTemperatura(), 0.001);
    }

    @Test
    void clienteDeveUsarAdaptadorComoSensorCelsius() {
        Termometro termometro = new Termometro(new AdaptadorSensorFahrenheit(new SensorFahrenheitLegado(98.6)));
        assertEquals("Temperatura: 37.0 C", termometro.exibir());
    }
}
