/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici_3;

/**
 *
 * @author ALUMNEDAM
 */
public class Utils {
    public int calcularPrecio(int numUf){
        int preu = 380;
        if(numUf < 12 && numUf > 0){
            preu = numUf * 30;
        } else if (numUf <= 0){
            preu = 0;
        }
        return preu;
    }
}
