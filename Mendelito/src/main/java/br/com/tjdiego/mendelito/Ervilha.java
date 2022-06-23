
package br.com.tjdiego.mendelito;

/**
 *
 * @author Diego
 */
public class Ervilha {
    
    
    //Atributos
    private String cor;
    private String casca;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCasca() {
        return casca;
    }

    public void setCasca(String casca) {
        this.casca = casca;
    }

    public Ervilha(String cor, String casca) {
        this.cor = cor;
        this.casca = casca;
    }

    @Override
    public String toString() {
        return "A ervilha " + "possui uma coloração " + cor + 
                " e uma casca de aspecto " + casca;
    }

    
    
    
    
}
