

	import java.util.Scanner;

	public class Ejercicio3 {

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
	    System.out.println("Para realizar una operacion ponga suma, resta, multiplicacion o division");
	   
	    String input=sc.next(); 
	    
	     if (input.equals("resta")){
	    	 System.out.println("Su resta es" + (A-B-C));
	   	     
	    }   else if (input.equals("suma"))  {
	    	System.out.println("Su suma es" + (A+B+C));
	    }  else if (input.equals("division"))  {
	        System.out.println("Su division es" + (A/B/C));

	    }  else if (input.equals("multiplicacion"))  {
	       System.out.println("Su multiplicacion es" + (A*B*C));


	}

	}
	}

