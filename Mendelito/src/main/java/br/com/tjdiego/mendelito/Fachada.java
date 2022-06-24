
package br.com.tjdiego.mendelito;

/**
 *
 * @author Diego
 */
public class Fachada {
    
    public String recuperarErvilha(Ervilha ervilha){
        
        ervilha = new Ervilha(0, null, null);
        verificarCor(ervilha);
        verificarTextura(ervilha);
    return ervilha.toString();
    }
    
    public void verificarCor(Ervilha e){
    
    }
    
    public void verificarTextura(Ervilha e){
    
    }
    
    public String exibirGenotipoCor(){
    String s = "";
    return s;
    }
    
    public String exibirGenotipoTextura(){
    String s = "";
    return s;
    }
        
    public static void cruzarErvilhas(Ervilha e,Ervilha ee){}
    
    public static void autoPolinizar(Ervilha e,Ervilha ee){}
    
    public String mostrarParental(String s){
    
    return s;
    }
    
    public String mostrarFilial1(String s){
    
    return s;
    }
    
    public String mostrarFilial2(String s){
    
    return s;
    }
    
}
