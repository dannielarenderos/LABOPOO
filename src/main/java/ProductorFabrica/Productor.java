///*
 

package ProductorFabrica;
import Aritmetica.FactoryAritmetica;
import Convertidor.FactoryConvertidor;

/**
 *
 * @author UCA
 */
public class Productor {
    public static ProductordeOperaciones getProductor(String type){
        switch (type){
            case "aritmetica":
                return new FactoryAritmetica();                    
                    
                    
            case "convertir":
                return new FactoryConvertidor();
        }
        return null;
    }
}
