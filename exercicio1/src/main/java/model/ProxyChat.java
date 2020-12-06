/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Thiago
 */
public class ProxyChat implements Chat{

    @Override
    public void enviar(Participante participante, String menssagem, SalaChat sala) {
        RealChat chat = new RealChat();
        chat.addHandler(new ATag());
        chat.addHandler(new ImgTag());
        chat.addHandler(new PTag());
        chat.addHandler(new TableTag());
        
        chat.enviar(participante, menssagem, sala);
    }

  
    
}
