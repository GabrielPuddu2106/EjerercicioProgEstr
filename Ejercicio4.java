import java.util.Scanner;

public class Ejercicio4{
    public static void main(String [] args ){

        Scanner lector = new Scanner(System.in);

        double  a , b ,c ;

        double  x1, x2, discriminante;

        // DATOS DE ENTRADA

        System.out.println("Ingrese el valor de a");
        a = lector.nextDouble();

        if (a < = 0){
            System.out.println("Ingrese nuevamente el valor de a ");
            a  = lector.nextDouble();

        } else if {
       

        System.out.println("Ingrese el valor de b");
        b = lector.nextDouble();

        System.out.println("Ingrese el valor de c");
        c = lector.nextDouble();

        }
        
        // OPERACIONES 

        discriminante = (b*b - 4*a*c);
        x1 = ((-b) + Math.sqrt(discriminante)/ 2*a);
        x2 = ((-b) - Math.sqrt(discriminante)/ 2*a);

        if( discriminante = 0 ){
            System.out.println(" Raiz 1 " +x1);

        } else {
            System.out.println(" Raiz 1 " +x1);
            System.out.println(" Raiz 2 " +x2);

        } 
        lector.close();



        
    }
}
