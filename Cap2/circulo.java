package Cap2;
import java.util.Scanner;

public class circulo {

    public static void main(String[] args)
     {
      
        Scanner teclado = new Scanner(System.in);
        double r,d,c,a;
        double pi= 3.14159;
        
        System.out.println(" Introduzca el radio del circulo");
        r= teclado.nextInt();

                
                d=r*2;
                c=2*pi*r;
                a=pi*r*r;

                System.out.println("El diámetro es: " +d);
                System.out.println("La circunferencia es: " +c);
                System.out.println("el area es: " +a);

    }

}
