/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e4;



/**
 *
 * @author PC
 */
//4) Faça uma função recursiva que permita somar os 
//elementos de um vetor de
//inteiros.
public class EE4 {

    /**
     * @param args the command line arguments
     */
    
    
    
           
    
        int somanumerosvetor(int numero1[], int numero2){
        if (numero2==1){
            return numero1[0];
        }else{
           return somanumerosvetor(numero1, numero2-1)+numero1[numero2-1];
          
    }
           
    }
    
}
