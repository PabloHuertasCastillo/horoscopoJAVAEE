/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Pablo
 */
public class Utilidades {
    
    public static ArrayList <String> getMeses(){
        ArrayList <String> meses = new ArrayList<String>();
        for (int i = 1; i<13; i++){
            meses.add(String.valueOf(i));
        }
        return meses;
    }
    
    public static ArrayList <String> getDias(){
        ArrayList <String> dias = new ArrayList<String>();
        for (int i = 1; i<32; i++){
            dias.add(String.valueOf(i));
        }
        return dias;
    }
    
}
