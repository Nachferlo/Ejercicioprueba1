import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner sc = new Scanner (System.in);
    int A;
    int B;
    int C;
    
    System.out.print("Numero 1");
    A = sc.nextInt(); 
    System.out.println("Numero 2");
    B=  sc.nextInt();
    System.out.println("Numero 3");
    C=  sc.nextInt(); 
    
    
    System.out.println("Su resta es" + (A-B-C));

    System.out.println("Su resta es" + (A/B/C));


    System.out.println("Su multiplicacion es" + (A*B*C));


    
}

}



