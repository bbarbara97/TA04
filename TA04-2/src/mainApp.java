
public class mainApp {

	public static void main(String[] args) {
	
		int entero = 2;
		double decimal = 4.5;
		char letra = 'g';
		double resultado;
		
		System.out.println("Entero: " + entero + "\nDecimal: " + decimal + "\nLetra: " + letra);
		
		resultado = entero + decimal;
		System.out.println("La suma de N + A es de: " + resultado);
		
		resultado = decimal - entero;
		System.out.println("La diferencia de A - N es de: " + resultado);
		
		resultado = letra;
		System.out.println("El valor númerico de la letra es: " + resultado);
	}
}