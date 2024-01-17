package lanchonete;

public class Cliente {
    private final String nomeCliente;
    private final int numeroDaMesa;

    private final boolean pagou;

    public Cliente(String nomeCliente, int numeroDaMesa, boolean pagou){
        this.nomeCliente = nomeCliente;
        this.numeroDaMesa = numeroDaMesa;
        this.pagou = pagou;
    }
    public void pagar(){
        if (pagou){
            System.out.println("CLIENTE: " + nomeCliente + ", NUMERO DA MESA: " + numeroDaMesa + ", STATUS: PAGO");
        }else {
            System.out.println("CLIENTE NÃO PAGOU!");
        }
    }
}
