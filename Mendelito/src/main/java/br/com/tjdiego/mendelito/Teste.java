package br.com.tjdiego.mendelito;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Teste {

    public static void main(String[] args) {

        
        int id = 0;
        Cor cor = new Cor(false, false, "");
        Cor cor2 = new Cor(true, true, "");
        Textura textura = new Textura(false, false, "");
        Textura textura2 = new Textura(true, true, "");
        String stringGenes = "";

        Ervilha ervilha1 = new Ervilha(id, cor, textura, stringGenes);
        Ervilha ervilha2 = new Ervilha(id, cor2, textura2, stringGenes);
        
        Fachada f = new Fachada();
        //f.recuperarErvilha1(ervilha1);
        //f.recuperarErvilha2(ervilha2);
        JOptionPane.showMessageDialog(null, 
                f.recuperarErvilha1(ervilha1).toString()+ 
                        "\n"+
                        
                        f.recuperarErvilha2(ervilha2).toString());
        
    }

}
