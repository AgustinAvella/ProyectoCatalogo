package Entidades;

public abstract class Producto implements IProducto {
	//Hacer el cambio de privacidad de private a protected
	protected int precio;

	
	
	
	
	public Producto(int precio) {
		super();
		this.precio = precio;
	}





	public int getPrecio() {
		return precio;
	}





	@Override
	public String toString() {
		return "precio: $" + precio;
	}
	
	
	





}
