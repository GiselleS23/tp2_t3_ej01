/* 1.- Lea 10 números y a través de un diagrama, obtenga su suma, determine el promedio, el número menor y el número mayor. 
Sacchetti Maria Giselle C2 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int suma = 0;
        int menor = Integer.MAX_VALUE;
        int mayor = Integer.MIN_VALUE;

        System.out.println("Ingrese 10 números:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            int num = input.nextInt();
            suma += num;
            if (num < menor) {
                menor = num;
            }
            if (num > mayor) {
                mayor = num;
            }
        }

        System.out.println("La suma de los números es: " + suma);
        System.out.println("El promedio de los números es: " + (double) suma / 10);
        System.out.println("El número menor es: " + menor);
        System.out.println("El número mayor es: " + mayor);

        input.close();
    }
}
