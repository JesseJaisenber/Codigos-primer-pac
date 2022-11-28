package Cap2;

import java.util.Scanner;
 
public class corporal {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
       
        double p,e,imc;
       
        System.out.println("VALORES DE BMI");
        System.out.println("Bajo peso: menos de 18.5");
        System.out.println("Normal: entre 18.5 y 24.9");
        System.out.println("Sobrepeso: entre 25 y 29.9");
        System.out.println("Obeso: 30 o más");
        System.out.println("Cual es su peso ");
        p= teclado.nextDouble();
        System.out.println("Cual es tu estatura");
        e= teclado.nextDouble();
        
        imc= p/(e*e);
        System.out.println("SU IMC ES: " +imc);
    }
}
