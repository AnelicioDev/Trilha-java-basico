package classe;

public class Program {
    public static void main(String[] args) {
        //Conta conta = new Conta("Alex", 1001, 1250.00);
        Poupanca contPoupanca = new Poupanca("Maria", 1002, 1550.00, 10.00);
        //conta.sacar(200.00);
        contPoupanca.sacar(550.00);

        //System.out.println(conta.getSaldo());
        System.out.println(contPoupanca.getSaldo());
    }
}
