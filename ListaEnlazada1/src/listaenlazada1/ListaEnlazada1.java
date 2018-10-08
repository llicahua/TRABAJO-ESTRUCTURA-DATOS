/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaenlazada1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class ListaEnlazada1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nCantidadElementosIniciales = 15;
        int nValorInicialDato=1;
        int nValorFinalDato=50000;
        int nValorInicialEnlace=1;
        int nValorFinalEnlace=1000000;

        ArrayList<Nodo> oLista = new ArrayList<Nodo>();
        
        oLista =  ListarLinealEnlazada.DevuelveListaEnlazada(nCantidadElementosIniciales, nValorInicialDato, nValorFinalDato, nValorInicialEnlace, nValorFinalEnlace);
        //Instanciar la clase Nodo//
        
        ListarLinealEnlazada ListaLinealEnlazada = new ListarLinealEnlazada(oLista, 1,nCantidadElementosIniciales);
        ListaLinealEnlazada.ImprimirLlistaLinealEnlazada();
        
        System.out.println("Posicion 5 : " + ListaLinealEnlazada.DevolverDatoListaEnlazada(5));
    }

    
}
