package excecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            String[] vect = sc.nextLine().split(" ");
            int posicao = sc.nextInt();
            System.out.println(vect[posicao]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Posição invalida");
        }
        catch(InputMismatchException e){
            System.out.println("Inut error");
        }
        finally{
            if (sc != null) {
                sc.close();
                System.out.println("Programa finalizado");
            }
        }

    }
}
