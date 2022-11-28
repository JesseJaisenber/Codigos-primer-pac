package Cap2;

public class parimpar {
 
    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
       
        int n;
       
        System.out.print("Ingrese el número para evaluarlo: ");
        n = teclado.nextInt();
       
        if(n % 2 == 0) {
            System.out.println(n+" es un número par.");
        }else {
            System.out.println(n+" no es un número par.");
        }
    }
}
