package entities;

public class Conta {
    private String nome;
    private int numeroDaConta;
    protected double saldoConta;

    public Conta(String nome, int numeroDaConta, double saldoConta) {
        this.nome = nome;
        this.numeroDaConta = numeroDaConta;
        this.saldoConta = saldoConta;
    }

    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public int getNumeroDaConta() {
        return numeroDaConta;
    }



    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }



    public double getSaldoConta() {
        return saldoConta;
    }



    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    
    public void sacar(double valor){
        saldoConta -= valor;
    }


}
