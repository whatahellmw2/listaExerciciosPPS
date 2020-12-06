/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import business.marcas.removeMarcasProcessadora;

/**
 *
 * @author Thiago
 */
public class RealChat implements Chat{
    HtmlHandler first;
    HtmlHandler sucessor;
   
    @Override
    public void enviar(Participante participante, String menssagem, SalaChat sala) {
        String classe=sala.getClass().getSimpleName();
        if(classe.equals("SalaChatHtml")){            
             handleRequest(menssagem);
        }else{
            removeMarcasProcessadora remover = new removeMarcasProcessadora();
            remover.removerMarcas(menssagem);
        }
    }
     

    public void addHandler(HtmlHandler handler) {
        if (this.first == null) {
            this.first = handler;
        } else {
            this.sucessor.setNext(handler);
            
        }
        this.sucessor = handler;
    }

    public String handleRequest(String menssagem){
         return first.handleRequest(menssagem);
    }

    
    
    
}
