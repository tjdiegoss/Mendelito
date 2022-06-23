
package br.com.tjdiego.mendelito;

/**
 *
 * @author Diego
 */
public class Cor {
    
    private boolean gene1;
    private boolean gene2;

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

    public Cor(boolean gene1, boolean gene2) {
        this.gene1 = gene1;
        this.gene2 = gene2;
    }
    
    
    
}
