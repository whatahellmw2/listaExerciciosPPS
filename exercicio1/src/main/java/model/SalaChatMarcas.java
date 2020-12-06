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
public class SalaChatMarcas implements SalaChat{

    @Override
    public void enviar(Participante participante, String menssagem) {
        Chat chat = new ProxyChat();
        chat.enviar(participante, menssagem,this);
    }

    @Override
    public Participante criarParticipante(MediatorChat mediator, String nome) {
        Participante participante = new ParticipanteChat(this, nome);
        return participante;
    }

    public SalaChatMarcas() {
    }
   
    
}
