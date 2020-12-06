/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Thiago
 */
public class PTag extends AbstractHtmlHandler{

    @Override
    public boolean accept(String menssagem) {
        return true;
    }

    @Override
    public String doHandle(String menssagem) {
        Pattern padrao = Pattern.compile("<p(.*?)>");
        Matcher m = padrao.matcher(menssagem);
        
       
        String texto=m.replaceAll("Mensagem removida por conter conteúdo não autorizado");
        return texto;
        
    }
    
}
