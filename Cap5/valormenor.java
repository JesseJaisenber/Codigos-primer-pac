package Cap5;

import java.util.Scanner;
public class valormenor
       {                 
        public static void main(String[] args) {

    int x;
    int y;
    int menor;

    Scanner entrada = new Scanner(System.in);

        System.out.println(" Introduzca cuantos numeros");
        System.out.println(" quiere comparar: ");

    x = entrada.nextInt();

    System.out.println("\nPor favor introduzca el primer numero: ");
    menor = entrada.nextInt();

    for( int i = 2; i <= x; i++ )
    {   

    System.out.printf("\nPor favor introduzca el entero numero: %d\n", i);
        y = entrada.nextInt();
          
    if ( y < menor )
        menor = y;

    }     
    System.out.printf("\nEl menor de los %d numeros es: %d\n", x, menor);
                }        
   }
