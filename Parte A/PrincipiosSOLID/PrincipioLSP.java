package taller3Solid;

public class PrincipioLSP {
	
	public class Vehiculo {
	    public void mover() {
	        System.out.println("El vehículo se está moviendo.");
	    }
	}

	public class Coche extends Vehiculo {
	    @Override
	    public void mover() {
	        System.out.println("El coche se está desplazando en carretera.");
	    }

	    public void encender() {
	        System.out.println("El coche se ha encendido.");
	    }
	}

	publix class Bicicleta extends Vehiculo {
	    @Override
	    public void mover() {
	        System.out.println("La bicicleta se está pedaleando.");
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        Vehiculo miCoche = new Coche();
	        Vehiculo miBicicleta = new Bicicleta();

	        miCoche.mover();
	        miBicicleta.mover();
	    }
	}

}
