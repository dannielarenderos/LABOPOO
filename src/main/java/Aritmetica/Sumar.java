/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aritmetica;

/**
 *
 * @author UCA
 */
public class Sumar implements Operaciones {

    @Override
    public String operar(int a, int b) {
        return Integer.toString(a + b);
    }

}
