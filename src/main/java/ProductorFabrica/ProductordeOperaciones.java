/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductorFabrica;

import Aritmetica.Operaciones;
import Convertidor.Convertir;
/**
 *
 * @author UCA
 */
public interface ProductordeOperaciones {
    Operaciones getOperaciones(String type);
    Convertir getConvertir(String type);
}
