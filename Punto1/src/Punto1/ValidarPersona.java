package Punto1;
import java.util.Scanner;

public class ValidarPersona{
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static String validacion(String dato) {
		//objeto.setInstancia(ValidarDatos.validacion("nombre_instancia"));
		String texto = null;
		try {
			System.out.println(dato);
			
			texto = scanner.nextLine();
			
			System.out.println();
		}catch (Exception e) {
			System.out.println("Error: entrada invalida");
		}
		return texto;
	}
	
	public static int validarInt(String mensaje ){
		//objeto.setInstancia(ValidarPersona.validarInt("mensaje(ingrese un numero)"));
		int numero;
		String valorIngresado;
		while (true) {
			try {
				System.out.println(mensaje);
				valorIngresado = scanner.nextLine();
				numero = Integer.parseInt(valorIngresado);
				break;
			}catch(Exception e){
				System.out.println("Error, debe ingresar un numero");
			}
		}
		return numero;
	}
	
	public static double validarDouble(String mensaje ){
		//objeto.setInstancia(ValidarPersona.validarDouble("mensaje(ingrese precio)"));
		double numero;
		String valorIngresado;
		while (true) {
			try {
				System.out.println(mensaje);
				valorIngresado = scanner.nextLine();
				numero = Double.parseDouble(valorIngresado);
				break;
			}catch(Exception e){
				System.out.println("Error, debe ingresar un numero");
			}
		}
		return numero;
	}
	
	public static int validarEdad(String mensaje ){
		//objeto.setInstancia(ValidarDatos.validacion("mensaje(ingrese un numero)"));
		int numero;
		String valorIngresado;
		while (true) {
			try {
				System.out.println(mensaje);
				valorIngresado = scanner.nextLine();
				numero = Integer.parseInt(valorIngresado);
				if(numero>=0 && numero<=120) {
					break;
				}else System.out.println("Edad fuera e rango, intende de nuevo ");
				
			}catch(Exception e){
				System.out.println("Error, Ingese un numero entero");
			}
		}
		return numero;
	}
}
