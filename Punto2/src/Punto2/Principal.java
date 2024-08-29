package Punto2;

public class Principal {

	public static void main(String[] args) {
		Electrodomestico electro1 = new Electrodomestico(1, "Licuadora");
		electro1.setPrecioBase(64000);
		electro1.setColor("Negra");
		electro1.setConsumoEnergetico(3600);
		electro1.setPeso(2.3);
		consumoEnergetico(electro1);
		System.out.println("El balance del productos es de: "+calculoBalance(electro1));
		gamaProducto(calculoBalance(electro1));
		electro1.toString();
		
		
	}
	
	public static void consumoEnergetico(Electrodomestico electro1) {
		if(electro1.getConsumoEnergetico()<=45){
			System.out.println("El producto es de bajo consumo");
		}else {
			System.out.println("El producto no es de bajo consumo");
		}
	}
	
	public static double calculoBalance(Electrodomestico electro1) {
		double balance = electro1.getPrecioBase()/electro1.getPeso();
		return balance;
	}
	
	public static void gamaProducto(double balance) {
		int gama = (int)balance;
		if (gama>3) {
			System.out.println("El producto es de alta gama");
		}else {
			System.out.println("El producto es de baja gama");
		}
	}

}
