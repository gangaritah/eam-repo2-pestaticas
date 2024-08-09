
public class Articulo {
	
	public void mostrarElectrodomesticos(String[] nombres) {
        for (int i = 0; i < nombres.length; i++) {
	        System.out.println(nombres[i]);
        }
    }
    
    public void mostrarDeportivos(String[] nombres) {
        for (int i = 0; i < nombres.length; i++) {
	        System.out.println(nombres[i]);
        }
    }
    
    public void mostrarPreciosElectrodomesticos(int[] precios) {
        for (int i = 0; i < precios.length; i++) {
	        System.out.println(precios[i]);
        }
    }

}
