import java.util.Scanner;

public class TesteBanco {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        //Vamos fazer a solicitação do cliente, nome.. sobrenome.. cpf
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite seu sobreenome: ");
        String sobrenome = sc.nextLine();

        System.out.println("Digite seu cpf: ");
        String cpf = sc.nextLine();


        //Fazendo a instanciação da classe GerenciaBanco
        GerenciaBanco gerenciaBanco = new GerenciaBanco(nome, sobrenome, cpf);

        double saldo = 0.0;


        int opcao = 0;
        while (opcao != 4) {
            System.out.println("\nEscolha uma opção abaixo:");
            System.out.println("1 - Consultar saldo:");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Encerrar");

            opcao = sc.nextInt();
            double valor;

            if (opcao == 1) {
                System.out.println("Seu saldo atual: R$" + saldo);
            } else if (opcao == 2) {
                System.out.println("Digite o valor do depósito:");
                valor = sc.nextDouble();
                saldo += valor;

            } else if (opcao == 3) {
                System.out.println("Digite o valor do saque:");
                valor = sc.nextDouble();
                if (saldo >= valor) {
                    saldo -= valor;
                    System.out.println("Saque de R$" + valor);
                } else {
                    System.out.println("Saldo insuficiente para realizar o saque.");
                }
            } else if (opcao != 4) {
                System.out.println("Opção Inválida");
            }

        }

        System.out.println("Encerrando aplicação...");
        sc.close();

    }
}