package lanchonete;

public class Cliente {
    private String nomeCliente;
    private int numeroDaMesa;

    private boolean pagou;

    public Cliente(String nome, int mesa, boolean pago){
        this.nomeCliente = nome;
        this.numeroDaMesa = mesa;
        this.pagou = pago;
    }
    public void pagar(){
        if (pagou == true){
            System.out.println("CLIENTE: " + nomeCliente + ", NUMERO DA MESA: " + numeroDaMesa + ", STATUS: PAGO");
        }else {
            System.out.println("CLIENTE NÃO PAGOU");
        }
    }
}
