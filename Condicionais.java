import java.util.Scanner;
public class Condicionais {
    public static void main(String[] args) {
        //*Expressões comparativas
        //* < menor
        //* > maior
        //* == igual
        //* <= menor igual
        //* >= maior igual
        //!= diferente
        //*&& e todas as condições tem que ser verdadeiras
        //* || ou basta uma ser verdadeira para o resultado ser verdadeiro
        //* ! não


        //* De acordo com a hora que o usuario digitar ele vai falar o turno do dia na tela
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite a hora: ");

        int hora = leitura.nextInt();

        if (hora >= 0) {
            System.out.println("Você digitou um horario pelo periodo da manhã");

        }

        else if (hora >=12) {
            System.out.println("Você digitou um horario pelo periodo da tarde");

        }

        else if (hora >=18){
            System.out.println("Você digitou um horario pela noite");
        }



    }
}

