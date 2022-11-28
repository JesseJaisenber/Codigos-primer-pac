package Cap4;

import java.util.Scanner;
public class gaso
{

public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
int kilometros = 0;
int litros = 0;
int kilometrosTotales=0;
int litrosTotales=0;
double promedio=0;

while (kilometros != -1 ) {
System.out.println("Introduzca numero de kilometros en su viaje si desea\n"+ "cancelar escriba -1");
kilometros = teclado.nextInt();
kilometrosTotales +=kilometros;
System.out.println("Introduzca numero de litros en su viaje");
litros = teclado.nextInt();
litrosTotales += litros;

promedio = kilometros/litros;
System.out.println("Los kilometros por litro de este viaje son:"+ promedio);

}
promedio = litrosTotales /kilometrosTotales;
System.out.println("El promedio kilometros por litro es:"+promedio);

}
}
