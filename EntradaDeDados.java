import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {

        //*Inicialização de Entrada de Dados
        Scanner leitura = new Scanner(System.in);

        //*Recebendo uma varivael String e jogando para nome
        System.out.println("Digite seu nome: ");
        String nome = leitura.nextLine();

        //*Recebendo uma varivel inteira e jogando para idade
        System.out.println("Qual a sua idade");
        int idade = leitura.nextInt();

        System.out.println("Qual a sua altura ? ");
        double altura = leitura.nextDouble();

        System.out.println("-----------------CLIENTE----------------------");
        System.out.println("Nome: "+ nome);
        System.out.println("idade: "+idade+" "+"anos");
        System.out.println("Altura: "+altura);













    }
}
