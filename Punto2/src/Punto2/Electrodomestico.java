package Punto2;

public class Electrodomestico {
	private int codigo;
	private String nombre;
	private double precioBase;
	private String color;
	private int consumoEnergetico;
	private double peso;
	public Electrodomestico(int codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getConsumoEnergetico() {
		return consumoEnergetico;
	}
	public void setConsumoEnergetico(int consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	@Override
	public String toString() {
		return "Electrodomestico [codigo=" + codigo + ", nombre=" + nombre + ", precioBase=" + precioBase + ", color="
				+ color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + "]";
	}
	
	


}
