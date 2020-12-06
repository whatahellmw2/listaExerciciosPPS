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
public abstract class AbstractHtmlHandler implements HtmlHandler{
    private HtmlHandler next;
    public abstract boolean accept(String menssagem);
    public abstract String doHandle(String menssagem);
    
    @Override
    public String handleRequest(String menssagem){
         
        if (accept(menssagem)) {
            menssagem=doHandle(menssagem);            
         } 
        if (this.next != null) {            
            menssagem=this.next.handleRequest(menssagem);
            
        }else{
            System.out.println(menssagem);
        }
        return menssagem;
    }
    @Override
    public void setNext(HtmlHandler handler){
         this.next = handler;
    }

}
