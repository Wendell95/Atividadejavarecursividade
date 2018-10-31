/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e8;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       

   EE8 e = new EE8();
        boolean z = true;

        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite o numero da operacao da multiplicacao");
                int primeiro = sc.nextInt();
                
                System.out.println("Digite a quantidade em que esse numero vai ser multiplicado ");
                int segundo= sc.nextInt();
               
               
                int valorfinal = e.MDC(primeiro,segundo);
                System.out.println("Os valores multiplicados de: " + primeiro + " vezes " + segundo + " = " + valorfinal);
                z = false;
            } catch (NumberFormatException mdc) {
                System.err.println(mdc);
                System.out.println("Digite um valor");
            }
        } while (z);

    }

}