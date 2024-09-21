package master.one_one_x.one_one_one;

import java.util.Scanner;

public class Calculadora {

    public static float sumar(float a, float b) {
        return a + b;
    }

    public static float restar(float a, float b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        return a / b;
    }

    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Selecciona una opción:");
            System.out.println("1. Sumar (float)");
            System.out.println("2. Restar (float)");
            System.out.println("3. Multiplicar (int)");
            System.out.println("4. Dividir (int)");
            System.out.println("5. Salir");
            int option = scanner.nextInt();

            if (option == 5) {
                System.out.println("Saliendo...");
                break;
            }

            System.out.println("Escribe el primer número:");
            float num1 = scanner.nextFloat();
            System.out.println("Escribe el segundo número:");
            float num2 = scanner.nextFloat();

            // Initialize the result for float and int operations accordingly
            float resultFloat = 0;
            int resultInt = 0;

            switch (option) {
                case 1:
                    resultFloat = sumar(num1, num2);
                    System.out.println("Resultado: " + resultFloat);
                    break;
                case 2:
                    resultFloat = restar(num1, num2);
                    System.out.println("Resultado: " + resultFloat);
                    break;
                case 3:
                    resultInt = multiplicar((int) num1, (int) num2);
                    System.out.println("Resultado: " + resultInt);
                    break;
                case 4:
                    resultInt = dividir((int) num1, (int) num2);
                    System.out.println("Resultado: " + resultInt);
                    break;
                default:
                    System.out.println("Opción inválida. Inténtelo de nuevo.");
                    continue;
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        calculate();
    }
}
