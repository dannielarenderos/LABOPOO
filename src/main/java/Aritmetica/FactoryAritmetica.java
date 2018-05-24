/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aritmetica;

import Convertidor.Binario;
import Convertidor.Convertir;
import ProductorFabrica.ProductordeOperaciones;


/**
 *
 * @author UCA
 */
public class FactoryAritmetica implements ProductordeOperaciones {

    /**
     *
     * @param type
     * @return
     */
    @Override
    public Operaciones getOperaciones(String type) {
        switch (type) {
            case "suma":
                return new Sumar();
            case "restar":
                return new Restar();
            case "multiplicar":
                return new Multiplicacion();
            case "dividir":
                return new Division();
        }
        return null;
    }

    @Override
    public Convertir getConvertir(String type) {
        return null;

    }

}

