/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e7;

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
        
        
 EE7 a = new EE7();
        boolean nn = true;

        do {
            try {
                Scanner e = new Scanner(System.in);
                System.out.println("Digite o valor");
                int primeiro= e.nextInt();
                System.out.println("analisar valor recebido ");
                int segundo= e.nextInt();
               
                int primeirosegundo = a.invertenumeros(primeiro, segundo, 0);
                System.out.println("valor:" + primeirosegundo + "repeticoes");
                nn = false;
            } catch (NumberFormatException exercicio7) {
                System.err.println(exercicio7);
                
                System.out.println("Digite um numero");
            }
        } while (nn);
    }

}
