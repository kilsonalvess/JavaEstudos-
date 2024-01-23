import java.util.Scanner;
public class Teste {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite senha: ");
        int senha = leitura.nextInt();

        while (senha!= 2022){
            System.out.println("senha invalida!!");
            senha = leitura.nextInt();
        }

        System.out.println("acesso permitido");

        leitura.close();
    }

    }

