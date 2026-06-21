
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe um numero de 1 até 7: ");
        var option = scanner.nextInt();

        // System.out.println("Fim de semana");
        // Case: + break
        switch (option) {
            case 1, 7 -> {
                var day = option == 1 ? "Domingo" : "Sabado";
                System.out.println(day);
            } 
            case 2 -> System.out.println("Segunda");
            case 3 -> System.out.println("Terça");
            case 4 -> System.out.println("Quarta");
            case 5 -> System.out.println("Quinta");
            case 6 -> System.out.println("Sexta");
            default -> System.out.println("Opçao invalida");
        }

    }
}
