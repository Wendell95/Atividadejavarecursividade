/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e3;

import java.util.Scanner;


/**
 *
 * @author PC
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
 
   
        Scanner s = new Scanner(System.in);
       boolean converternumero = true;
        
       do {
           try {
                System.out.println("Digite o numero inteiro");
                int num = s.nextInt();
                EE3.numerocontrario(num);
                        
               converternumero = false;
           } catch (NumberFormatException escrevernumero) {
               System.err.println(escrevernumero);
               
               System.out.println("Digite um numero");
            }
       } while (converternumero);
   

        
    }
}
    

