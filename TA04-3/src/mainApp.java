
public class mainApp {

	public static void main(String[] args) {
	
		int entero1 = 2, entero2 = 5, resultado;
		double decimal1 = 3.21, decimal2 = 7.4, resultadoD;
		
		System.out.println("Enteros: " + entero1 +", " + entero2 + "\nDecimales: " + decimal1 + ", " + decimal2);
		
		resultado = entero1 + entero2;
		System.out.println("La suma de X + Y es: " + resultado);
		resultado = entero1 - entero2;
		System.out.println("La diferencia de X - Y es: " + resultado);
		resultado = entero1 * entero2;
		System.out.println("El producto de X * Y es: " + resultado);
		resultado = entero1 / entero2;
		System.out.println("El cociente de X / Y es: " + resultado);
		resultado = entero1 % entero2;
		System.out.println("El resto de X / Y es: " + resultado);
		
		resultadoD = decimal1 + decimal2;
		System.out.println("La suma de N + M es: " + resultadoD);
		resultadoD = decimal1 - decimal2;
		System.out.println("La diferencia de N - M es: " + resultadoD);
		resultadoD = decimal1 * decimal2;
		System.out.println("El producto de N * M es: " + resultadoD);
		resultadoD = decimal1 / decimal2;
		System.out.println("El cociente de N / M es: " + resultadoD);
		resultadoD = decimal1 % decimal2;
		System.out.println("El resto de N / M es: " + resultadoD);
		
		resultadoD = entero1 + decimal1;
		System.out.println("La suma de X + N es: " + resultadoD);
		resultadoD = entero2 / decimal2;
		System.out.println("El cociente de Y / M es: " + resultadoD);
		resultadoD = entero2 % decimal2;
		System.out.println("El resto de Y / M es: " + resultadoD);
		
		resultado = entero1 * 2;
		System.out.println("El doble de X es: " + resultado);
		resultado = entero2 * 2;
		System.out.println("El doble de Y es: " + resultado);
		resultadoD = decimal1 * 2;
		System.out.println("El doble de N es: " + resultadoD);
		resultadoD = decimal2 * 2;
		System.out.println("El doble de M es: " + resultadoD);
		
		resultadoD = entero1 + entero2 + decimal1 + decimal2;
		System.out.println("La suma de todas las variables es de: " + resultadoD);
		resultadoD = entero1 * entero2 * decimal1 * decimal2;
		System.out.println("El producto de todas las variables es de: " + resultadoD);
	}
}
