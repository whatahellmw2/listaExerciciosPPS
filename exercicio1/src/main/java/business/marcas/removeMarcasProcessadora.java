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
public class removeMarcasProcessadora {
    
        public void removerMarcas(String menssagem){
        removeNomeDasMarcas r = new removeNomeDasMarcas();
        r.addMarca(new Apple());
        r.addMarca(new FaceBook());
        r.addMarca(new IBM() );
        r.addMarca(new Microsoft());
        String resultado=r.removerMarcasDoTexto(menssagem);
        System.out.println(resultado);
    }
}
