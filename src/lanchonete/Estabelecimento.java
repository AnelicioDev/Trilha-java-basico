package lanchonete;

import java.util.Scanner;

public class Estabelecimento {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome do clente:");
        String nome = scanner.nextLine();

        System.out.println("Número da mesa:");
        int mesa = scanner.nextInt();

        System.out.println("Status de pagamento:");
        boolean pagamento = scanner.nextBoolean();

        Cliente cliente = new Cliente(nome, mesa, pagamento);
        cliente.pagar();

        scanner.close();

    }
}
