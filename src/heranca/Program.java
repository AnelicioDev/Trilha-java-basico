import entities.Conta;
import entities.Poupanca;

public class Program {
    public static void main(String[] args) {
        Conta conta = new Conta("Alex", 1001, 0.0);
        Poupanca poupanca = new Poupanca("Maria", 1002, 200.00, 10.0);

        Conta conta1 = poupanca;
        conta1.sacar(100.0);

        System.out.println(conta1.getSaldoConta());

    }
}