package business.marcas;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thiago
 */
public class UtilitarioString {
    private static UtilitarioString instancia;
    private UtilitarioString(){
        
    }
    public static UtilitarioString getInstancia(){
        if(instancia==null){
            instancia=new UtilitarioString();
        }
        return instancia;
    }
    public String substitui(String texto,String palavra,String simbolo ){
        Pattern padrao = Pattern.compile(palavra);
        Matcher m = padrao.matcher(texto);
        
       
        texto=m.replaceAll(simbolo);
        return texto;
    }
}
