package master.one_one_x.one_one_one;

import master.one_one_x.one_one_one.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraTest {

    @Test
    public void testSumar() {
        assertEquals(2.5, Math.round(Calculadora.sumar(1.9, 0.6) * 10000.0) / 10000.0);
        assertEquals(-0.12, Math.round(Calculadora.sumar(-1.8, 1.68) * 10000.0) / 10000.0);
    }

    @Test
    public void testRestar() {
        assertEquals(3.37, Math.round(Calculadora.restar(2.24, -1.13) * 10000.0) / 10000.0);
        assertEquals(-7.21, Math.round(Calculadora.restar(-1.47, 5.74) * 10000.0) / 10000.0);
    }


    @Test
    public void testMultiplicar() {
        assertEquals(6, Calculadora.multiplicar(2, 3));
        assertEquals(-6, Calculadora.multiplicar(2, -3));
    }

    @Test
    public void testDividir() {
        assertEquals(2, Calculadora.dividir(6, 3));
        assertThrows(ArithmeticException.class, () -> Calculadora.dividir(6, 0));
    }

    @Test
    public void testCalculate() {
        // Simulating user interaction in a real test environment would require additional setup
        // Here, we could test the individual methods used in calculate
        assertEquals(5, Calculadora.sumar(2, 3));
        assertEquals(0, Calculadora.restar(3, 3));
        assertEquals(9, Calculadora.multiplicar(3, 3));
        assertEquals(1, Calculadora.dividir(3, 3));
    }
}
