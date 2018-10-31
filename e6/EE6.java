/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e6;

/**
 *
 * @author PC
 */
public class EE6 {

    /**
     * @param args the command line arguments
     */
    
    
        
    public static void positivo(int[] numero, int primeiro, int segundo) {
        int valorp = numero[primeiro];
        numero[primeiro] = numero[segundo];
        numero[segundo] = valorp;
    }
    
        }
