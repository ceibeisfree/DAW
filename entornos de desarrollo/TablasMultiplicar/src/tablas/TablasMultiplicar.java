package tablas;

// Imprimir por pantalla las tablas del 1 al 10.

public class TablasMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Tablas de multiplicar");
		for (int i=1; i<11; i++) { //bucle primera cifra
			
		System.out.println();
		System.out.println("Tabla del " +i);
			
		for (int j=1; j<11; j++) { //bucle segunda cifra 
		System.out.println(i + " x " + j + " = " + i*j) ;
				
			}
		}

	}

}
