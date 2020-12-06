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
public class ParticipanteChat extends Participante{
    private String nome;
    private MediatorChat chatMediatorChat;
    public ParticipanteChat(MediatorChat chatMediator,String participante) {
        this.nome= participante;
        this.chatMediatorChat=chatMediator;
    }
    
    @Override
    public String getName() {
        return this.nome;
    }

    @Override
    public void enviar(String menssagem) {
        chatMediatorChat.enviar(this, menssagem);
    }

    @Override
    public void receber(String menssagem, Participante participante) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
