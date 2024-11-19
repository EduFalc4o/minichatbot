import java.util.Scanner;

public class Main {
    public static int escolha;

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        saldo minhaConta = new saldo();

        operacoes Operacoes = new operacoes();


        System.out.println("Seja bem vindo ao UniparCoins");
        System.out.println("digite seu nome");
        String nome = sc.nextLine();


        System.out.println("Usuário: " + nome);
        System.out.println("Seu saldo atual é de : " + minhaConta.saldoAtual);


        System.out.println("Seja bem vindo à sua carteira digital");


        do {
            System.out.println("Escolha uma opção:");
            System.out.println("(1)  Adicionar Saldo");
            System.out.println("(2)  Realizar Pagamento");
            System.out.println("(3)  Verificar Saldo");
            System.out.println("(4)  Sair");


            escolha = sc.nextInt();
            Operacoes.executarEscolha(escolha, minhaConta, nome);


        } while (escolha != 4);
        System.out.println("Obrigado por usar o UniparCoins");
    }
}

class saldo {
    public double saldoAtual = 0;
}