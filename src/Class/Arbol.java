/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author Tamara
 */
public class Arbol <T>{
    
    private Nodo <T> raiz;

    /**
     * @return the raiz
     */
    public Nodo <T> getRaiz() {
        return raiz;
    }

    /**
     * @param raiz the raiz to set
     */
    public void setRaiz(Nodo <T> raiz) {
        this.raiz = raiz;
    }
   
 public void recorrePreorden(Nodo<T> nodo){
     System.out.println(nodo.getDato());
     recorrePreorden(nodo.getIzquierda());
     recorrePreorden(nodo.getDerecha());
     
 }   
  public void recorreInorden(Nodo<T> nodo){
      if (nodo!=null){
     recorrePreorden(nodo.getIzquierda());
     System.out.println(nodo.getDato());
     recorrePreorden(nodo.getDerecha());
      }
 }   
 
   public void recorrePosorden(Nodo<T> nodo){
      if (nodo!=null){
     recorrePreorden(nodo.getIzquierda());
     recorrePreorden(nodo.getDerecha());
      System.out.println(nodo.getDato());
      }
 } 
  
 
}
