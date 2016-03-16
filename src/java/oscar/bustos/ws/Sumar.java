/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
    @WebMethod
    public Integer suma(int a , int b){
        return a + b;
    }
    
}
