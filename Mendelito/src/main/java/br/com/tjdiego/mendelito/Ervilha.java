
package br.com.tjdiego.mendelito;

/**
 *
 * @author Diego
 */
public class Ervilha {
    
    
    //Atributos
    private int id;
    private Cor cor;
    private Casca casca;

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

    public Casca getCasca() {
        return casca;
    }

    public void setCasca(Casca casca) {
        this.casca = casca;
    }

    public Ervilha(int id,Cor cor, Casca casca) {
        this.id = id;
        this.cor = cor;
        this.casca = casca;
    }

    @Override
    public String toString() {
        return "A ervilha " + id + " possui uma coloração " + cor + 
                " e uma casca de textura " + casca;
    }

    
    
    
    
}
