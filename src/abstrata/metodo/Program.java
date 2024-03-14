package metodo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Forma> formaLista = new ArrayList<>();

        System.out.print("Quantidade de formas: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Forma #" + i + " dados:");
            System.out.print("Retangulo ou circulo (r/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Cor (PRETO/AZUL/VERMELHO): ");
            Cor cor = Cor.valueOf(sc.next());

            if (ch == 'r') {
                System.out.print("Largura: ");
                double largura = sc.nextDouble();
                System.out.print("Altura: ");
                double altura = sc.nextDouble();
                formaLista.add(new Retangulo(cor, largura, altura));
            }else{
                System.out.print("Raio: ");
                double raio = sc.nextDouble();
                formaLista.add(new Circulo(cor, raio));
            }

        }

        System.out.println();
        System.out.println("Área da forma: ");
        for(Forma forma : formaLista){
            System.out.println(String.format("%.2f", forma.area()));
        }

        sc.close();
    }
}
