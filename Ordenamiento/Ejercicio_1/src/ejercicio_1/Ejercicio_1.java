/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_1;

import javax.swing.*;
import java.io.*;
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        int a[]=new int[17];
        for (int i = 0; i < a.length; i++) {
            a[i]=(int) (Math.random()*17);                    
        }
        System.out.print("a = [");
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("]");       */      
        int number = 0;
        int Decision = 0;
        do {
            do {
                try{
                    number=Integer.parseInt(JOptionPane.showInputDialog("Elegir Cantidad de Datos: \n"
                        +"1.- 1000             5.- 150000 \n"
                        +"2.- 15000            6.- 250000 \n"
                        +"3.- 30000            7.- 400000 \n"
                        +"4.- 90000           8.- 700000 \n"));                      
                }catch(NumberFormatException a){
                    JOptionPane.showMessageDialog(null, "Ingrese nuevamente");
                }
            } while (number>=9);      
        } while (number<=0 );
        switch(number){
            case 1:
                Decision=1000;
                break;
            case 2:
                Decision=15000;
                break;
            case 3:
                Decision=30000;
                break;
            case 4:
                Decision=90000;
                break;
            case 5:
                Decision=150000;
                break;
            case 6:
                Decision=250000;
                break;
            case 7:
                Decision=400000;
                break;
            case 8:
                Decision=700000;
                break;
        }
        
        int nCantidadDatos=Decision;
        int nValorMinimo=0;
        int nValorMaximo=700000;
        int a[]=new int [nCantidadDatos];
        Ordenamiento o=new Ordenamiento ();
        int[] oArreglo = o.DevuelveArreglo(nCantidadDatos, nValorMinimo, nValorMaximo);
        
        //"Metodo Quickshort"
        long nIniciotiempo= System.currentTimeMillis();
        Ordenamiento.Quickshort(oArreglo , 0 , oArreglo.length - 1);            
        long nRetardoTiempo = System.currentTimeMillis() - nIniciotiempo;
        
        //"Metodo burbuja"
        long nIniciotiempo1= System.currentTimeMillis();
        Ordenamiento.Burbuja(oArreglo);
        long nRetardoTiempo1 = System.currentTimeMillis() - nIniciotiempo1;
        
        //"Metodo Shell"
        long nIniciotiempo2= System.currentTimeMillis();
        Ordenamiento.Shell(oArreglo);
        long nRetardoTiempo2 = System.currentTimeMillis() - nIniciotiempo2;
        
        //"Metodo Insercion"
        long nIniciotiempo3= System.currentTimeMillis();
        Ordenamiento.Insercion(oArreglo);
        long nRetardoTiempo3 = System.currentTimeMillis() - nIniciotiempo3;
        
        JOptionPane.showMessageDialog(null, "Cantidad de Registro:  " + nCantidadDatos  + " \n"
            + " \n"
            + "Metodo                  |"+"     Tiempo de ordenamiento \n" 
            + "------------------------------------------------------------------- \n"
            + "Burbuja                  |                         "+ nRetardoTiempo1+" \n"
            + "Shell                       |                         "+nRetardoTiempo2 + " \n"
            + "Quickshort           |                         "+nRetardoTiempo+ " \n"
            + "Inserccion            |                         "+nRetardoTiempo3 );    
    }    
    }
    

