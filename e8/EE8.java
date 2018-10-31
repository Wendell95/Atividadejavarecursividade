/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e8;

/**
 *
 * @author PC
 */
public class EE8 {

  
int terceiro = 1;

    int MDC(int primeiro, int segundo) {
        if (terceiro== segundo) {
            return primeiro;
        } else {
            primeiro += primeiro;
            terceiro++;
            //return terceiro;
            return MDC(primeiro, segundo);
        }

    }}

       