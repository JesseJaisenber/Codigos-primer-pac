package Cap5;


public class unoalquince

{           
    public static void main(String args[]) 
    {  
    
int producto = 1;
System.out.println("\nEste programa calcula el producto ");
System.out.println("\nde los enteros impares del 1 al 15\n");

for ( int i = 1; i <= 15; i++ )
{         
    if( i % 2 != 0 )
        producto = i;
}         
System.out.printf("\nEl producto es: %d\n", producto );
    }                 

}        


       
