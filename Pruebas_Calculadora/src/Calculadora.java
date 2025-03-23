import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Operaciones operacion = new Operaciones();
        int opcion = 0;

        do {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1 - Sumar\n2 - Restar\n3 - Multiplicar\n4 - Dividir\n5 - Salir");
            System.out.print("\t-> ");

            try {
                opcion = sc.nextInt();

                if (opcion >= 1 && opcion <= 4) {

                    double[] numeros = pedirNumeros(sc);
                    double num1 = numeros[0];
                    double num2 = numeros[1];

                    switch (opcion) {
                        case 1:
                            System.out.println("Resultado = " + operacion.sumar(num1, num2));
                            break;
                        case 2:
                            System.out.println("Resultado = " + operacion.restar(num1, num2));
                            break;
                        case 3:
                            System.out.println("Resultado = " + operacion.multiplicar(num1, num2));
                            break;
                        case 4:
                            try {
                                System.out.println("Resultado = " + operacion.dividir(num1, num2));
                            } catch (ArithmeticException e) {
                                System.out.println("ERROR: " + e.getMessage());
                            }
                            break;
                    }
                } else if (opcion == 5) {
                    System.out.println("\nSaliendo...\n");
                } else {
                    System.out.println("Opción no válida. Intente de nuevo.");
                }

            } catch (InputMismatchException e) {
                System.out.println("ERROR: Debe ingresar un número válido.");
                sc.next();
            }

        } while (opcion != 5);

        sc.close();
    }


    /**
     * Función para pedir los números por teclado. Error de input controlado
     * @param sc
     * @return
     */
    private static double[] pedirNumeros(Scanner sc) {
        double[] numeros = new double[2];

        for (int i = 0; i < 2; i++) {
            boolean entradaValida = false;  // Variable de control

            while (!entradaValida) {
                try {
                    System.out.print((i + 1) + "º número: ");
                    numeros[i] = sc.nextDouble();
                    entradaValida = true;  // Cambiamos la variable para salir del while
                } catch (InputMismatchException e) {
                    System.out.println("ERROR: Debe ingresar un número válido.");
                    sc.next();  // Limpiar la entrada incorrecta
                }
            }
        }

        return numeros;
    }

}
