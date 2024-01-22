import org.w3c.dom.ls.LSOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o numero de funcionarios: ");

        int funcionarios  = leitura.nextInt();

        System.out.println("Digite o valor: ");
        int calculo = leitura.nextInt();

        System.out.println("Digite o numero de hora: ");
        double hora = leitura.nextDouble();


        System.out.println("Numero de funcionarios: "+funcionarios);
        System.out.println("Salario: "+calculo * hora);

















    }
}
