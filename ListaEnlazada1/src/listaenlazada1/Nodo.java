/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaenlazada1;

/**
 *
 * @author Administrador
 */
public class Nodo {
    private int dato =0;
    int enlace =0;
    private int posicion =0;
    private int start =0;
    private boolean bstart=false;
    
    public Nodo(int p_dato, int p_enlace)
    {
        this.dato = p_dato;
        this.enlace = p_enlace;
    }
    public int getDato()
    {
        return this.dato;
    }
    
    public int getEnlace()
    {
        return this.enlace;
            }
    public int getStart()
    {
        return this.start;
    }
    public int getPosicion()
    {
        return this.posicion;
    }
    public void setStart(boolean p_bstart)
    {
        this.bstart = p_bstart;
    }
    public void setPosicion(int p_posicion)
    {
        this.posicion = p_posicion;
    }
}
