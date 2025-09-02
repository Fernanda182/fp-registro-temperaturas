/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registrotemperaturas;

/**
 *
 * @author ferch
 */

import java.util.Scanner;
public class RegistroTemperaturas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

        // Listas de ciudades, días y semanas
        String[] ciudades = {"Quito", "Guayaquil"};
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        int numSemanas = 2;

        // Matriz 3D [ciudad][día][semana]
        double[][][] temperaturas = new double[ciudades.length][dias.length][numSemanas];

        // Ingreso manual de temperaturas
        for (int c = 0; c < ciudades.length; c++) {
            System.out.println("Introduce las temperaturas para la ciudad: " + ciudades[c]);

            for (int s = 0; s < numSemanas; s++) {
                System.out.println("  Semana " + (s + 1));
                for (int d = 0; d < dias.length; d++) {
                    System.out.print("    " + dias[d] + ": ");
                    temperaturas[c][d][s] = scanner.nextDouble();
                }
            }
        }

        // Mostrar temperaturas por día + promedio por semana
        System.out.println("\n=== Reporte de Temperaturas ===\n");

        for (int c = 0; c < ciudades.length; c++) {
            System.out.println("Ciudad: " + ciudades[c]);

            for (int s = 0; s < numSemanas; s++) {
                double suma = 0;
                System.out.println("  Semana " + (s + 1) + ":");

                for (int d = 0; d < dias.length; d++) {
                    double temp = temperaturas[c][d][s];
                    System.out.printf("    %s: %.2f°C\n", dias[d], temp);
                    suma += temp;
                }

                double promedio = suma / dias.length;
                System.out.printf("  ➤ Promedio semanal: %.2f°C\n\n", promedio);
            }

            System.out.println();
        }

        scanner.close();
    }
}
        