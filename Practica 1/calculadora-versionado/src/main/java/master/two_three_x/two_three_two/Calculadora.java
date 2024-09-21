package master.two_three_x.two_three_two;

import java.util.Scanner;

public class Calculadora {

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b, int precision) {
        return Math.round(a * b * Math.pow(10, precision)) / Math.pow(10, precision);
    }

    public static double dividir(double a, double b, int precision) {
        b = Math.round(b * 1000000.0) / 1000000.0;
        if (b == 0) {
            throw new ArithmeticException();
        }
        return Math.round(a / b * Math.pow(10, precision)) / Math.pow(10, precision);
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
            int precision = 0;

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
                    System.out.println("Establece la precisión decimal con la que quieres ver el resultado:");
                    precision = scanner.nextInt();
                    resultDouble = multiplicar(num1, num2, precision);
                    break;
                case 4:
                    try {
                        resultDouble = dividir(num1, num2, 2);
                        System.out.println("Establece la precisión decimal con la que quieres ver el resultado:");
                        precision = scanner.nextInt();
                        resultDouble = dividir(num1, num2, precision);
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
