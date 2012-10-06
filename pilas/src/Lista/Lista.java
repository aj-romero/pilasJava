/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

/**
 *
 * @author alber
 */
public class Lista {
     private NodoLista primerNodo;
    private NodoLista ultimoNodo;
    private String nombre;
    
    public String getNombre() {
        return nombre;
    }

    public NodoLista getPrimerNodo() {
        return primerNodo;
    }

    public NodoLista getUltimoNodo() {
        return ultimoNodo;
    }
   
    public Lista(){
        this("lista");
    }
    public Lista(String nombreLista){
        this.nombre = nombreLista;
        this.primerNodo = this.ultimoNodo = null;
    }
    //insertar nodo al frente de la lista.
    public void insertaAlFrente(Object elementoInsertar){
        if(estaVacia()){
            this.primerNodo = this.ultimoNodo = new NodoLista(elementoInsertar);
        }
        else
            this.primerNodo = new NodoLista(elementoInsertar,this.primerNodo);
    }
    public Object eliminarDelFrente() throws ExceptionListaVacia{
        if(estaVacia())//lanza excepcion si esta vacia.
            throw new ExceptionListaVacia(this.nombre);
        
        Object elementoEliminado = this.primerNodo.datos;//obtiene los datos q se van a elminar
        
        //actualiza las referencias.
        if(this.primerNodo == this.ultimoNodo)
            this.primerNodo = this.ultimoNodo = null;
        else
            this.primerNodo = this.primerNodo.siguienteNodo;
        
        return elementoEliminado;
    }
    public Object eliminarDelFinal() throws ExceptionListaVacia{
        if(estaVacia())
            throw new ExceptionListaVacia(this.nombre);
        
        Object elementoEliminado = this.ultimoNodo.datos;
        
        if(this.primerNodo==this.ultimoNodo)
            this.primerNodo = this.ultimoNodo = null;
        else{
            NodoLista actual = this.primerNodo;
            while(actual.siguienteNodo != this.ultimoNodo)//busca el ultimonodo
                actual = actual.siguienteNodo;
            this.ultimoNodo = actual;
            actual.siguienteNodo = null;
        }//fin del else
        return elementoEliminado;
    }    
    //imprimir el contenido d la lista.
    public void imprimir(){
        if(estaVacia()){
            System.out.printf("%s vacia \n",this.nombre);
            return;
        }//fin del if
        
        System.out.printf("La %s es:\n", this.nombre);
        NodoLista actual = this.primerNodo;
        //mientras no este al final de la lista, imprime los datos del nodo actual.
        while(actual != null){
            System.out.printf("%s \n",actual.datos);
            actual = actual.siguienteNodo;
        }
    }
     public String imprimirCadena(){
        String lista = "";
         if(estaVacia()){
             lista = this.nombre+" vacia\n";
            return lista;
        }//fin del if
        
        lista = "La "+this.nombre+" es: \n";
        NodoLista actual = this.primerNodo;
        //mientras no este al final de la lista, imprime los datos del nodo actual.
        while(actual != null){
            System.out.printf("%s \n",actual.datos);
            lista +="-"+actual.datos+"\n";
            actual = actual.siguienteNodo;
        }
        return lista;
    }
    
    //determina si la lista se encuentra vacia
    public boolean estaVacia(){
        return this.primerNodo == null;//devuelve tru si la lista esta vacia
    }
}
