
//* Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
import java.util.Scanner;

public class ExercicioCondicional {
    public static void main(String[] args) {
         Scanner leitura = new Scanner (System.in);
        System.out.println("Digite numero:");
         int x = leitura.nextInt();

         if (x % 2 == 0 ) {
             System.out.println("NUMERO PAR");
         }

         else{
             System.out.println("NUMERO IMPAR");

         }



    }

}
