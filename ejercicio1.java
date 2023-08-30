/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
    
	public static void main(String[] args) {
	    
	    //1a
	    if (6<6*5)
	    System.out.println("Hello");
		System.out.println("There");
		
		//Respuesta: Hello
	    // There
	    
	    //1b
	    int x=1, y=2, z=3;
	    
	    if (x>y)
	    if (x>z)
	     System.out.println("1111");
	    else
	     System.out.println("2222");
	     
	    //Respuesta: no imprime nada
	    
	    //1c
	    int x=1, y=2, z=3;
	    
	    if (x<z)
	     System.out.println("*");
	    else if (x==z)
	     System.out.println("&");
	    else
	     System.out.println("$");
	    //Respuesta: *
	     
	    //1d
	    int x=1, y=2, z=3;
	    
	    if (x<y)
	      System.out.println("####");
	    else
	      System.out.println("&&&&");
	      System.out.println("****");
	    //Respuesta: ####
	    //           ****
	    
	    //1e
	    int x=1, y=2, z=3;
	    
	    if (x>y)
	     System.out.println("####");
	    else {
	     System.out.println("&&&&");
	     System.out.println("****");
	    }
	    //Respuesta: &&&&
	    //           ****
	   
	    //1f
	    int a1=100; int a2=200;
	    
	    if (a1>100 && a2<=200)
	     System.out.println(a1+" "+a2+" "+(a1+a2));
	    else
	     System.out.print(a1+" "+a2+" "+(2*a1-a2));
	    //Respuesta: 100 200 0
	    
	    //1g
	    int x=1, y=2, z=3;
	    
	    if(++x > y++ || x-- >0)
	        z++;
	   else
	        z--;
	   System.out.println(x+" "+y+" "+z);
	   //Respuesta: 1 3 4
	   
	   //1h
	   int x=1, y=2, z=3;
	    
	   if(x<y){
	       System.out.println("####");
	       System.out.println("****");
	    }
	   else
	       System.out.println("&&&&");
	   //Respuesta: ####
	   //           ****
	   
	   //1i
	   int x=1, y=2, z=3;
	    
	   if('x'>'y' || 66>(int)('A'))
	     System.out.println("#*#");
	   //Respuesta: #*#
	   
	   //1j
	   int x=1, y=2, z=3;
	    
	   if(x<z)
	    System.out.println("*");
	   else if (x==z)
	    System.out.println("&");
	   else
	    System.out.println("$");
	   //Respuesta: *
	    }
}
