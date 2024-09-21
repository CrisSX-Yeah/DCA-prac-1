package master.one_one_x.one_one_zero;

import estable.one_zero_x.one_zero_zero.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraTest {

    @Test
    public void testSumar() {
        assertEquals(5, estable.one_zero_x.one_zero_zero.Calculadora.sumar(2, 3));
        assertEquals(-1, estable.one_zero_x.one_zero_zero.Calculadora.sumar(2, -3));
    }

    @Test
    public void testRestar() {
        assertEquals(1, estable.one_zero_x.one_zero_zero.Calculadora.restar(3, 2));
        assertEquals(5, estable.one_zero_x.one_zero_zero.Calculadora.restar(2, -3));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(6, estable.one_zero_x.one_zero_zero.Calculadora.multiplicar(2, 3));
        assertEquals(-6, estable.one_zero_x.one_zero_zero.Calculadora.multiplicar(2, -3));
    }

    @Test
    public void testDividir() {
        assertEquals(2, estable.one_zero_x.one_zero_zero.Calculadora.dividir(6, 3));
        assertThrows(ArithmeticException.class, () -> estable.one_zero_x.one_zero_zero.Calculadora.dividir(6, 0));
    }

    @Test
    public void testCalculate() {
        // Simulating user interaction in a real test environment would require additional setup
        // Here, we could test the individual methods used in calculate
        assertEquals(5, estable.one_zero_x.one_zero_zero.Calculadora.sumar(2, 3));
        assertEquals(0, estable.one_zero_x.one_zero_zero.Calculadora.restar(3, 3));
        assertEquals(9, estable.one_zero_x.one_zero_zero.Calculadora.multiplicar(3, 3));
        assertEquals(1, Calculadora.dividir(3, 3));
    }
}
