package lanchonete;

public class Estabelecimento {
    public static void main(String[] args){
        Almoxarife almoxarife = new Almoxarife();
        almoxarife.entradaDeItens();
        almoxarife.saindaDeItens();

        Cozinheiro cozinheiro = new Cozinheiro();
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        Atendente atendente = new Atendente();
        atendente.serviMesa();
        atendente.pegaLancheCozinha();

        Cliente cliente = new Cliente();

    }
}
