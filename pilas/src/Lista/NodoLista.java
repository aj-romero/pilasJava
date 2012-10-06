/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

/**
 *
 * @author alber
 */
public class NodoLista {
    public Object datos;
    public NodoLista siguienteNodo;
    public NodoLista(Object objeto) {
        this(objeto,null);
    }
    public NodoLista(Object objeto, NodoLista nodo){
        this.datos = objeto;
        this.siguienteNodo = nodo;
    }
    
    Object obtenerObject(){
        return this.datos;
    }
    NodoLista obtenerSiguiente(){
        return this.siguienteNodo;
    }
    
}
