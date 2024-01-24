import java.util.Scanner;

public class ContaCorrente {

    String nome;
    String cpf;
    double saldo;

    double numero_da_conta;

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
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void Exibir_Dados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Saldo: " + saldo);
        System.out.println("Numero da Conta: " + numero_da_conta);
    }

    public Double depositar() {
        System.out.println("Digite o valor a ser depositado: ");
        Scanner valor = new Scanner(System.in);
        double deposito = valor.nextDouble();
        return saldo += deposito;




    }

}
