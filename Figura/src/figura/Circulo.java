/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

import java.util.Scanner;

public class Circulo {

    public double area;
    public double PI = 3.141516;

    public Circulo(int radio) {
        this.radio = radio;
    }
    // propiedades
    private int radio;
    // metodo statico que no cambia en el tiempo
//    
//    Scanner ingresar = new Scanner(System.in);
//    
    

    // metodos.
    public double areacirculo() {
        area= radio*radio*PI;

        return area;
    }
//    
//    public void set_Radio(int value){
//        this.radio = value;
//    }
//    
//    public int get_Radio(){
//           return this.radio;
//    }
//    
}
