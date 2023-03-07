
import java.util.Scanner;

public class SalarioDoWill {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double SalarioAtual, SalarioNovo ;

        System.out.println("Informe seu salário atual: " );
        SalarioAtual = input.nextDouble();


        if (SalarioAtual >= 1000 && SalarioAtual < 2000){
            SalarioNovo = SalarioAtual * 1.15;
            System.out.println("seu salário Novo é: " + SalarioNovo);
            

        }
        else if (SalarioAtual >= 2000 && SalarioAtual <= 3000){
            SalarioNovo = SalarioAtual * 1.10;
            System.out.println("seu salário Novo é: " + SalarioNovo);
      
        }
        else if (SalarioAtual >= 3000){
            SalarioNovo = SalarioAtual * 1.05;
            System.out.println("seu salário Novo é: " + SalarioNovo);
            
        }
    }
}
