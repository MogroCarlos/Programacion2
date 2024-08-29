package Punto3;

public class Diario extends Publicacion{

	public Diario(String titulo, String personaResponsable, int codigo, String editorResponsable, int cantidadPaginas,
			double precio, int anioPublicacion) {
		super(titulo, personaResponsable, codigo, editorResponsable, cantidadPaginas, precio, anioPublicacion);
		// TODO Auto-generated constructor stub
	}
	private int semana;
	private String mes;
	private String imprecion;
	private double recargoXenvios;
	
	
	
	public Diario(String titulo, String personaResponsable, int codigo, String editorResponsable, int cantidadPaginas,
			double precio, int anioPublicacion, int semana, String mes, String imprecion, double recargoXenvios) {
		super(titulo, personaResponsable, codigo, editorResponsable, cantidadPaginas, precio, anioPublicacion);
		this.semana = semana;
		this.mes = mes;
		this.imprecion = imprecion;
		this.recargoXenvios = recargoXenvios;
	}
	public int getSemana() {
		return semana;
	}
	public void setSemana(int semana) {
		this.semana = semana;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public String getImprecion() {
		return imprecion;
	}
	public void setImprecion(String imprecion) {
		this.imprecion = imprecion;
	}
	public double getRecargoXenvios() {
		return recargoXenvios;
	}
	public void setRecargoXenvios(double recargoXenvios) {
		this.recargoXenvios = recargoXenvios;
	}
	
	


}
