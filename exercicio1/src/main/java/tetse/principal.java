/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetse;

import model.MediatorChat;
import model.Participante;
import model.SalaChat;
import model.SalaChatHtml;
import model.SalaChatMarcas;

/**
 *
 * @author Thiago
 */
public class principal {
    public static void main(String[] args){
        SalaChat salaMarcas = new SalaChatMarcas();
        SalaChat salaHtml = new SalaChatHtml();
        
        Participante p1=salaMarcas.criarParticipante(salaMarcas, "thiago");
        
        //Participante p3=salaMarcas.criarParticipante(salaMarcas, "vitor");
        
        p1.enviar("A IBM é show de mais");
        
        Participante p2=salaHtml.criarParticipante(salaHtml, "thamires");
        
        
        p2.enviar("<p style=\"color:red\"> Segunda Onda Covid 19 ");
    }
    
    
}
