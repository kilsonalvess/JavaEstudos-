import java.util.Scanner;
public class Laco {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int N = leitura.nextInt();
        int soma = 0;

        for (int i = 0; i < N; i++) {
            int x = leitura.nextInt();
            soma = soma + x;

            
        }

        System.out.println(soma);

        leitura.close();
    }
}
