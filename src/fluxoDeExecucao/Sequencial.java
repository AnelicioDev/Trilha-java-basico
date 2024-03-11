package fluxoDeExecucao;

public class Sequencial {
    public static void main(String[] args) {
        // Declaração e inicialização de variáveis
        int a = 5;
        int b = 10;
        
        // Operações aritméticas
        int soma = a + b;
        int subtracao = b - a;
        int multiplicacao = a * b;
        double divisao = (double) b / a; // Conversão de int para double para evitar a divisão inteira
        
        // Saída de dados
        System.out.println("A soma é: " + soma);
        System.out.println("A subtração é: " + subtracao);
        System.out.println("A multiplicação é: " + multiplicacao);
        System.out.println("A divisão é: " + divisao);
    }
}
