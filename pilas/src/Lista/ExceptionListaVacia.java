/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

/**
 *
 * @author alber
 */
public class ExceptionListaVacia extends RuntimeException {
    //constructor sin argumentos.
    public ExceptionListaVacia(){
        this("lista");//llama al otro constructor.
    }
    public ExceptionListaVacia(String nombre){
        super(nombre + " esta vacia");//llama al constructor de la super clase
    }
    
}
