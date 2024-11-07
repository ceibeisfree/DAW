package radio;

//5. Escriu un programa que pren com a dada d'entrada un número que correspon a la longitud
//d'un radi i ens escriu la longitud de la circumferència, l'àrea del cercle i el volum de l'esfera
//que corresponen amb aquest ràdio.

import java.util.Scanner;

public class RadioCircumferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		float radio,longitud,area,vol,pi;
		
		pi = (float) 3.141592;
		
				
		System.out.println("Ingresa el radio de la circunferencia en cm:");
		
		radio = input.nextFloat();
		pi = (float) 3.141592;
		longitud = radio * (2 *pi);
		System.out.println("La longitud de la circunferencia es: " + longitud + " cm");
		System.out.println();
		area = pi * (radio * radio);
		System.out.println("El area de la circunferencia es: " + area + " cm2");
		System.out.println();
		vol = (4/3) * pi * (radio * radio * radio);
		System.out.println("El volumen de la esfera es: " + vol + " cm3");
		
		
			
	}

}
