
package br.com.tjdiego.mendelito;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Teste {
    
    public static void main (String [] args){
    
        String percentual = "";
//Primeira ervilha
        String genotipoCor = "";
        String genotipoTextura = "";
        int id = 0;
        Cor cor = new Cor(false, false,""); 
        Textura textura = new Textura(false, false,"");
        
        Ervilha ervilha1 = new Ervilha(id, cor, textura);
        ervilha1.setId(1);
        ervilha1.setCor(cor);
        //Verificando as cores
        if (cor.isGene1()== false || cor.isGene2()== false){
        cor.setFenotipo("Amarelo");}
        else
        cor.setFenotipo("Verde");
        if (cor.isGene1()== false){
        genotipoCor = "A";
        }
        else
            genotipoCor = "a";
        if(cor.isGene2()== false){
            genotipoCor += "A";
        }
        else
            genotipoCor += "a";
        
        //Verificando as texturas
        if (textura.isGene1()== false || textura.isGene2()== false){
        textura.setFenotipo("Lisa");}
        else
        textura.setFenotipo("Rugosa");
        
        ervilha1.setTextura(textura);
        
        if (textura.isGene1()== false){
        genotipoTextura = "V";
        }
        else
            genotipoTextura = "v";
        if(textura.isGene2()== false){
            genotipoTextura += "V";
        }
        else
            genotipoTextura += "v";
        
        //Segunda Ervilha
        String genotipoCor2 = "";
        String genotipoTextura2 = "";
        int id2 = 1;
        Cor cor2 = new Cor(true, true,""); 
        Textura textura2 = new Textura(false, false,"");
        Ervilha ervilha2 = new Ervilha(id2, cor, textura);
        ervilha2.setId(2);
        ervilha2.setCor(cor2);
        if (cor2.isGene1()== true && cor2.isGene2()== true){
        cor2.setFenotipo("Verde");}
        else
        cor2.setFenotipo("Amarelo");
        
        if (cor.isGene2()== true){
        genotipoCor2 = "a";
        }
        else
            genotipoCor2 = "A";
        if(cor2.isGene2()== true){
            genotipoCor2 += "a";
        }
        else
            genotipoCor2 += "A";
        
        //Verificando texturas
        if (textura2.isGene2()== true || textura2.isGene2()== true)textura2.setFenotipo("Lisa");
        else {
            textura2.setFenotipo("Rugosa");
        }
        ervilha2.setTextura(textura2);
        
        if (textura2.isGene1()== true){
        genotipoTextura2 += "v";
        }
        else
            genotipoTextura2 += "V";
        if(textura2.isGene2()== true){
            genotipoTextura2 += "v";
        }
        else
            genotipoTextura2 += "V";
        
        JOptionPane.showMessageDialog(null, ervilha1.toString()+" Genótipo: "
               + genotipoCor+genotipoTextura+"\n"
        +ervilha2.toString()+" Genótipo: " + genotipoCor2+genotipoTextura2+"\n"
        +percentual);
        
        
    }
    
}
