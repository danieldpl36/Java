import java.util.Scanner;

public class PetShop_Main {
    private final static Scanner scanner = new Scanner(System.in);
    private final static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {

        var opcao = -1;

        do {
            System.out.println("*** Escolha uma das opçoes ***");
            System.out.println("1. Dar banho");
            System.out.println("2. Abaster maquina com agua");
            System.out.println("3. Abaster maquina com shampoo");
            System.out.println("4. Verificar nivel da agua");
            System.out.println("5. Verificar nivel do shampoo");
            System.out.println("6. Verificar se tem pet");
            System.out.println("7. Colocar pet na maquina");
            System.out.println("8. Retirar pet na maquina");
            System.out.println("9. Limpar maquina");
            System.out.println("0. Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> petMachine.takeAShower();
                case 2 -> setWater();
                case 3 -> setShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> checkPetInMachine();
                case 7 -> setPetInMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.wash();
                case 0 -> System.exit(0);
                default -> System.out.println("Opçao invalida!");
            }

        } while (opcao != 0);
    }

    private static void setWater() {
        System.out.println("Colocando agua na maquina...");
        petMachine.addWater();
    }

    private static void setShampoo() {
        System.out.println("Colocando shampoo na maquina...");
        petMachine.addShampoo();
    }

    private static void verifyShampoo() {
        var amout = petMachine.getShampoo();
        System.out.println("A maquina está no momento com " + " litros de shampoo");
    }

    private static void verifyWater() {
        var amout = petMachine.getWater();
        System.out.println("A maquina está no momento com " + " litros de agua");
    }

    public static void setPetInMachine() {
        var name = "";
        while (name == null || name.isEmpty()) {
            System.out.println("Informe o nome do pet");
            name = scanner.next();
        }
        var pet = new Pet(name);
        petMachine.setPet(pet);
        System.out.println("O pet " + pet.getName() + " foi colocado na maquina");
    }

    public static void checkPetInMachine() {
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "Tem pet na maquina!" : "Nao tem pet na maquina!");
    }

}
