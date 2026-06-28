public class Conta {

    private double chequeEspecial;
    private double deposito;
    private double saque;
    private double saldo;
    private boolean contaCriada;
    private boolean chequeEspecialUsado;

    // construtor
    public Conta(double saldo, double chequeEspecial, double deposito, double saque) {
        this.chequeEspecial = chequeEspecial;
        this.deposito = deposito;
        this.saque = saque;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public double getDeposito() {
        return deposito;
    }

    public boolean getCriada() {
        return contaCriada;
    }

    public boolean getChequeEspecialUsado() {
        return chequeEspecialUsado;
    }

    public void setDeposito(double deposito) {
        if (!contaCriada) {
            if (deposito <= 500.00) {
                this.chequeEspecial = 50.00;
            } else {
                this.chequeEspecial = deposito * 0.50;
            }
            this.saldo = this.saldo + this.chequeEspecial;
            this.contaCriada = true;
            System.out.println("\n Conta criada com sucesso!");
        }

        this.saldo = deposito + this.saldo;
        System.out.println("\n Valor de " + deposito + " depositado com sucesso!");

        if (chequeEspecialUsado) {
            var juros = saldo * 0.20;
            this.saldo = saldo - juros;
            this.chequeEspecialUsado = false;
            System.out.println(
                    "Voce estava usando o cheque especial, foi cobrado uma taxa de 20% sobre o saldo atual da conta.");
        }

        if (this.saldo >= this.chequeEspecial) {
            this.chequeEspecialUsado = false;
        }

    }

    public void setSaque(double saque) {
        this.saldo = this.saldo - saque;
        if (this.saldo < this.chequeEspecial) {
            this.chequeEspecialUsado = true;
            System.out.println(
                    "\n Valor do cheque especial usado, será cobrado 20% do valor usado do cheque especial!");
        }
        System.out.println("\n Valor de " + saque + " foi sacado com sucesso!");
    }
}
