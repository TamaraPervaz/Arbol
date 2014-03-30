/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author Tamara
 */
public class Nodo <T>{

   
    private T dato;
    private Nodo <T> izquierda;
    private Nodo <T> derecha;

    public Nodo(T dato){
        this.dato=dato;
    }
    /**
     * @return the dato
     */
    public T getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(T dato) {
        this.dato = dato;
    }

    /**
     * @return the izquierda
     */
    public Nodo <T> getIzquierda() {
        return izquierda;
    }

    /**
     * @param izquierda the izquierda to set
     */
    public void setIzquierda(Nodo <T> izquierda) {
        this.izquierda = izquierda;
    }

    /**
     * @return the derecha
     */
    public Nodo <T> getDerecha() {
        return derecha;
    }

    /**
     * @param derecha the derecha to set
     */
    public void setDerecha(Nodo <T> derecha) {
        this.derecha = derecha;
    }
    

   
}
