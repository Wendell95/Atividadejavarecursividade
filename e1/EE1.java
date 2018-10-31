/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//1) Faça uma função recursiva que calcule e retorne o 
//fatorial de um número inteiro N.
package e1;




/**
 *
 * @author PC
 */
public class EE1 {

    /**
     * @param args the command line arguments
     */
    
       public static int fact(int n){
          
          
           if(n == 0){
           return 1;
           }else{
           return n*fact(n-1);
    }
    
}

   
}
