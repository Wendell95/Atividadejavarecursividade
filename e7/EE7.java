/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e7;

/**
 *
 * @author PC
 */
public class EE7 {

    /**
     * @param args the command line arguments
     */
   // public static void main(String[] args) {
      

public static int invertenumeros(int primeiro, int segundo, int terceiro) {
        if (primeiro % 10 == segundo) {
            return terceiro;
           
        }
        if (primeiro % 10 == segundo) {
            return terceiro;
        }
        return invertenumeros(primeiro / 10, segundo, terceiro);
    }
}
   