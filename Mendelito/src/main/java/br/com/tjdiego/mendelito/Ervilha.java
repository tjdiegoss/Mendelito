
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

    //Construtor
    public Ervilha(int id, Cor cor, Textura textura) {
        this.id = id;
        this.cor = cor;
        this.textura = textura;
    }

    

    @Override
    public String toString() {
        return "A ervilha " + id + " possui uma coloração " + 
                cor.getFenotipo()+ 
                " e uma casca de textura " + textura.getFenotipo();
    }

    

    
    
    
    
}
