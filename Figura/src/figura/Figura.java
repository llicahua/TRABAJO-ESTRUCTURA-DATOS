/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Marco
 */
public class Figura implements FiguraInterface {

    /**
     * Cuando una clase implementa una interfaz esta obliga a cumplir todos los
     * contratos de la interfaz
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double area = 0;
        int i=Integer.parseInt(JOptionPane.showInputDialog("1. Circulo \n 2. Triangulo \n 3. Rectangulo"));
        switch (i) {
            case 1:
                // convierte el objeto obj recibido por parametro 
                // en la clase instaciada circulo.
                int radio = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el radio"));
                Circulo circ = new Circulo(radio);
                area = circ.areacirculo();
                JOptionPane.showMessageDialog(null, area);
                break;

            case 2:
                
               double base = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el base"));
               double altura = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el altura"));
                
                Triangulo tria = new Triangulo(base,altura);
                area = tria.areatriangulo();
                JOptionPane.showMessageDialog(null, area);
                break;
                
            case 3:
                int lado = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el ancho"));
                int ancho = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el largo"));
                
                Rectangulo rect = new Rectangulo(lado,ancho);
                area = rect.arearectangulo();
                JOptionPane.showMessageDialog(null, area);
                break;
            default:

                break;
        }
    }

        
        
//        // tipo de dato nombre_variable = palabra reservada(new) tipo de dato(alcance)
//        // instancia de la clase figura
//        Figura ofigura = new Figura();
//
//        //  Instanciando la Clase Circulo
//        System.out.println(" El Area del Circulo es : " + area);
//
//        // Instancias la Clase Triangulo
//        Triangulo oTriangulo = new Triangulo(5.2, 2.4);
//
//        area = ofigura.CalculoArea(oTriangulo);
//
//        System.out.println(" El Area del Triangulo es : " + area);
//
//        //Instanciando la Clase Rectangulo
//        Rectangulo oRectangulo = new Rectangulo(9, 5);
//
//        area = ofigura.CalculoArea(oRectangulo);
//
//        System.out.println("El Area del Rectangulo es : " + area);

        // Los Datos de Entrada que se ingresen desde teclado.
        // Completar para el area del rectangulo.

    @Override
    public double CalculoArea(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }

    // 
//    public double CalculoArea(Object obj) {
//        double area = 0;
//
//        //System.out.println(obj.getClass().getSimpleName());
        