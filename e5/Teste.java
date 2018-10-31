/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e5;

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
        Scanner sc = new Scanner(System.in);
        JOptionPane.showInputDialog(null, "Digite o valor");
        int numero0 = sc.nextInt();
        JOptionPane.showInputDialog(null, "Resultado final");
        EE5 exercicio5 = new EE5();
        exercicio5.somatoriodosnumeros(numero0,0);
    }}
        
        
       