package estable.two_two_x.two_two_zero;

import java.util.Scanner;

public class Calculadora {

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        b = Math.round(b * 1000000.0) / 1000000.0;
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    public static double exponentiation(double a, double b) {
        return Math.pow(a, b);
    }

    // Modified method to accept a Scanner as a parameter
    public static void calculateWithScanner(Scanner scanner) {
        while (true) {
            System.out.println("Selecciona una opción:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Exponienciación");
            System.out.println("6. Salir");
            int option = scanner.nextInt();

            if (option == 6) {
                System.out.println("Saliendo...");
                break;
            }

            System.out.println("Escribe el primer número:");
            double num1 = scanner.nextDouble();
            System.out.println("Escribe el segundo número:");
            double num2 = scanner.nextDouble();

            double resultDouble = 0;

            switch (option) {
                case 1:
                    resultDouble = sumar(num1, num2);
                    break;
                case 2:
                    resultDouble = restar(num1, num2);
                    break;
                case 3:
                    resultDouble = multiplicar(num1, num2);
                    break;
                case 4:
                    try {
                        resultDouble = dividir(num1, num2);
                    } catch (ArithmeticException e) {
                        System.out.println("No se puede dividir entre cero. Inténtelo de nuevo.");
                        continue;
                    }
                    break;
                case 5:
                    resultDouble = exponentiation(num1, num2);
                    break;
                default:
                    System.out.println("Opción inválida. Inténtelo de nuevo.");
                    continue;
            }
            System.out.println("Resultado: " + resultDouble);
        }
    }

    public static void main(String[] args) {
        calculateWithScanner(new Scanner(System.in));
    }
}
