import java.util.Scanner;

public class OperadoresAritmenticos{

    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro numero:");
        var value1 = scanner.nextFloat();
        System.out.println("Informe o segundo numero:");
        var value2 = scanner.nextFloat();

        System.out.printf("%s + %s = %s (Soma)\n",value1,value2,(value1 + value2));        
        System.out.printf("%s - %s = %s (Subtraçao)\n",value1,value2,(value1 - value2));  
        System.out.printf("%s / %s = %s (Diviao)\n",value1,value2,(value1 / value2));
        System.out.printf("%s %% %s = %s (Resto)\n",value1,value2,(value1 % value2));   
        System.out.printf("%s * %s = %s (Multiplicacao)\n",value1,value2,(value1 * value2));
        
        System.out.println("Informe o segundo numero:");
        var value3 = scanner.nextInt();
        // value3 += 1;
        //System.out.println(value3++);
        System.out.printf("%s Sobre a potencia de 2 é %s \n",value3,Math.pow(value3, 2));
        System.out.printf("Raiz de %s é %s\n",value3,Math.sqrt(value3));
    }

}