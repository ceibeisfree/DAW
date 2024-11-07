package calculo2num;

// 4. Escriu un programa que llija dos números, calcule i mostre el valor de les seues suma, resta, producte i divisió.


import java.util.Scanner;

public class SumaRestaProductoDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
		Scanner input = new Scanner(System.in);
		float num1,num2,suma,resta,producto,division;

		System.out.println("Ingresa uno de los numeros:");
		num1 = input.nextFloat();
		System.out.println("Ingresa otro de los numeros:");
		num2 = input.nextFloat();
		suma = num1 + num2;
		System.out.println();
		System.out.println("El resultado de la suma es: " + suma );
		resta = num1 - num2;
		System.out.println();
		System.out.println("El resultado de la resta es: " + resta );
		producto = num1 * num2;
		System.out.println();
		System.out.println("El resultado de la multiplicacion es: " + producto );
		division = num1 / num2;
		System.out.println();
		System.out.println("El resultado de la division es: " + division );
			
	}

}
