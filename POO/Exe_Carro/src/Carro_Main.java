
import java.util.Scanner;

public class Carro_Main {

    public static Scanner scanner = new Scanner(System.in);
    public static Carro carro = new Carro(0, 0, 0);
    public static int opcao = 1;

    public static void main(String[] args) throws Exception {

        do {
            System.out.println("*** Escolha uma das opçoes ***");
            System.out.println("1. Ligar o carro");
            System.out.println("2. Desligar o carro");
            System.out.println("3. Acelerar");
            System.out.println("4. Diminuir velocidade");
            System.out.println("5. Virar o carro");
            System.out.println("6. Verificar velocidade");
            System.out.println("7. Trocar marcha");
            System.out.println("0. Sair");
            System.out.println("******************************");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> carro.setLigarCarro();
                case 2 -> carro.setDelisgarCarro();
                case 3 -> carro.setAcelerar();
                case 4 -> carro.setReduzir();
                case 5 -> setDirecao();
                case 6 -> getVelocidade();
                case 7 -> setMarcha();
                default -> System.out.println("Opçao invalida!");
            }

        } while (opcao != 0);

    }

    private static void setDirecao() {
        System.out.println("\n Digite a direção - (1)Esquerda ou (2)direita: ");
        var direcao = scanner.nextInt();
        carro.setDirecao(direcao);
    }

    private static void getVelocidade() {
        var velocidade = carro.velocidade();
        System.out.println("Velocidade atual: " + velocidade);
    }

    private static void setMarcha(){
        System.out.println("\n Qual marcha : ");
        var marcha = scanner.nextInt();
        carro.setMarcha(marcha);
    }
}
