package classe;

public class Poupanca extends Conta{
    private double taxa;

    public Poupanca(String nome, int numeroConta, double saldo, double taxa) {
        super(nome, numeroConta, saldo);
        this.taxa = taxa;
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor);
        saldo -= taxa;
    }
}
