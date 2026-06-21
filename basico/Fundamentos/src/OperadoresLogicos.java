import java.util.Scanner;

public class OperadoresLogicos {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Qual é a sua idade?");
        var age = scanner.nextInt();
        System.out.println("Voce é emancipado?");
        var emancipado = scanner.nextBoolean();
        var podeDirigir = age >= 18 || (emancipado && age >= 16);
        System.out.printf("Voce pode dirigir? (%s) \n", podeDirigir);
    }
}
