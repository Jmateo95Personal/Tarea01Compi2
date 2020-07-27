/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;
import analizadores.Lexico;
import analizadores.parser1;

import java.io.StringReader;
import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Jonathan
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        String Octal="7014";


        analizadores.Lexico lexico=new Lexico(new BufferedReader(new StringReader(Octal)));
        analizadores.parser1 sin1=new parser1(lexico);
        try {
            sin1.parse();
        }catch (Exception e) {
        }    
        System.out.println("El Octal: "+Octal+" es: "+sin1.Octal+" en Decimal");
    }
}




