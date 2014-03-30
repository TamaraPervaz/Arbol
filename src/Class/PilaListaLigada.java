package Class;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tamara
 */
public class PilaListaLigada {
    Integer [] pila=new Integer [10];
    int tope=-1;
    
    void Push (Integer dato){
        if(tope <pila.length-1){// del 0...8 9
            pila[tope+1]=dato;
            tope++;
            
        }else{
            System.out.println("La pila esta llena");
        }
    }
        
    Integer Pop(){
        Integer resultado=0;
        if(tope>-1){
            resultado=pila[tope];
        }else
            System.out.println("La pila esta vacía");
            
   return resultado;
        }
    //return resultado;
        
    }
    

