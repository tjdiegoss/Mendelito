package br.com.tjdiego.mendelito;

/**
 *
 * @author Diego
 */
public class Fachada {
    
    Textura textura = new Textura(true, true,"");
    Cor cor = new Cor(true, true, "");
    Ervilha ervilha = new Ervilha(0, cor, textura);

    public String recuperarErvilha1(Ervilha ervilha) {

        Textura textura = new Textura(true, true, "Lisa");
        Cor cor = new Cor(true, true, "Amarela");
        ervilha = new Ervilha(1, cor, textura);
        verificarCor(ervilha);
        verificarTextura(ervilha);
        return ervilha.toString();
    }
    
    public String recuperarErvilha2(Ervilha ervilha) {

        Textura textura = new Textura(true, true, "Rugosa");
        Cor cor = new Cor(true, true, "Verde");
        ervilha = new Ervilha(0, cor, textura);
        verificarCor(ervilha);
        verificarTextura(ervilha);
        return ervilha.toString();
    }

    public void verificarCor(Ervilha e) {

    }

    public void verificarTextura(Ervilha e) {

    }

    public String exibirGenotipoCor() {
        String s = "";
        return s;
    }

    public String exibirGenotipoTextura() {
        String s = "";
        return s;
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
