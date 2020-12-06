package business.marcas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thiago
 */
public class FaceBook implements IMarcasComerciais{
    private final String nome;

    public FaceBook() {
        this.nome = "FaceBook";
    }
   
    @Override
    public String getSimbolo() {
        String replaceAll = this.nome.replaceAll(".", "\\*");
        return replaceAll;
    }

    @Override
    public String getNome() {
       return this.nome;
    }
    
}
