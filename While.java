import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite numero: ");
        int x = leitura.nextInt();
        int soma = 0;

        while(x != 0){
            //*Atribuição Acumulativa
            soma += + x;
            x = leitura.nextInt();
        }
        System.out.println("A soma dos valore digitados foram:"+soma);
    }
}
