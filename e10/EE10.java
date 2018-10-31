/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e10;

/**
 *
 * @author PC
 */
public class EE10 {

    /**
     * @param args the command line arguments
     */
   
       void numeros(int numerointeiropositivo) {
        if (numerointeiropositivo == 0) {
            System.out.println("numero inteiro positivo");
        } else {
            System.out.println("numero inteiro positivo");
            numerointeiropositivo--;
            numeros(numerointeiropositivo);
        }

    }}

   