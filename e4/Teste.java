/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e4;

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
        
         
    
    
  int []numero = {0,1,2,3,4};
           
        EE4 exercicio4 = new EE4();
        int rr = exercicio4.somanumerosvetor(numero,5);
            JOptionPane.showMessageDialog(null,rr);
    }
}
