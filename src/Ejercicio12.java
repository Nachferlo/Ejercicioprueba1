
import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Intruduce un numero: ");
		int i=sc.nextInt();
		
		if(i%2==0) {
			System.out.println("no es primo");
		}else if(i%3==0) {
			System.out.println("no es primo");
		}else if(i%5==0) {
			System.out.println("no es primo");
		}else if(i%7==0) {
			System.out.println("no es primo");
		}else if(i%11==0) {
			System.out.println("no es primo");
		}else {
			System.out.println("es primo");
		}
	}

}

