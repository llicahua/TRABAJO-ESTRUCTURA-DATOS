/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_1;

/**
 *
 * @author Miguel Angel
 */
public class Ordenamiento {
    public int[] DevuelveArreglo(int nvalores, int minimo, int maximo){
        int numeros[]=new int[nvalores];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=DevuelveNumeroAleatorio(minimo,maximo);
        }
        return numeros;
    }
    
    public int DevuelveNumeroAleatorio(int minimo, int maximo){
        int nValorDevuelto=0;
        nValorDevuelto=(int)(Math.random()*(maximo - minimo));
        return nValorDevuelto;
    }    
    
    public static void Quickshort (int A[], int izq, int der){
              
        int pivote=A[izq]; // tomamos primer elemento como pivote
        int i=izq; // i realiza la búsqueda de izquierda a derecha
        int j=der; // j realiza la búsqueda de derecha a izquierda
        int aux;

        while(i<j){            // mientras no se crucen las búsquedas
           while(A[i]<=pivote && i<j) i++; // busca elemento mayor que pivote
           while(A[j]>pivote) j--;         // busca elemento menor que pivote
           if (i<j) {                      // si no se han cruzado                      
               aux= A[i];                  // los intercambia
               A[i]=A[j];
               A[j]=aux;
           }
         }
         A[izq]=A[j]; // se coloca el pivote en su lugar de forma que tendremos
         A[j]=pivote; // los menores a su izquierda y los mayores a su derecha
         if(izq<j-1)
            Quickshort(A,izq,j-1); // ordenamos subarray izquierdo
         if(j+1 <der)
            Quickshort(A,j+1,der); // ordenamos subarray derecho
    }
    
    public static void Burbuja (int a[]){
        
        for(int i = 0; i < a.length - 1; i++)
        {
            for(int j = 0; j < a.length - 1; j++)
            {
                if (a[j] > a[j + 1])
                {
                    int tmp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = tmp;
                }
            }
        }    
    }
    
    public static void Shell (int a[]){
        int salto, aux, i;
        boolean cambios;
        for(salto=a.length/2; salto!=0; salto/=2){
            cambios=true;
            while(cambios){ // Mientras se intercambie algún elemento
                 cambios=false;
                for(i=salto; i< a.length; i++){ // se da una pasada
                    if(a[i-salto]>a[i]){ // y si están desordenados
                        aux=a[i]; // se reordenan
                        a[i]=a[i-salto];
                        a[i-salto]=aux;
                        cambios=true; // y se marca como cambio.
                    }
                }
            }
        }
    }
    
    public static void Insercion(int a[]){
        int p, j;
        int aux;
        for (p = 1; p < a.length; p++){ // desde el segundo elemento hasta
            aux = a[p]; // el final, guardamos el elemento y
            j = p - 1; // empezamos a comprobar con el anterior
            while ((j >= 0) && (aux < a[j])){ // mientras queden posiciones y el
                                             // valor de aux sea menor que los
                a[j + 1] = a[j];       // de la izquierda, se desplaza a
                j--;                   // la derecha
            }
            a[j + 1] = aux; // colocamos aux en su sitio
        }
    }

}
