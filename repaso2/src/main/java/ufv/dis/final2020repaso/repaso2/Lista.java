package ufv.dis.final2020repaso.repaso2;

import java.util.ArrayList;

public class Lista {
	
	private ArrayList<Producto> list = new ArrayList<Producto>();
	
	
	
	
	public Lista() {
		
		this.list = new ArrayList<Producto>();
		
	}
	
	public void addProducto(Producto p) {
		
		this.list.add(p);
		
	}
	
	public void removeProducto(Producto p) {
		
		this.list.remove(p);
		
	}
	
	
	public int sizeLista(){
		
		return this.list.size();		
	}
	

}
