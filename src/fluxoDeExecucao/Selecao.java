package fluxoDeExecucao;

import java.util.Scanner;

public class Selecao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();;
        
        if (idade >= 18) {
            System.out.println("Você é maior de idade");
        }else{
            System.out.println("Você não é maior de idade");
        }

        switch (idade) {
            case 18:
                System.out.println("Você é maior de idade");
            break;

            case 20:
                System.out.println("Você é maior de idade");
            break;
        
            default:
                System.out.println("Você não é maior de idade");
            break;
        }

        sc.close();
    }
}
