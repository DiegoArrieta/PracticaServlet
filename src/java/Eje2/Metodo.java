/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eje2;

/**
 *
 * @author zeuss
 */
public class Metodo {
    public String calculo(int a){
        String r;
        if(a>0){
            r = "El número es positivo";
        }
        else{
            if(a<0){
                r = "El numero es negativo";
            }
            else{
                r = "El Numero es Neutro";
            }
        }
        return r;
    }
}
