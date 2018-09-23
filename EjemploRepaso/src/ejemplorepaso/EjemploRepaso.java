/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplorepaso;

import java.awt.HeadlessException;
import javax.swing.*;
import java.io.*;
import java.util.InputMismatchException;

/**
 *
 * @author Marco
 */
public class EjemploRepaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Ejemplo Numero 01

        // n: Numero de Elementos a Capturar por teclado.
        int n = 0, i;

        String lista = "";

        try {
            n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero de estudiantes"));

        } catch (HeadlessException | NumberFormatException e) {
            int numero = JOptionPane.showConfirmDialog(null, "Realmente desea salir de Hola Swing?", "Confirmar salida", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (numero == 0) {
                    System.exit(0);
                }
            JOptionPane.showInputDialog("No me diste un valor númerico ");
        }

        // Arreglos
        String nombres[] = new String[n];
        int edades[] = new int[n];

        int multiplos[] = new int[n];

        int posicionmultiplo = 0;

        // Variables ;
        int menor = 9999;
        int mayor = 0;
        int suma = 0;
        double promedio = 0;

        for (i = 0; i < edades.length; i++) {
            try {
                edades[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Edad del estudiante Numero :  " + i + " "));

            } catch (HeadlessException | NumberFormatException e) {
                int numero = JOptionPane.showConfirmDialog(null, "Realmente desea salir de Hola Swing?", "Confirmar salida", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (numero == 0) {
                    System.exit(0);
                }
                edades[i] = Integer.parseInt(JOptionPane.showInputDialog("No me diste un valor númerico,"
                        + ".Ingrese la Edad del estudiante Numero :  " + i + ""));
            }

            if (edades[i] <= menor) {
                menor = edades[i];
            }

            if (edades[i] >= mayor) {
                mayor = edades[i];
            }
            // es Multiplo de Siete

            if (EsMultiplodeSiete(edades[i])) {

                multiplos[posicionmultiplo] = edades[i];
                posicionmultiplo++;

            }

            //
            suma = suma + edades[i];
            promedio = suma / n;

            // Impresion de Datos.
        }

        // Impresion de Nombres
        for (i = 0; i < nombres.length; i++) {
            lista = lista + (i + 1) + " " + nombres[i] + "\n";
        }

        //  Impresion de edades mayor y menor
        lista = lista + " La Edad Mayor es :  " + mayor + "\n";
        lista = lista + " La Edad Menor es :  " + menor + "\n";
        lista = lista + " El Promedio es :  " + promedio + "\n";
        lista = lista + " La Suma es :  " + suma + "\n";

        lista = lista + "************************\n";

        // Impresion Multiplos de Siete
        lista = lista + "Multiplos de site\n";
        for (i = 0; i < multiplos.length; i++) {
            if (multiplos[i] > 0) {
                lista = lista + (i + 1) + ". " + multiplos[i] + "\n";
            }
        }

        JOptionPane.showMessageDialog(null, lista);

    }

    public static boolean EsMultiplodeSiete(int pnNumero) {
        boolean bresultado = false;

        if (pnNumero == 0) {
            bresultado = false;
        }

        if (pnNumero % 7 == 0) {
            bresultado = true;
        } else {
            bresultado = false;
        }

        return bresultado;
    }
}
