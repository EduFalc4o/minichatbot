import java.util.Scanner;

public class operacoes {

    Scanner sc = new Scanner(System.in);

    public void executarEscolha(int escolha, saldo conta, String nome) {
        double adicionarSaldo = 0;
        double pagar = 0;
        switch (escolha) {


            case 1:
                System.out.println("Opção 1: Adicionar Saldo");
                System.out.println("Qual o valor que deseja adicionar ? : ");

                adicionarSaldo = sc.nextDouble();
                conta.saldoAtual += adicionarSaldo;

                System.out.println("Saldo adicionado: " + adicionarSaldo);
                System.out.println("Saldo adicionado com sucesso");
                break;


            case 2:
                System.out.println("Valor do pagamento: ");

                pagar = sc.nextDouble();
                conta.saldoAtual -= pagar;

                System.out.println("Valor a ser pago: " + pagar);
                System.out.println("Pagamento realizado com sucesso!");
                break;


            case 3:
                System.out.println("Opção 3: Verificar meu Saldo");
                System.out.println(nome + ", seu saldo atual é: " + conta.saldoAtual);
                break;


            case 4:
                break;


            default:
                System.out.println("Opção inválida.");
                break;

        }
    }
}
