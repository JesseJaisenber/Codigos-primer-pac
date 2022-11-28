package Cap4;

import java.util.Scanner;
public class salarios

{ 
    public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);

int numeroEmpleado = 1;
int horas = 0;
double salario = 0;
double total = 0;

while ( 3 >= numeroEmpleado)
{ 
System.out.printf("\nPor favor introduzca el numero de horas que trabajo el empleado %d: ", numeroEmpleado);

horas = entrada.nextInt();

System.out.printf("\nIntroduzca por favor el salario por hora del empleado %d: ", numeroEmpleado);
salario = entrada.nextDouble();

if ( 40 >= horas)
total = horas*salario;
else
total = 40*salario + (horas - 40)*(salario + salario/2);

System.out.printf("\nEl salario del empleado numero %d es \n", numeroEmpleado++, total);
} 

} 

}
