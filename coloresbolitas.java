package deber1.java;
import java.util.Scanner;

public class coloresbolitas {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		double iva,acum=0, acum1 = 0,acum2 = 0;
		System.out.println("BIENVENIDOS ");
		System.out.println("DESEA INGRESAR A NUESTRO SISTEMA");
		Scanner resp=new Scanner(System.in);
		String res=resp.next();
		while(res.equals("si"))
		{
			System.out.println("INGRESE EL VALOR DE LA COMPRA");
			Scanner monto_compra=new Scanner(System.in);
			double mo=monto_compra.nextDouble();
			System.out.println("ELEGIR UNA OPCION DEL MENU PORFAVOR");
			System.out.println("1. ROJA");
			System.out.println("2. AMARILLA");
			System.out.println("3. BLANCO");
			System.out.println("ELEJIR UNA OPCION");
			Scanner bolita=new Scanner(System.in);
			int pelotita=bolita.nextInt();
			switch (pelotita){
			case 1:
				iva=((mo)+mo-0.12);
				System.out.println("EL TOTAL A PAGAR INCLUIDO EL IVA Y EL DESCUENTO DE SU COMPRA ES:"+((iva)-iva*0.40));
				acum=acum+((iva)-iva*0.40);
				break;
			case 2:
				iva=((mo)+mo-0.12);
				System.out.println("EL TOTAL A PAGAR INCLUIDO EL IVA Y EL DESCUENTO DE SU COMPRA ES:"+((iva)-iva*0.25));
				acum1=acum1+((iva)-iva*0.25);
				break;
			case 3:
				iva=((mo)+mo-0.12);
				System.out.println("EL TOTAL A PAGAR INCLUIDO EL IVA Y EL DESCUENTO DE SU COMPRA ES:"+iva);
				acum2=acum2+iva;
				break;
				
				default:
				System.out.println("Seleccion no valida");
			}System.out.println("Desea seguir ingresando datos al sistema");
			res=resp.next();
			
		}System.out.println("El total de ventas en el dia a sido de:"+(acum+acum1+acum2));
		System.out.println("Gracias por utilizar nuestro sistema");
		System.exit(0);
		}

	
}
