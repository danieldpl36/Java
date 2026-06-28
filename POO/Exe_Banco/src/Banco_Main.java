
import java.util.Scanner;

public class Banco_Main {

    public static Scanner scanner = new Scanner(System.in);
    public static Conta conta = new Conta(0, 0, 0, 0);

    public static void main(String[] args) {

        var opcao = 1;
        do {
            System.out.println("*** Escolha uma das opçoes ***");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Consultar cheque especial");
            System.out.println("3. Depositar dinheiro");
            System.out.println("4. Sacar dinheiro");
            System.out.println("5. Pagar um boleto");
            System.out.println("6. Verificar uso do cheque especial");
            System.out.println("0. Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> getSaldo();
                case 2 -> getSaldoChequeEspecial();
                case 3 -> setDeposito();
                case 4 -> setSaque();
                case 5 -> setPagamento();
                case 6 -> getSituacaoChequeEspecial();
            }
        } while (opcao != 0);
    }

    private static void getSaldo() {
        if (!conta.getCriada()) {
            System.out.println("\n Conta nao foi criada, depossite um valor antes de consultar.");
        } else {
            System.out.println("\n Saldo da conta bancaria: " + conta.getSaldo());
        }
    }

    private static void getSaldoChequeEspecial() {
        if (!conta.getCriada()) {
            System.out.println("\n Conta nao foi criada, depossite um valor antes de consultar.");
            System.out.println("\n Conta nao foi criada, depossite um valor antes de consultar.");
        } else {
            System.out.println("\n Cheque Especial: " + conta.getChequeEspecial());
        }
    }

    private static void setDeposito() {
        System.out.println("\n Digite o valor para deposito: ");
        var deposito = scanner.nextDouble();
        conta.setDeposito(deposito);
    }

    private static void setSaque() {
        if (conta.getCriada()) {
            System.out.println("\n Digite o valor do saque: ");
            var saque = scanner.nextDouble();
            conta.setSaque(saque);
            System.out.println("\n Saque realizado com sucesso!");
        } else {
            System.out.println("\n Conta nao foi criada, depossite um valor antes de consultar.");
        }
    }

    private static void setPagamento() {
        if (conta.getCriada()) {

            System.out.println("\n Digite o valor do pagamento: ");
            var pagamento = scanner.nextDouble();
            conta.setSaque(pagamento);
            System.out.println("\n Pagamento realizado com sucesso!");
        } else {
            System.out.println("\n Conta nao foi criada, depossite um valor antes de consultar.");
        }
    }

    private static void getSituacaoChequeEspecial() {
        if (conta.getCriada()) {
            if (conta.getChequeEspecialUsado()) {
                System.out.println("\n Voce está usando o cheque especial!");
            } else {
                System.out.println("\n Voce nao está usando o cheque especial.");
            }
        } else {
            System.out.println("\n Conta nao foi criada, depossite um valor antes de consultar.");
        }
    }
}
