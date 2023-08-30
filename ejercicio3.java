import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int numA;
	    int numB;
	    
	    Scanner leer = new Scanner(System.in);
	    System.out.println("Ingrese un numA: ");
	    numA=leer.nextInt();
	    System.out.println("Ingrese un numB: ");
	    numB=leer.nextInt();
	    if (numA>0 && numB>0){
	        System.out.println("true");
	    }
	}
}