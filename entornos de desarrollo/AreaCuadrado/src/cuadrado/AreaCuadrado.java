package cuadrado;

//3. Escriu un programa que calcule l'àrea d'un quadrat el costat del qual s'introdueix per teclat.

import java.util.Scanner;

public class AreaCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		float area,lado;

		System.out.println("Ingresa uno de los lados del cuadrado en cm");
		lado = input.nextFloat();
		area = lado * lado;
		
		System.out.println("El área del cuadrado es: " + area + "cm2");
		
	}

}
