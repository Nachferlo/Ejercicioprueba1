import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int i;
		System.out.println("Intruduce un numero: ");
		int a = sc.nextInt();
		
		
		for(i = 0; i <= a; i++) {
			if(i%4==0) {
				System.out.print(i + ", ");
			}else if(i%5==0) {
				System.out.print(i + ", ");
			}
		}
		System.out.println("Estos son todos los multiplos de 4 y 5.");
	}

}
