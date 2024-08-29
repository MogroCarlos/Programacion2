package Punto1;

public class Persona {
	private String nombre;
	private int anioDeNacimiento;
	private int dni;
	private String sexo;
	private double peso;
	private double altura;
	
	
	public Persona(String nombre, int dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnioDeNacimiento() {
		return anioDeNacimiento;
	}

	public void setAnioDeNacimiento(int anioDeNacimiento) {
		this.anioDeNacimiento = anioDeNacimiento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public int indiceMasaCorporal() {
		int indiceMasa =(int) (this.peso / (this.altura*this.altura));
		return indiceMasa;
	}
	
	public String enForma(int indiceMasa){
		
		if ((indiceMasa>=18) && (indiceMasa<=25)) {
			return "Estas en Forma";
		}else {
			return "Consulta a un medico";
		}
	}
	
	public String adulto() {
		int edad= 2024-this.anioDeNacimiento;
		if (edad>=18) {
			return "Usted mayor de edad";
		}else return "Usted es menor de edad";
	}
	
	public String votacion() {
		int edad= 2024-this.anioDeNacimiento;
		if (edad>=16) {
			return "Puede votar";
		}else return "Es muy joven para votar";
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", anioDeNacimiento=" + anioDeNacimiento + ", dni=" + dni + ", sexo="
				+ sexo + ", peso=" + peso + ", altura=" + altura + "]";
	}
	
	
	

}
