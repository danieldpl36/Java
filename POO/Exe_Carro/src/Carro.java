public class Carro {

    private int marcha;
    private int velocidade;
    private int direcao;
    private boolean carroCriado;
    private boolean carroLigado;

    public Carro(int direcao, int marcha, int velocidade) {
        this.marcha = marcha;
        this.velocidade = velocidade;
        this.direcao = direcao;
    }

    public int velocidade(){
        return velocidade;
    }

    public boolean carroLigado() {
        return carroLigado;
    }

    public void setLigarCarro() {
        if (!carroCriado) {
            this.carroCriado = true;
            this.carroLigado = false;
            System.out.println("\n Carro foi criado, tente liga-lo novamente!");
        } else {
            this.carroLigado = true;
            System.out.println("\n Carro foi ligado!");
        }
        this.marcha = 0;
        this.velocidade = 0;
    }

    public void setDelisgarCarro() {
        if (carroCriado) {
            if (velocidade == 0 && marcha == 0) {
                System.out.println("\n Carro desligado!.");
                this.carroLigado = false;
            } else {
                System.out.println("\n O carro está em movimento, pare o carro antes de tentar desliga-lo!");
            }
        } else{
            System.out.println("\n O carro nao foi criado! Tente liga-lo antes dessa açao.");
        }
    }

    public void setDirecao(int direcao) {
        if (carroCriado && carroLigado) {

            if (this.velocidade >= 1 || this.velocidade <= 40) {
                if (direcao == 1){
                    this.direcao = 1;
                    System.out.println("Carro direcionado para esquerda!");
                } else if( direcao == 2){
                    this.direcao = 2;
                    System.out.println("Carro direcionado para direita!");
                } else{
                    System.out.println("Opçao invalida!");
                }
            } else {
                System.out.println("\n Não é permitido trocar direçao na velocidade atual, reduza antes de solicitar esta açao!");
            }

        } else {
            System.out.println("\n O carro nao foi criado ou está desligado! Tente liga-lo antes dessa açao.");
        }
    }

    public void setAcelerar() {
        if (carroCriado && carroLigado) {
            if (this.marcha == 0) {
                System.err.println("O carro não pode acelerar no ponto morto!");
            } else if ((this.marcha == 1) && (this.velocidade >= 0 && this.velocidade <= 20)) {
                this.velocidade++;
                System.out.println("Velocidade aumentada!");
            } else if ((this.marcha == 2) && (this.velocidade >= 21 && this.velocidade <= 40)) {
                this.velocidade++;
                System.out.println("Velocidade aumentada!");
            } else if ((this.marcha == 3) && (this.velocidade >= 41 && this.velocidade <= 60)) {
                this.velocidade++;
                System.out.println("Velocidade aumentada!");
            } else if ((this.marcha == 4) && (this.velocidade >= 61 && this.velocidade <= 80)) {
                this.velocidade++;
                System.out.println("Velocidade aumentada!");
            } else if ((this.marcha == 5) && (this.velocidade >= 81 &&this.velocidade <= 100)) {
                this.velocidade++;
                System.out.println("Velocidade aumentada!");
            } else if ((this.marcha == 6) && (this.velocidade >= 101 && this.velocidade <= 120)) {
                this.velocidade++;
                System.out.println("Velocidade aumentada!");
            } else if (this.velocidade > 120) {
                System.out.println("\n Limite maximo atingido!!");
            } else {
                System.out.println("\n Não foi possivel acelerar.");
                System.out.println("Marcha: " + this.marcha + " | Velocidade: " + this.velocidade);
            }
        } else {
            System.out.println("\n O carro nao foi criado ou está desligado! Tente liga-lo antes dessa açao.");
        }
    }

    public void setReduzir() {
        if (carroCriado && carroLigado) {
            if (this.velocidade != 0) {
                this.velocidade--;
                System.out.println("\n Velocidade reduzida!");
            } else {
                System.out.println("\n O carra está parado, não é possivel reduzir a velocidade.");
            }
            if ((this.velocidade == 0) || (this.velocidade == 20) || (this.velocidade == 40) ||
                    (this.velocidade == 60) || (this.velocidade == 80) || (this.velocidade == 100)) {
                this.marcha--;
                System.out.println("Marcha reduzida para " + this.marcha);
            }
        } else {
            System.out.println("\n O carro nao foi criado ou está desligado! Tente liga-lo antes dessa açao.");
        }
    }

    public void setMarcha(int marcha) {
        if (carroCriado && carroLigado) {
            if (this.marcha == 0) {
                if (marcha == 1) {
                    this.marcha = marcha;
                    System.out.println("\n Marcha trocada!");
                } else {
                    System.out.println("\n Não foi possivel trocar a marcha, tente novamente.");
                }
            } else if (this.marcha > 0) {
                int difMarcha = marcha - this.marcha;
                if (difMarcha == 1) {
                    this.marcha = marcha;
                    System.out.println("\n Marcha trocada!");
                } else {
                    System.out.println("\n Não foi possivel trocar a marcha, tente novamente.");
                }
            }
        } else {
            System.out.println("\n O carro nao foi criado ou está desligado! Tente liga-lo antes dessa açao.");
        }
    }
}
