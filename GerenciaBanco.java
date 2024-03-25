public class GerenciaBanco {


    private String nomeCliente;
    private String sobrenomeCliente;
    private String cpfCliente;
    private double saldo;

    //Getters gerados para ter acesso dentro da classe testeBanco.
    public String getNomeCliente() {
        return nomeCliente;
    }

    //Getters gerados para ter acesso dentro da classe testeBanco.
    public String getSobrenomeCliente() {
        return sobrenomeCliente;
    }

    //Getters gerados para ter acesso dentro da classe testeBanco.
    public String getCpfCliente() {
        return cpfCliente;
    }

    //Não foi incluso o Setters por mótivos obvios, já se passa dentro dos parametros do construtor.


    //Construtor criado para seja passado os parametros nome, sobrenome e cpf.
    public GerenciaBanco(String nomeCliente, String sobrenomeCliente, String cpfCliente) {
        this.nomeCliente = nomeCliente;
        this.sobrenomeCliente = sobrenomeCliente;
        this.cpfCliente = cpfCliente;
        this.saldo = saldo;


    }

    //Foi criado um método onde faz a consulta do saldo.
    public double consultarSaldo() {
        System.out.println("Seu saldo é: " + saldo);
        return saldo;

    }

    //Foi criado um método onde faz o deposito do valor
    public void despositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Foi um deposito de R$" + valor);


        } else {
            System.out.println("Saldo insuficiente ou valor de retirada inválida.");
        }
    }

    //Criado o método onde faz o saque do mesmo.
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Foi um saque no valor de R$" + valor);


        } else {
            System.out.println("Saldo insuficiente ou valor de retirada inválida.");
        }
    }
}
