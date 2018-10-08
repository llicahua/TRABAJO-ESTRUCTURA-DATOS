/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaenlazada1;

import java.util.ArrayList;
//import javax.swing.JOptionPane;


/**
 *
 * @author Administrador
 */
public class ListarLinealEnlazada {

    public int start;

    private int nCantidadElementos = 0;

    ArrayList<Nodo> ListaLinealEnlazada;

    public void AumentarCantidadElementos() {
        this.nCantidadElementos++;
    }
    
    
    
    public static ArrayList<Nodo> DevuelveListaEnlazada(
            int nCantidadElementosIniciales,
            int nValorInicialDato,
            int nValorFinalDato,
            int nValorInicialEnlace,
            int nValorFinalEnlace) {
        ArrayList<Nodo> oLista = new ArrayList<Nodo>();

        //this.nCantidadElementos = nCantidadElementosIniciales;
        
        int enlace=0;
        int dato = 0;
        int aux =0;
        for (int i = 1; i <= nCantidadElementosIniciales; i++) {
            
            
            if (i == nCantidadElementosIniciales) {
                enlace = 0;
            } else
            {
                enlace=DevuleveNumeroAleatorio(nValorInicialEnlace, nValorFinalEnlace);
            
            }

            dato = DevuleveNumeroAleatorio(nValorInicialDato, nValorFinalDato);
            
            Nodo onodo = new Nodo(dato, enlace);
            
            
            if(i == 1)   {
                onodo.setPosicion(1);
                onodo.setStart(true);
            } else {
                onodo.setPosicion(aux);
                onodo.setStart(false);
            }
            
            aux=enlace;
            oLista.add(onodo);
            onodo = null;
              
        }
        return oLista;
    }

    public static int DevuleveNumeroAleatorio(int p_al_vmin, int p_al_vmax) {
        int nNumeroAleatorio = 0;

        nNumeroAleatorio = (int) (Math.random() * (p_al_vmax - p_al_vmin));

        return nNumeroAleatorio;
    }

    public ListarLinealEnlazada(ArrayList<Nodo> oLista, int p_inicio,
            int p_nCantidadElementos) {
        this.ListaLinealEnlazada = oLista;
        this.start = p_inicio;
        this.nCantidadElementos = p_nCantidadElementos;
    }
    
    public void ImprimirListaLinealEnlazadaOrdenada(ArrayList<Nodo> Lista)
    {
        
        
    }
    public void ImprimirLlistaLinealEnlazada() {

       // JOptionPane.showMessageDialog(null, Lista);
        int ptr = this.start;
        int i=1;
        int []vector = new int [20];
        int []vec = new int [20];
        while (ptr != 0) {
            int aux = LeerEnlacePuntero(ptr);
            
            System.out.println("( " + i +" ) ---- > " + "[ Posición : " + ptr + "" + " Dato : " + LeerDatoPuntero(ptr) + " Enlace : " + aux + " ]" );
            vector[i] = LeerDatoPuntero(ptr);
            ptr = aux;
            
            i++;
        }
        //Metodo de la Burbuja 
        int n, j, au;
        for (n = 0; n < vector.length - 1; n++) {
            for (j = 0; j < vector.length - n - 1; j++) {
                if (vector[j + 1] < vector[j]) {
                    au = vector[j + 1];
                    vector[j + 1] = vector[j];
                    vector[j] = au;
                }
            }
        }
        for(int x = 0;x < vector.length; x++){        
        System.out.print(vector[x]+"\n");
        }
        
        for(int x = 0;x < vec.length; x++){ 
            
        System.out.print(vec[x]+"\n");
        }
                
        System.out.println("Numero de Elementos Lista Lineal Enlazada : " + this.nCantidadElementos );
        
        //JOptionPane.showMessageDialog(null, Lista2);
    }
    
    
       public int DevolverDatoListaEnlazada( int n_correlativo)
    {
        // n_correlativo : es el orden donde se encuentra el dato.
        int dato = 0;
        
        int ptr = 0;
        ptr = start;
        int i = 1;
        boolean bevaluacion = true;
        
        while(ptr != 0 && bevaluacion == true)
        {
            if (i == n_correlativo) {
                dato = LeerDatoPuntero(ptr);
                bevaluacion = false;
            }
            ptr = LeerEnlacePuntero(ptr);
            i++;
        } 
        
        return dato;
    }

    public int LeerDatoPuntero(int ptr) {
        int dato = 0;
        for (Nodo onodo : ListaLinealEnlazada) {

            if (onodo.getPosicion() == ptr) {
                dato = onodo.getDato();
            }
        }
        return dato;
    }

    public int LeerEnlacePuntero(int ptr) {
        int enlace = 0;
        for (Nodo onodo : ListaLinealEnlazada) {

            if (onodo.getPosicion() == ptr) {
                enlace = onodo.getEnlace();
            }
        }
        return enlace;
    }
  //////////////////////////////////////////////////////7
    
    
    public int LeerDatoNodo(int dato) {
        int posicion  = 0;
        int c = 0;
        for (Nodo onodo : ListaLinealEnlazada) {
            if (onodo.getDato() == dato) {
                posicion = c;
            }
            c++;
        }
       
        return posicion;
    }
}
