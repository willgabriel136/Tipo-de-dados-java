package tarefa;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String n1, n2;
        int idade1, idade2;

        System.out.println("Dígite o primeiro nome:");
        n1 = input.next();
        System.out.println("Dígite o segundo nome:");
        n2 = input.next();
        System.out.println("Dígite a primeira idade:");
        idade1 = input.nextInt();
        System.out.println("Dígite a segunda idade:");
        idade2 = input.nextInt();

        if (idade1 > idade2){
            System.out.println("Pessoa mais velha é a \n" + n1 + "\n" );
            System.out.println("Sua idade é \n" + idade1 + "\n" );

        }else if (idade2 > idade1){
            System.out.print("Pessoa mais velha é a \n" + n2 + "\n");
            System.out.println("Sua idade é \n" + idade1 + "\n" );

        }
    }
}
