/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e9;

/**
 *
 * @author PC
 */
public class EE9 {

    
 int segundo = 0;
 
    public void numero(int primeiro) {
        if (segundo == primeiro) {
            System.out.println(segundo);
       
        } else {
            System.out.println(segundo);
           
            segundo++;
            numero(primeiro);
        }

    }}

    