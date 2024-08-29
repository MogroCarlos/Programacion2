package Punto3;

public class Publicacion {
	private String titulo;
	private String personaResponsable;
	private int codigo=0;
	private String editorResponsable;
	private int cantidadPaginas;
	private double precio;
	private int anioPublicacion;
	
	public Publicacion(String titulo, String personaResponsable, int codigo, String editorResponsable,
			int cantidadPaginas, double precio, int anioPublicacion) {
		super();
		this.titulo = titulo;
		this.personaResponsable = personaResponsable;
		this.codigo = ++codigo;
		this.editorResponsable = editorResponsable;
		this.cantidadPaginas = cantidadPaginas;
		this.precio = precio;
		this.anioPublicacion = anioPublicacion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getPersonaResponsable() {
		return personaResponsable;
	}

	public void setPersonaResponsable(String personaResponsable) {
		this.personaResponsable = personaResponsable;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getEditorResponsable() {
		return editorResponsable;
	}

	public void setEditorResponsable(String editorResponsable) {
		this.editorResponsable = editorResponsable;
	}

	public int getCantidadPaginas() {
		return cantidadPaginas;
	}

	public void setCantidadPaginas(int cantidadPaginas) {
		this.cantidadPaginas = cantidadPaginas;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getAnioPublicación() {
		return anioPublicacion;
	}

	public void setAnioPublicación(int anioPublicación) {
		this.anioPublicacion = anioPublicación;
	}

}
