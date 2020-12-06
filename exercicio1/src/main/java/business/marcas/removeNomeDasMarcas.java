package business.marcas;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thiago
 */
public class removeNomeDasMarcas {
    ArrayList<IMarcasComerciais> marcas;
    public removeNomeDasMarcas(){
        this.marcas= new ArrayList<>();
    }
    public void addMarca(IMarcasComerciais marca){
        this.marcas.add(marca);
    }
    public String removerMarcasDoTexto(String texto){
        for(IMarcasComerciais m:marcas){
            texto=UtilitarioString.getInstancia().substitui(texto, m.getNome(), m.getSimbolo());
            
        }
        
        return texto;
    }
}
