package entities;

public class Poupanca extends Conta {

    private double taxaDejurus;

    public Poupanca(String nome, int numeroDaConta, double saldoConta, double taxaDejurus) {
        super(nome, numeroDaConta, saldoConta);
        this.taxaDejurus = taxaDejurus;
    }

    @Override
    public void sacar(double valor) {
        saldoConta = saldoConta - valor - taxaDejurus;
    }

}
