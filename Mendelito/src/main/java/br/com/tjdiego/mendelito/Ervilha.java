
package br.com.tjdiego.mendelito;

/**
 *
 * @author Diego
 */
public class Ervilha {
    
    
    //Atributos
    private int id;
    private Cor cor;
    private Textura textura;
    private String stringGenes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public Textura getTextura() {
        return textura;
    }

    public void setTextura(Textura textura) {
        this.textura = textura;
    }

    public String getStringGenes() {
        return stringGenes;
    }

    public void setStringGenes(String stringGenes) {
        this.stringGenes = stringGenes;
    }
    
    

    //Construtor
    public Ervilha() {
        
    }
    
    
    
    public Ervilha(int id, Cor cor, Textura textura, String stringGenes) {
        super();
        this.id = id;
        this.cor = cor;
        this.textura = textura;
        this.stringGenes = stringGenes;
    }

   

    

    @Override
    public String toString() {
        return "A ervilha " + id + " possui uma coloração " + 
                cor.getFenotipo()+ 
                " e uma casca de textura " + textura.getFenotipo()+
                        ". Possuindo a combinação genética: "+
                        stringGenes;
    }

    

    
    
    
    
}
