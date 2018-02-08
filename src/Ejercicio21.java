import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Introduce el precio: ");
		double x= sc.nextInt();
		System.out.println("Introduce la cantidad de dinero aportada: ");
		double y= sc.nextInt();
		
		double m = y - x;
		System.out.println("El cambio es de: " + m + "$");
	}

}
