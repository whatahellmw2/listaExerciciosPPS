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
public abstract class Participante {
    public abstract String getName();
    public abstract void enviar(String menssagem);
    public abstract void receber(String menssagem, Participante participante);
}
