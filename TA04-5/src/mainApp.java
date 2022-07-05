
public class mainApp {

	public static void main(String[] args) {
		
		int entero1 = 2, entero2 = 4, entero3 = 6, entero4 = 8;
		
		entero2 = entero3;
		System.out.println("El valor de B ahora es de: "+ entero2);
		entero3 = entero1;
		System.out.println("El valor de C ahora es de: "+ entero3);
		entero1 = entero4;
		System.out.println("El valor de A ahora es de: "+ entero1);
		entero4 = entero2;
		System.out.println("El valor de D ahora es de: "+ entero4);
	}
}
