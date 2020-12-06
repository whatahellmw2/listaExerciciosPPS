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
public interface MediatorChat {
    public void enviar(Participante participante, String menssagem);
    public Participante criarParticipante(MediatorChat mediator, String nome);
}
