/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Convertidor;

/**
 *
 * @author UCA
 */
public class Binario implements Convertir {

    @Override
    public String convertidor(int a) {
        
        String num = " ";
        int aux = 0;
        while (a >= 2) {
            aux = a % 2;
            num = aux + num;
            a = a / 2;
        }
        
        num = a + num;
        return num;
    }

}
