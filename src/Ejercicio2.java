import java.util.Scanner;

public class Ejercicio2 {

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
    
     if (A<0  || B<0 || C<0){
    System.out.println("Es Negativo no puedo proceder");
    } else {
    	System.out.println("Su resta es" + (A-B-C));

        System.out.println("Su resta es" + (A/B/C));


       System.out.println("Su multiplicacion es" + (A*B*C));


}

}
}

