import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Operaciones operacion = new Operaciones();
        int opcion;
        double num1;
        double num2;

        do {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1 - Sumar\n2 - Restar\n3 - Multiplicar\n4 - Dividir\n5 - Salir");
            System.out.print("\t-> ");
            opcion = sc.nextInt();

            if (opcion < 1 || opcion > 5) {
                System.out.println("\nOpcion no valida - Seleccione una opcion correcta");
            } else {

                switch (opcion) {
                    //Suma
                    case 1:
                        System.out.print("Numero1: ");
                        num1 = sc.nextDouble();
                        System.out.print("Numero2: ");
                        num2 = sc.nextDouble();
                        System.out.println("Resultado = " + operacion.sumar(num1, num2));
                        break;

                    //Resta
                    case 2:
                        System.out.print("Numero1: ");
                        num1 = sc.nextDouble();
                        System.out.print("Numero2: ");
                        num2 = sc.nextDouble();
                        System.out.println("Resultado = " + operacion.restar(num1, num2));
                        break;

                    //Multiplicación
                    case 3:
                        System.out.print("Numero1: ");
                        num1 = sc.nextDouble();
                        System.out.print("Numero2: ");
                        num2 = sc.nextDouble();
                        System.out.println("Resultado = " + operacion.multiplicar(num1, num2));
                        break;

                    //División
                    case 4:
                        System.out.print("Numero1: ");
                        num1 = sc.nextDouble();
                        System.out.print("Numero2: ");
                        num2 = sc.nextDouble();

                        if (num2 == 0) {
                            System.out.println("ERROR: No se puede dividir por cero");
                        } else {
                            System.out.println("Resultado = " + operacion.dividir(num1, num2));
                        }
                        break;

                    //Fin
                    case 5:
                        System.out.println("\nSaliendo...\n");
                        break;
                }
            }
        } while (opcion != 5);

        sc.close();
    }
}