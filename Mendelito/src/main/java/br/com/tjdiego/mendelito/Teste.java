
package br.com.tjdiego.mendelito;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Teste {
    
    public static void main (String [] args){
    
        int id = 0;
        String cor = "", casca = "";
        
        Ervilha ervilha1 = new Ervilha(id,cor, casca);
        ervilha1.setId(1);
        ervilha1.setCor("verde");
        ervilha1.setCasca("liso");
        
        Ervilha ervilha2 = new Ervilha(id, cor, casca);
        ervilha2.setId(2);
        ervilha2.setCor("amarela");
        ervilha2.setCasca("rugoso");
        
        JOptionPane.showMessageDialog(null, ervilha1.toString()+"\n"
        +ervilha2.toString());
        //JOptionPane.showMessageDialog(null, ervilha2.toString());
        
        /*JOptionPane.showMessageDialog(null, "Ervilha de cor "+ ervilha1.getCor()+ 
                " e casca " + ervilha1.getCasca());
        JOptionPane.showMessageDialog(null, "Ervilha de cor "+ ervilha2.getCor()+ 
                " e casca " + ervilha2.getCasca());*/
        
        /*boolean gene1, gene2;
         gene1 = true;
         gene2 = true;
         
         if (gene1 == false ){
             JOptionPane.showMessageDialog(null,"Dominate");
         }else
             JOptionPane.showMessageDialog(null,"Recessivo");
        //System.out.println("Teste");*/
        
    }
    
}
