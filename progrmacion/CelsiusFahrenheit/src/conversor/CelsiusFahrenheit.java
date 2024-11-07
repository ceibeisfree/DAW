package conversor;

// Convertir de grados Celsius a Fahrenheit.

import java.util.Scanner;

public class CelsiusFahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		float c,f;
		
		System.out.println("Ingresa los grados celsius");
		c = input.nextFloat();
		f = (c * 9/5) + 32;
		
		System.out.println();
		System.out.println(c+" grados celsius convertidos a grados fahrenheit es: "+f);
		

	}

}
