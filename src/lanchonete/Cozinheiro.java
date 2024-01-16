package lanchonete;

public class Cozinheiro {
    public void adicionarLancheNoBalcao(){
        System.out.println("ADICIONAR LANCHE NATURAL");
    }
    public void adicionarSucoNoBalcao(){
        System.out.println("ADICIONAR SUCO NO BALCÃO");
    }
    public void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }
}
