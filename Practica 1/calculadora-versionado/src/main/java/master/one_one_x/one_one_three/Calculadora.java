package master.one_one_x.one_one_three;

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

    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Selecciona una opción:");
            System.out.println("1. Sumar (nº real)");
            System.out.println("2. Restar (nº real)");
            System.out.println("3. Multiplicar (nº real)");
            System.out.println("4. Dividir (nº real)");
            System.out.println("5. Salir");
            int option = scanner.nextInt();

            if (option == 5) {
                System.out.println("Saliendo...");
                break;
            }

            System.out.println("Escribe el primer número:");
            double num1 = scanner.nextDouble();
            System.out.println("Escribe el segundo número:");
            double num2 = scanner.nextDouble();

            // Initialize the result for double and int operations accordingly
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

                default:
                    System.out.println("Opción inválida. Inténtelo de nuevo.");
                    continue;
            }
            System.out.println("Resultado: " + resultDouble);
        }
        scanner.close();
    }

    public static void main(String[] args) {
        calculate();
    }
}
