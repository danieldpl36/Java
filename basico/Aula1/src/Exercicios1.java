
public class Exercicios1 {
    /*
     * public static void main(String[] args) {
     * try (var scanner = new Scanner(System.in)) {
     * var anoAtual = OffsetDateTime.now().getYear();
     * System.out.println("Digite seu nome:");
     * var nome = scanner.next();
     * System.out.println("Ano do seu nascimento:");
     * var nascimento = scanner.nextInt();
     * System.out.printf("Olá %s voce tem %s anos",nome,anoAtual-nascimento);
     * }
     * }
     */

    /*
     * public static void main(String[] args) {
     * var scanner = new Scanner(System.in);
     * System.out.println("Digite o lado:");
     * var tamanho = scanner.nextInt();
     * System.out.printf("A area do quadrado é: %s", tamanho * tamanho);
     * }
     */

    /*
     * public static void main(String[] args){
     * var scanner = new Scanner(System.in);
     * System.out.println("Digite o valor da base: ");
     * var base = scanner.nextInt();
     * System.out.println("Digite o valor da a2ltura: ");
     * var altura = scanner.nextInt();
     * System.out.printf("A area do retangulo é: %s \n", base * altura);
     * }
     */

    /*
     * public static void main(String[] args){
     * var scanner = new Scanner(System.in);
     * System.out.println("Digite seu nome: ");
     * var nome1 = scanner.next();
     * System.out.println("Digite sua idade: ");
     * var idade1 = scanner.nextInt();
     * System.out.println("Digite seu nome: ");
     * var nome2 = scanner.next();
     * System.out.println("Digite sua idade: ");
     * var idade2 = scanner.nextInt();
     * 
     * System.out.printf("%s tem %s ano de diferença em relaçao a %s",nome1,(idade1
     * - idade2),nome2);
     * 
     * }
     */
    /*
     * 
     * public static void main(String[] args) {
     * var scanner = new Scanner(System.in);
     * System.out.println("Informe um numero: ");
     * var valor = scanner.nextInt();
     * 
     * for (var x = 1; x <= 10; x++){
     * System.out.printf("%s * %s = %s \n",valor,x,x * valor);
     * }
     * }
     */

    /*
     * public static void main(String[] args) {
     * var scanner = new Scanner(System.in);
     * System.out.println("Digite sua altura: ");
     * var altura = scanner.nextFloat();
     * System.out.println("Ditite seu peso: ");
     * var peso = scanner.nextFloat();
     * 
     * var imc = peso / (altura * altura);
     * System.out.printf("\n IMC: %s \n", imc);
     * 
     * if (imc < 18.5) {
     * System.out.printf("Abaixo do peso. \n");
     * } else if ((imc >= 18.6) && (imc <= 24.9)) {
     * System.out.printf("Peso ideal. \n");
     * } else if (((imc >= 25.0) && (imc <= 29.9))) {
     * System.out.printf("Levemente acima do peso \n");
     * } else if ((imc >= 30.0) && (imc <= 34.9)){
     * System.out.printf("Obsedidade Grau I \n");
     * }
     * }
     */

    /* 
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        var num1 = scanner.nextInt();
        System.out.println("Digite segundo numero : ");
        var num2 = scanner.nextInt();
        System.out.println("Deseja par ou impar? ");
        String opcao = scanner.next();

        for (var x = num1; x <= num2; x++) {
            var calculo = x % 2;

            if ((calculo == 0) && (opcao.equals("par"))) {
                System.out.println(x);
            } else if ((calculo > 0) && (opcao.equals("impar")))
                System.out.println(x);
        }
    }
         */

    
}