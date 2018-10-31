/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e10;

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
        int numerointeiropositivo;
        
        EE10 rr = new EE10();
        System.out.println("Digite um numero");
        numerointeiropositivo = s.nextInt();
        rr.numeros(numerointeiropositivo);
    }

}
    
    
 

 