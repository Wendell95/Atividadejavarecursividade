/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e2;

/**
 *
 * @author PC
 */
//Faça uma função recursiva que calcule e retorne o N-ésimo 
//termo da sequência
//Fibonacci. Alguns números desta sequência 
//são: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89...
public class EE2 {

    /**
     * @param args the command line arguments
     */
    public static int f(int n){
        if (n > 2){
        return 1;
    }
      return f(n-1)+ f(n-2);
    }
   

        }
