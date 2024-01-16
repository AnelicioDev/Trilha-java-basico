package lanchonete;

public class Cozinheiro {
    public void adicionarLancheNoBalcao(){
        System.out.print("ADICIONAR LANCHE NATURAL");
    }
    public void adicionarSucoNoBalcao(){
        System.out.print("ADICIONAR SUCO NO BALCÃO");
    }
    public void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }
}
