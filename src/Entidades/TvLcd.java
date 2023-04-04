package Entidades;

public class TvLcd extends Electronico {
	private int pulgadas;
	

	

	

	public TvLcd(int precio, String fabricante, int pulgadas) {
		super(precio, fabricante);
		this.pulgadas = pulgadas;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	@Override
	public double getPrecioVenta() {
		// TODO Auto-generated method stub
		return this.getPrecioVenta();
	}

	@Override
	public String toString() {
		return "TV LCD pulgadas: " + pulgadas +" "+  super.toString();
	}
	
	
	
	

}
