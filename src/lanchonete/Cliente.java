package lanchonete;

public class Cliente {
    private final String nomeCliente;
    private final int numeroDaMesa;

    private final boolean pagou;

    public Cliente(String nome, int mesa, boolean pago){
        this.nomeCliente = nome;
        this.numeroDaMesa = mesa;
        this.pagou = pago;
    }
    public void pagar(){
        if (pagou){
            System.out.println("CLIENTE: " + nomeCliente + ", NUMERO DA MESA: " + numeroDaMesa + ", STATUS: PAGO");
        }else {
            System.out.println("CLIENTE NÃO PAGOU");
        }
    }
}
