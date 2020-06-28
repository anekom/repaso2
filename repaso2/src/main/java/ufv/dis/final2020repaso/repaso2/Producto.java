package ufv.dis.final2020repaso.repaso2;

public class Producto {
	
	private String nombre;
	private String categoria;
	private int precio;
	private String ean;
	
	
	
	
	public Producto(String nombre, String categoria, int precio, String ean) {
		super();
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.ean = ean;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getEan() {
		return ean;
	}
	public void setEan(String ean) {
		this.ean = ean;
	}
	
	
	

}
