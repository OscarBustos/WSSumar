/*
 * Clase que se expone como servicio para sumar dos numeros
 */
package oscar.bustos.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author Oscar
 */
@WebService
public class Sumar {
    
    /**
     * Metodo el cual se encarga de realizar la suma de dos numeros enteros
     * @param a
     * @param b
     * @return 
     */
    @WebMethod
    public Integer suma(int a , int b){
        return a + b;
    }
    
}
