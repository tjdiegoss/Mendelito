package br.com.tjdiego.mendelito;

/**
 *
 * @author Diego
 */
public class Fachada {

    /*Textura textura = new Textura(true, true,"");
    Cor cor = new Cor(true, true, "");
    Ervilha ervilha = new Ervilha(0, cor, textura);*/
    public Ervilha recuperarErvilha1(Ervilha ervilha) {

        String genes = "";
        Cor cor = new Cor(false, false, "");
        Textura textura = new Textura(false, false, "");
        exibirGenotipoCor(ervilha);
        genes = exibirGenotipoCor(ervilha);
        genes += exibirGenotipoTextura(ervilha);
        ervilha = new Ervilha(1, cor, textura,genes);
        //ervilha.setStringGenes(genes);
        verificarCor(ervilha);
        verificarTextura(ervilha);
        
        

        return ervilha;
    }

    public Ervilha recuperarErvilha2(Ervilha ervilha) {

        String genes = "";
        Cor cor = new Cor(true, true, "");
        Textura textura = new Textura(true, true, "");
        exibirGenotipoCor(ervilha);
        genes = exibirGenotipoCor(ervilha);
        genes += exibirGenotipoTextura(ervilha);
        ervilha = new Ervilha(2, cor, textura,genes);
        //ervilha2.setStringGenes(genes);
        verificarCor(ervilha);
        verificarTextura(ervilha);
        
        return ervilha;
    }
    
    public void verificarCor(Ervilha e) {

        
        if (e.getCor().isGene1() == false || e.getCor().isGene2() 
                == false) {
            e.getCor().setFenotipo("Amarela");
        } else 
            e.getCor().setFenotipo("Verde");
        
                
    }

    public void verificarTextura(Ervilha e) {

        if (e.getTextura().isGene1() == false || e.getTextura().isGene2() == false) {
            e.getTextura().setFenotipo("Lisa");
        } else {
            e.getTextura().setFenotipo("Rugosa");
        }
        
        

    }

    public String exibirGenotipoCor(Ervilha e) {
        String genotipoCor = "";

        
        if (e.getCor().isGene1()){
        
            genotipoCor = "a";
        } else
            genotipoCor = "A";
        
        if (e.getCor().isGene2()){
        
            genotipoCor += "a";
        } else
            
            genotipoCor += "A";
        

        return genotipoCor;
    }

    public String exibirGenotipoTextura(Ervilha e) {
        String genotipoTextura = "";

        {if (e.getTextura().isGene1() == false) {
            genotipoTextura = "V";
        } else {
            genotipoTextura = "v";
        }}
        {if (e.getTextura().isGene2() == false) {
            genotipoTextura += "V";
        } else {
            genotipoTextura += "v";
        }}
        return genotipoTextura;
    }

    public static void cruzarErvilhas(Ervilha e, Ervilha ee) {
    }

    public String calcularPorcentagem() {
        String porcentagem = "";
        return porcentagem;
    }

    public static void autoPolinizar(Ervilha e, Ervilha ee) {
    }

    public String mostrarParental(String s) {

        return s;
    }

    public String mostrarFilial1(String s) {

        return s;
    }

    public String mostrarFilial2(String s) {

        return s;
    }

}
