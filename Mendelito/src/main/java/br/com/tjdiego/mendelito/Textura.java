
package br.com.tjdiego.mendelito;

/**
 *
 * @author Diego
 */
public class Textura {
    
    private boolean gene1;
    private boolean gene2;
    private String textura;

    public boolean isGene1() {
        return gene1;
    }

    public void setGene1(boolean gene1) {
        this.gene1 = gene1;
    }

    public boolean isGene2() {
        return gene2;
    }

    public void setGene2(boolean gene2) {
        this.gene2 = gene2;
    }

    public Textura(boolean gene1, boolean gene2) {
        this.gene1 = gene1;
        this.gene2 = gene2;
    }

    public String getTextura() {
        return textura;
    }

    public void setTextura(String textura) {
        this.textura = textura;
    }

    public Textura(boolean gene1, boolean gene2, String textura) {
        this.gene1 = gene1;
        this.gene2 = gene2;
        this.textura = textura;
    }
    
    
    
}
