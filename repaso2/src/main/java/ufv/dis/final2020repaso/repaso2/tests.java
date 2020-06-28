package ufv.dis.final2020repaso.repaso2;

import static org.junit.Assert.*;

import org.junit.Test;

public class tests {

	@Test
	public void testInstanciar() {
		
		Producto p = new Producto("pera", "fruta", 2, "8556659580889");
		
		assertEquals("pera", p.getNombre());
		
	}
	
	
	@Test
	public void testAdd() {
		
		Producto p = new Producto("pera", "fruta", 2, "8556659580889");
		
		Lista l = new Lista();
		
		l.addProducto(p);
		assertEquals(1, l.sizeLista());
		
	}
	
	
	@Test
	public void testRemove() {
		
		Producto p = new Producto("pera", "fruta", 2, "8556659580889");
		
		Lista l = new Lista();
		l.addProducto(p);
		l.removeProducto(p);
		
		assertEquals(0, l.sizeLista());
		
	}
	
	

}
