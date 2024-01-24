import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        while (true) {

            ContaCorrente Dados_Da_Conta = new ContaCorrente();
            Menu Exibir_Menu = new Menu();


            Exibir_Menu.exibirmenu();
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
