import java.util.Scanner;

public class exercicio1 {
   
    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
        int num;

        System.out.println("Insira um numero! :");
        num = input.nextInt();
      
        if (num > 0){
            System.out.print ("O numero é positivo!");
        }else if( num < 0){

            System.out.print ("O numero é negativo!");
        }else 
        {
            System.out.print ("O numero é 0!");
        }
    }
}
