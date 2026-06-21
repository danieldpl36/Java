import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        var name = scanner.next();
        System.out.println("Informe sua idade: ");
        var age = scanner.nextInt();
        System.out.println("Voce é emancipado (s/n)?  ");
        var isEmancipated = scanner.next().equalsIgnoreCase("s");

        /*
         * if (age >= 18) {
         * System.out.printf("%s voce tem %s anos e pode dirigir", name, age);
         * } else if (age >= 16 && isEmancipated) {
         * System.out.printf("Voce é emancipado e pode dirigir");
         * } else {
         * System.out.printf("Voce nao pode dirigir");
         * }
         */

        /* 
        if ((age >= 18) || (age >= 16 && isEmancipated)) {
            System.out.printf("%s voce tem %s anos e pode dirigir", name, age);
        } else {
            System.out.printf("Voce nao pode dirigir");
        }
        */

        // Elvis Operator * nao executa codigos, apenas uma condiçao
        var canDrive = (age >= 18) || (age >= 16 && isEmancipated);
        var message = canDrive ?
            name + ", voce pode dirigir \n":
            name + ", voce nao pode dirigir \n";

            System.out.printf(message);
    }

}
