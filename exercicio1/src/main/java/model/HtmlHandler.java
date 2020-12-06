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
public interface HtmlHandler {
    public void setNext(HtmlHandler handler);
    public String handleRequest(String menssagem);
    
}
