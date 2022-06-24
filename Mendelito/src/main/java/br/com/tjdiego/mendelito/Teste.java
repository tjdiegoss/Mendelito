
package br.com.tjdiego.mendelito;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Teste {
    
    public static void main (String [] args){
    
        int id = 0;
        Cor cor = new Cor(false, false,""); 
        Textura textura = new Textura(false, false,"");
        
        Ervilha ervilha1 = new Ervilha(id, cor, textura);
        ervilha1.setId(1);
        ervilha1.setCor(cor);
        ervilha1.setTextura(textura);
        
        Ervilha ervilha2 = new Ervilha(id, cor, textura);
        ervilha2.setId(2);
        ervilha2.setCor(cor);
        ervilha2.setTextura(textura);
        
        JOptionPane.showMessageDialog(null, ervilha1.toString()+"\n"
        +ervilha2.toString());
        
        
    }
    
}
