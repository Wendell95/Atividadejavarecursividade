/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e3;

import static java.lang.Math.*;



/**
 *
 * @author PC
 */
public class EE3 {




public static int numerocontrario(int numeralinteiro) {
        if (numeralinteiro == 0) {
           return numeralinteiro;
       } else {
            System.out.println(+numeralinteiro%10);
           
           numeralinteiro = numeralinteiro / 10;
           return numerocontrario(numeralinteiro);
       }
        
    }}
    
   
