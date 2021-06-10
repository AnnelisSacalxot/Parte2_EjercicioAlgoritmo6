import java.util.*;

public class Ejercicio6_2 {

	public static void main(String[] args) {

// Aquí es donde definimos nuestras variables que nos ayudaran en todo el programa
		Scanner leer = new Scanner(System.in);		 // como son 20 muestras le  indicamos de una vez
		int edad = 0, promedio1 = 0, promedio2 =0;

		System.out.println("Digite 100 números para saber cual es el promedio de ellos");

//Imprimimos resultado final y operaciones correspondientes para comparar si es mayor
		//o menor de edad a partir de los 25 para realizar el promedio correspondiente
 // como son 100 muestras le  indicamos de una vez
		
		for (int i = 0; i < 100 ; i++ ) {

			System.out.println("Ingrese edad: "+(i+1));
			edad = leer.nextInt(); 

			if (edad >= 25) {
				promedio1 = edad/100;

			} else if (edad < 25) {

				promedio2 = edad/100;

			}
		}

		System.out.println("El promedio de edades menores a 25 es: "+promedio1);
		System.out.println("El promedio de edades mayores o iguales a 25 es: "+promedio2);

		 }
}