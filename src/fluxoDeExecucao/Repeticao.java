package fluxoDeExecucao;

public class Repeticao {
    public static void main(String[] args) {

        String[] listaNoma = {"Maria", "Ana", "Pedro", "Alex", "Rita"};

        int contador = 0;
        while (contador <= 5) {
            System.out.println(contador);
            contador++;
        }

        do{
            System.out.println(contador);
            contador++;
        }while(contador < 5);


        for(int i = 0; i <= listaNoma.length; i++){
            System.out.println(listaNoma[i]);
        }

        for(String lista : listaNoma ){
            System.out.println(lista);
        }
    }
}
