package Cap4;

import java.util.Scanner;
public class triangulo {
public static void main(String[] args) {
int a=0;
int b=0;
int c=0;
System.out.println("Ingrese el primer5 lado");Scanner
 h= new Scanner(System.in);
a=h.nextInt();
System.out.println("Ingrese el segundo lado");
Scanner i= new Scanner(System.in);
b=i.nextInt();System.out.println ("Ingrese el tercer lado");
Scanner j=new Scanner(System.in);
c=j.nextInt();
if((a+b>c)&(a+c>b)&(c+b>a)){
System.out.print("Los lados ingresados corresponden a los de un triangulo");
}else{
System.out.print("Los lados ingresados no corresponden a los de un triangulo");
}
}
}
