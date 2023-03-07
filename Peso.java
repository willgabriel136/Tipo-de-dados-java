import java.util.Scanner;

public class Peso {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double altura, peso, imc;

        System.out.println("Digite seu peso: "); 
        peso = input.nextDouble();

        System.out.println("Digite sua altura: "); 
        altura = input.nextDouble(); 
 
        imc = peso / (altura * altura);
        
        if (imc < 18.5) {
            System.out.printf("o seu imc e" + "a faixa de peso correspondente é: abaixo do peso");
        } else if (imc <= 24.9){    

           System.out.printf("o seu imc e" + "a faixa de peso correspondente é: Peso normal ");
        } else if (imc <= 29.9){    
     
            System.out.printf("o seu imc e" + "a faixa de peso correspondente é: Sobrepeso");
        } else if (imc <= 34.9){    
         
            System.out.printf("o seu imc e" + "a faixa de peso correspondente é: Obesidade grau 1");
        } else if (imc <= 39.9){    


            System.out.printf("o seu imc e" + "a faixa de peso correspondente é: Obesidade grau 2");
        } else if (imc <= 34.9){   




}
}




}
