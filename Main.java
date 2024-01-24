import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int x = 0;
        while (true) {



            System.out.println("*****************************************************************");
            System.out.println("-----BANCO BRADESCO S.A-----");
            System.out.println("-----DIGITE A OPCAO DESEJADA-----");
            System.out.println("-----1- EXIBIR DADOS DA CONTA-----");
            System.out.println("-----2- DEPOSITO EM CONTA-----");
            System.out.println("*****************************************************************");


            ContaCorrente Dados_Da_Conta = new ContaCorrente();

            Dados_Da_Conta.nome = "KILSON ALVES DOS SANTOS LEITAO";
            Dados_Da_Conta.cpf = "08417606408";
            Dados_Da_Conta.saldo = 0;
            Dados_Da_Conta.numero_da_conta = 0735.24200;



            Scanner leitura = new Scanner (System.in);
            int opcao = leitura.nextInt();


            if (opcao == 1){
                Dados_Da_Conta.Exibir_Dados();
            }

            else if (opcao == 2) {
                Dados_Da_Conta.depositar();
                Dados_Da_Conta.Exibir_Dados();






            }


        }

















    }
}
