import java.util.Scanner;

public class ContaCorrente {

    private  String nome;
    private  String cpf;
    private double saldo;
    private double numero_da_conta;
    public double y;


    public ContaCorrente (){
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
        this.numero_da_conta = numero_da_conta;
        this.y = y;
    }

    public void setNumero_da_conta(double numero_da_conta) {
        this.numero_da_conta = numero_da_conta;
    }

    public double getNumero_da_conta() {
        return numero_da_conta;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return saldo + y ;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void Exibir_Dados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Numero da Conta: " + numero_da_conta);
    }

    public void depositar() {
        System.out.println("Digite o valor a ser depositado: ");
        Scanner valor = new Scanner(System.in);
        double deposito = valor.nextDouble();
        saldo =+ deposito;
        



    }

    public void transferencia () {
        System.out.println("Valor a ser transferido: ");
        Scanner entrada_valor = new Scanner(System.in);
        double x = entrada_valor.nextDouble();
        saldo =- x;


    }

    public String toString(){
        return nome
                + ", $";


    }




}
