
package br.com.tjdiego.mendelito;

/**
 *
 * @author Diego
 */
public class GenotipoErvilha {
    
    private boolean genecor1;
    private boolean genecor2;
    private boolean genetextura1;
    private boolean genetextura2;

    public boolean isGenecor1() {
        return genecor1;
    }

    public void setGenecor1(boolean genecor1) {
        this.genecor1 = genecor1;
    }

    public boolean isGenecor2() {
        return genecor2;
    }

    public void setGenecor2(boolean genecor2) {
        this.genecor2 = genecor2;
    }

    public boolean isGenetextura1() {
        return genetextura1;
    }

    public void setGenetextura1(boolean genetextura1) {
        this.genetextura1 = genetextura1;
    }

    public boolean isGenetextura2() {
        return genetextura2;
    }

    public void setGenetextura2(boolean genetextura2) {
        this.genetextura2 = genetextura2;
    }
    
    

    public GenotipoErvilha(boolean genecor1, boolean genecor2, boolean genetextura1, boolean genetextura2) {
        this.genecor1 = genecor1;
        this.genecor2 = genecor2;
        this.genetextura1 = genetextura1;
        this.genetextura2 = genetextura2;
    }
    
    

    }

