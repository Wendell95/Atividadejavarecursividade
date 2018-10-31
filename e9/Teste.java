/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e9;

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
            Scanner sc = new Scanner(System.in);
        EE9 quantvezes = new EE9();
            System.out.println("Digite um valor");
            int primeiro = sc.nextInt();
        
        quantvezes.numero(primeiro);
    }

}
