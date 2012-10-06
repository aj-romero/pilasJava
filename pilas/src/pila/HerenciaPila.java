/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pila;

import Lista.ExceptionListaVacia;
import Lista.Lista;

/**
 *
 * @author alber
 */
public class HerenciaPila extends Lista{
    //constructor sin argumentos.
    public HerenciaPila(){
        super("Pila.");
    }
    
    public void push(Object objeto){
        insertaAlFrente(objeto);
    }
    //eliminar objeto de la pila
    public Object pop() throws ExceptionListaVacia{
        return eliminarDelFrente();
    }
}
