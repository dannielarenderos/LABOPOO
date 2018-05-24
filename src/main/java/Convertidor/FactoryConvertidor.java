/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Convertidor;

import Aritmetica.Operaciones;
import ProductorFabrica.ProductordeOperaciones;

/**
 *
 * @author UCA
 */
public class FactoryConvertidor implements ProductordeOperaciones {

    @Override
    public Operaciones getOperaciones(String type) {
        return null;
    }

    @Override
    public Convertir getConvertir(String type) {
        switch (type) {
            case "binario":
                return new Binario();
        }
        return null;

    }

   

}
