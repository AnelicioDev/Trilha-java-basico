package entities;

public final class Poupanca extends Conta {

    private double taxaDejurus;

    public Poupanca(String nome, int numeroDaConta, double saldoConta, double taxaDejurus) {
        super(nome, numeroDaConta, saldoConta);
        this.taxaDejurus = taxaDejurus;
    }

    @Override
    public final void sacar(double valor) {
        super.sacar(valor);
        saldoConta -= taxaDejurus;
    }

}
