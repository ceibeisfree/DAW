package porcentage;

import java.util.Scanner;

//6. Escriu un programa que donat el preu d'un article i el preu de venda real ens mostre el
//percentatge de descompte realitzat.

public class Descuento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		float precio1,precio2,descuento;

		
		System.out.println("Ingresa el precio del articulo:");
		precio1 = input.nextFloat();
		System.out.println("Ingresa el precio de venta:");
		precio2 = input.nextFloat();
		descuento = 100 * (precio1 - precio2) / precio1;
		System.out.println();
		System.out.println("El descuento es del: " + descuento + "%" );
		
	}

}
