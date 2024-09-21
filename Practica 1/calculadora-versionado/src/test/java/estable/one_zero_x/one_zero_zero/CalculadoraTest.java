package estable.one_zero_x.one_zero_zero;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void testSumar() {
        assertEquals(5, Calculadora.sumar(2, 3));
        assertEquals(-1, Calculadora.sumar(2, -3));
    }

    @Test
    public void testRestar() {
        assertEquals(1, Calculadora.restar(3, 2));
        assertEquals(5, Calculadora.restar(2, -3));
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
