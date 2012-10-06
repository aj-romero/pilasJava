/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pila;

import Lista.NodoLista;
import javax.swing.JOptionPane;

/**
 *
 * @author alber
 */
public class pruebaPila {
   
    public static void main(String ar[]){
        String datos;
        String datosMod;
        HerenciaPila pila = new HerenciaPila();
      
        pila.push(1);
        pila.push(2);
        pila.push(8);
        
        datos = pila.imprimirCadena();
         JOptionPane.showMessageDialog(null,datos);
         Object eliminado = pila.pop();
         datosMod = pila.imprimirCadena();
         JOptionPane.showMessageDialog(null,"Dato eliminado"+eliminado+
                 "\n"+datosMod);
        
    }
    
   
}
