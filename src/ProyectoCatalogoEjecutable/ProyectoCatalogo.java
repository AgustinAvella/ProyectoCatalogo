package ProyectoCatalogoEjecutable;

import Entidades.IProducto;
import Entidades.Iphone;
import Entidades.Libro;
import Entidades.Producto;
import Entidades.TvLcd;
import java.util.Date;
import Entidades.Comics;

public class ProyectoCatalogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		IProducto[] productos = new Producto[6];
		productos[0] = new TvLcd(340000,"LG", 40);
		productos[1] = new Comics(15000, new Date() , "Marvel", "Capitan America", "Peques", "Capitan America");
		productos[2] = new Iphone(640000, "Steve Jobs", "Iphone 15", "Negro");
		productos[3] = new Iphone(400000, "Steve Jobs", "Iphone 13", "Gold");
		productos[4] = new Libro(12000, new Date(), "Paul Gartier", "Como hacer un perfume", "Parfumerie");
		productos[5] = new TvLcd(500000,"Samsung", 60);
		
		for(IProducto cont:productos) {
			System.out.println("--------------------------");
			System.out.println(cont.toString());
			
		}

	}

}
