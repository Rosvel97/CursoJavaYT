import java.util.Scanner;
class Rifa
{
	public static void main(String args[])
	{
	try (Scanner tc = new Scanner(System.in)) {
		int op;
		System.out.println("Ingresa un numero del 1 al 100");
		op=tc.nextInt();
		
		if
		   (op>=1 && op<=100)
		{
		   switch(op)
		   {
			   case 10:
			   System.out.println("Felicidades!! te ganaste 500 dolares$");
			   break;

			   case 37:
			   System.out.println("Felicidades!! te ganaste un Iphone 12");
			   break;

			   case 48:
			   System.out.println("Felicidades!! te ganaste un carro del año");
			   break;

			   default: 
			   System.out.println("Lo siento no te ganaste nada");
		   }
		}
		else
		{
			System.out.println("Lo siento ese numero no participa");
		}
	}
}
}
