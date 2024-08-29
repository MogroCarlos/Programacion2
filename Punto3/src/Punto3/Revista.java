package Punto3;

public class Revista extends Publicacion{

	public Revista(String titulo, String personaResponsable, int codigo, String editorResponsable, int cantidadPaginas,
			double precio, int anioPublicacion) {
		super(titulo, personaResponsable, codigo, editorResponsable, cantidadPaginas, precio, anioPublicacion);
		// TODO Auto-generated constructor stub
	}
	
	private String mesDePublicacion;
	private int numero;
	private String tituloNotaTapa;
	public Revista(String titulo, String personaResponsable, int codigo, String editorResponsable, int cantidadPaginas,
			double precio, int anioPublicacion, String mesDePublicacion, int numero, String tituloNotaTapa) {
		super(titulo, personaResponsable, codigo, editorResponsable, cantidadPaginas, precio, anioPublicacion);
		this.mesDePublicacion = mesDePublicacion;
		this.numero = numero;
		this.tituloNotaTapa = tituloNotaTapa;
	}
	public String getMesDePublicacion() {
		return mesDePublicacion;
	}
	public void setMesDePublicacion(String mesDePublicacion) {
		this.mesDePublicacion = mesDePublicacion;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTituloNotaTapa() {
		return tituloNotaTapa;
	}
	public void setTituloNotaTapa(String tituloNotaTapa) {
		this.tituloNotaTapa = tituloNotaTapa;
	}
	
	

}
