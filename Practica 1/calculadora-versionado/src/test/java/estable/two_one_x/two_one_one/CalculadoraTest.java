package estable.two_one_x.two_one_one;

import estable.two_one_x.two_one_one.Calculadora;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    private ByteArrayOutputStream outContent;
    private PrintStream originalOut;
    private InputStream originalIn;

    @BeforeEach
    public void setUp() {
        // Capture system output
        outContent = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Capture system input
        originalIn = System.in;
    }

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
        assertEquals(1.8, Math.round(Calculadora.multiplicar(1.2, 1.5) * 10000.0) / 10000.0);
        assertEquals(-11.745, Math.round(Calculadora.multiplicar(-2.7, 4.35) * 10000.0) / 10000.0);
    }

    @Test
    public void testDividir() {
        assertEquals(3.0283, Math.round(Calculadora.dividir(8.34, 2.754) * 10000.0) / 10000.0);
        assertEquals(-0.2925, Math.round(Calculadora.dividir(-74.369, 254.22) * 10000.0) / 10000.0);
    }

    @Test
    public void testExponenciacion() {
        assertEquals(19.8578, Math.round(Calculadora.exponentiation(2.378, 3.45) * 10000.0) / 10000.0);
        assertEquals(0.2421, Math.round(Calculadora.exponentiation(1.784, -2.45) * 10000.0) / 10000.0);
    }

    @Test
    public void testCalculate() {
        assertEquals(5, Calculadora.sumar(2, 3));
        assertEquals(0, Calculadora.restar(3, 3));
        assertEquals(9, Calculadora.multiplicar(3, 3));
        assertEquals(1, Calculadora.dividir(3, 3));
    }

    @Test
    public void testCalculateSuma() {
        String userInput = "1\n2,0\n3,0\n6\n";
        System.setIn(new ByteArrayInputStream(userInput.getBytes()));

        Calculadora.calculateWithScanner(new Scanner(System.in));

        String expectedOutput = "Selecciona una opción:\n" +
                "1. Suma\n" +
                "2. Resta\n" +
                "3. Multiplicación\n" +
                "4. División\n" +
                "5. Exponienciación\n" +
                "6. Salir\n" +
                "Escribe el primer número:\n" +
                "Escribe el segundo número:\n" +
                "Resultado: 5.0\n" +
                "Selecciona una opción:\n" +
                "1. Suma\n" +
                "2. Resta\n" +
                "3. Multiplicación\n" +
                "4. División\n" +
                "5. Exponienciación\n" +
                "6. Salir\n" +
                "Saliendo...\n";
        assertEquals(expectedOutput, outContent.toString().replace("\r", ""));
    }

    @Test
    public void testCalculateResta() {
        String userInput = "2\n5,0\n3,0\n6\n";
        System.setIn(new ByteArrayInputStream(userInput.getBytes()));

        Calculadora.calculateWithScanner(new Scanner(System.in));

        String expectedOutput = "Selecciona una opción:\n" +
                "1. Suma\n" +
                "2. Resta\n" +
                "3. Multiplicación\n" +
                "4. División\n" +
                "5. Exponienciación\n" +
                "6. Salir\n" +
                "Escribe el primer número:\n" +
                "Escribe el segundo número:\n" +
                "Resultado: 2.0\n" +
                "Selecciona una opción:\n" +
                "1. Suma\n" +
                "2. Resta\n" +
                "3. Multiplicación\n" +
                "4. División\n" +
                "5. Exponienciación\n" +
                "6. Salir\n" +
                "Saliendo...\n";
        assertEquals(expectedOutput, outContent.toString().replace("\r", ""));
    }

    @Test
    public void testCalculateMultiplicacion() {
        String userInput = "3\n3,0\n4,0\n6\n";
        System.setIn(new ByteArrayInputStream(userInput.getBytes()));

        Calculadora.calculateWithScanner(new Scanner(System.in));

        String expectedOutput = "Selecciona una opción:\n" +
                "1. Suma\n" +
                "2. Resta\n" +
                "3. Multiplicación\n" +
                "4. División\n" +
                "5. Exponienciación\n" +
                "6. Salir\n" +
                "Escribe el primer número:\n" +
                "Escribe el segundo número:\n" +
                "Resultado: 12.0\n" +
                "Selecciona una opción:\n" +
                "1. Suma\n" +
                "2. Resta\n" +
                "3. Multiplicación\n" +
                "4. División\n" +
                "5. Exponienciación\n" +
                "6. Salir\n" +
                "Saliendo...\n";
        assertEquals(expectedOutput, outContent.toString().replace("\r", ""));
    }

    @Test
    public void testCalculateDivision() {
        String userInput = "4\n10,0\n2,0\n6\n";
        System.setIn(new ByteArrayInputStream(userInput.getBytes()));

        Calculadora.calculateWithScanner(new Scanner(System.in));

        String expectedOutput = "Selecciona una opción:\n" +
                "1. Suma\n" +
                "2. Resta\n" +
                "3. Multiplicación\n" +
                "4. División\n" +
                "5. Exponienciación\n" +
                "6. Salir\n" +
                "Escribe el primer número:\n" +
                "Escribe el segundo número:\n" +
                "Resultado: 5.0\n" +
                "Selecciona una opción:\n" +
                "1. Suma\n" +
                "2. Resta\n" +
                "3. Multiplicación\n" +
                "4. División\n" +
                "5. Exponienciación\n" +
                "6. Salir\n" +
                "Saliendo...\n";
        assertEquals(expectedOutput, outContent.toString().replace("\r", ""));
    }

    @Test
    public void testCalculateExponenciacion() {
        String userInput = "5\n2,0\n3,0\n6\n";
        System.setIn(new ByteArrayInputStream(userInput.getBytes()));

        Calculadora.calculateWithScanner(new Scanner(System.in));

        String expectedOutput = "Selecciona una opción:\n" +
                "1. Suma\n" +
                "2. Resta\n" +
                "3. Multiplicación\n" +
                "4. División\n" +
                "5. Exponienciación\n" +
                "6. Salir\n" +
                "Escribe el primer número:\n" +
                "Escribe el segundo número:\n" +
                "Resultado: 8.0\n" +
                "Selecciona una opción:\n" +
                "1. Suma\n" +
                "2. Resta\n" +
                "3. Multiplicación\n" +
                "4. División\n" +
                "5. Exponienciación\n" +
                "6. Salir\n" +
                "Saliendo...\n";
        assertEquals(expectedOutput, outContent.toString().replace("\r", ""));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }
}
