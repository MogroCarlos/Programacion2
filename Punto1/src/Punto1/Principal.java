package Punto1;

public class Principal {

	public static void main(String[] args) {
		Persona persona1 = new Persona("Mario", 38654903);
		System.out.println(persona1.toString());
		
		persona1.setAnioDeNacimiento(ValidarPersona.validarInt("Ingrese Año de nacimiento: "));
		persona1.setSexo(ValidarPersona.validacion("Ingrese su sexo (f/m): "));
		persona1.setPeso(ValidarPersona.validarDouble("Ingrese su peso: "));
		persona1.setAltura(ValidarPersona.validarDouble("ingrese su altura : "));
		
		
		System.out.println("---------------------");
		System.out.println("Su IMC es de : "+persona1.indiceMasaCorporal());
		System.out.println("salud de la persona: "+persona1.enForma(persona1.indiceMasaCorporal()));
		
		System.out.println("Estatus de la persona: "+persona1.adulto());
		persona1.adulto();
		System.out.println("Condicion de sufragio: "+persona1.votacion());
		
		System.out.println("---------------------");
		System.out.println(persona1.toString());
		

	}

}
