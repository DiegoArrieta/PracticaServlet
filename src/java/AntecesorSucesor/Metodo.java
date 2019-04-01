package AntecesorSucesor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zeuss
 */
public class Metodo {
    public String AntSuc (int num){
        String r;
        r = (num-1)+", "+num+", "+(num+1);
        return r;
    }
}
