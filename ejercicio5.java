import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner= new Scanner(System.in);
	    
	    System.out.print("Ingrese un numero del 1 al 7 para representar un dia de la semana: ");
	    int numero= scanner.nextInt();
	    
	    String diasemana;
	    
	    switch(numero){
	        case 1: 
	            diasemana="Lunes";
	            break;
	       case 2: 
	            diasemana="Martes";
	            break;
	       case 3: 
	            diasemana="Miercoles";
	            break;
	       case 4: 
	            diasemana="Jueves";
	            break;
	       case 5: 
	            diasemana="Viernes";
	            break;
	       case 6: 
	            diasemana="Sabado";
	            break;
	       case 7: 
	            diasemana="Domingo";
	            break;
	       default:
	            diasemana="Día invalido";
	            break;
	    }
	    System.out.println("El día de la semana correspondiente al numero"+" "+numero+" "+"es:"+" "+diasemana);
	    
	}
}