/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Class.Arbol;
import Class.Nodo;

/**
 *
 * @author Tamara
 */
public class Main {
    public static void main (String args[]){
        Arbol <String> arbol=new Arbol<>();
        Nodo <String> raiz=new Nodo("*");
        raiz.setIzquierda(new Nodo("2"));
        raiz.setDerecha(new Nodo ("3"));
        arbol.setRaiz(raiz);
        
        arbol.recorreInorden(arbol.getRaiz());
        System.out.println("\n");
        arbol.recorrePreorden(arbol.getRaiz());
    }
    
}
