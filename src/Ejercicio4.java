import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contp=0;
		int contr=0;
		int conto=0;
		int contc=0;
		String s;
		Scanner sc =new Scanner(System.in);
		
		do {
		System.out.print("Introduce la letra inicial lo que se ha vendido: ");       
		s = sc.next();
		if(!s.equals("p")) {
			contp++;
			}else if(!s.equals("r")) {
				contr++;
			}else if(!s.equals("c")) {
				contc++;
			}else if(!s.equals("o")) {
				conto++;
				}
		} while (!s.equals("f"));
		
	System.out.println(" se vendieron " + contp + " periodicos");
	System.out.println(" se vendieron " + conto + " otros");
	System.out.println(" se vendieron " + contr +" revistas");
	System.out.println(" se vendieron " + contc +" comics");
		
		
	}
}
