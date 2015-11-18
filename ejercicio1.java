
package deber1.java;

import java.util.Scanner;

public class ejercicio1 {

	
	public static void main(String[] args)
		{
			
			// TODO Auto-generated method stub
			
			System.out.println("BIENVENIDOS A NUESTRO SISTEMA");
			
			float Suma,Promedio;
			Suma=0;
			
			Scanner leer=new Scanner(System.in);
			for(int n=1;n<10;n++)
			{
				 System.out.println("ALUMNO"+n+":");
				 Suma+=leer.nextFloat();
			}Promedio=Suma/3;
			System.out.println("EL PROMEDIO GENERAL DEL GRUPO ES.:"+Promedio);
		}

	}
