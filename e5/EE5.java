/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e5;

import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class EE5 {

    /**
     * @param args the command line arguments
     */
    
        public int somatoriodosnumeros(int numero0, int numero1){ 
        if(numero0==0){
            JOptionPane.showMessageDialog(null,numero1);
            return numero1; 
        }
        else{
            return somatoriodosnumeros(numero0-1, numero1 + numero0) + numero0-1;
    }
  }
}
   