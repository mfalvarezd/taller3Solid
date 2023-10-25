package PrincipiosSOLID;

public class PrincipioOCP {

}

//Código donde NO se aplica el Principio OPC

public class Circulo implements Forma {
	private double radio;

 	public Circulo(double radio) {
 		this.radio = radio;
 	}
 	
 	public double getRadio() {
 		return radio;
 	}
}

public class Cuadrado implements Forma {
	private double lado;
	
	public Cuadrado(double lado) {
		this.lado = lado;
	}
	
	public double getLado() {
 		return lado;
 	}
}

public class CalculadoraDeAreas {
	public double calcularAreaCircle(Circulo c) {
		return Math.PI * c.getRadio() * c.getRadio();

	}
	
	public double calcularAreaSquare(Cuadrado c) {
		return c.getLado() * c.getLado();

	}
}
 
 public static void main(String[] args) {
     CalculadoraDeAreas calculadora = new CalculadoraDeAreas();

     Circulo circulo = new Circulo(5);
     Cuadrado cuadrado = new Cuadrado(4);

     double areaCirculo = calculadora.calcularAreaCircle(circulo);
     double areaCuadrado = calculadora.calcularAreaSquare(cuadrado);

     System.out.println("Área del círculo: " + areaCirculo);
     System.out.println("Área del cuadrado: " + areaCuadrado);
}




//Código donde SI se aplica el Principio OPC
 
public interface Forma {
	double calcularArea();
}

public class Circulo implements Forma {
	private double radio;

 	public Circulo(double radio) {
 		this.radio = radio;
 	}

 	@Override
 	public double calcularArea() {
 		return Math.PI * radio * radio;
 	}
}

public class Cuadrado implements Forma {
	private double lado;
	
	public Cuadrado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public double calcularArea() {
		return lado * lado;
	}
}

public class CalculadoraDeAreas {
	public double calcularArea(Forma forma) {
		return forma.calcularArea();
	}
 
 public static void main(String[] args) {
     CalculadoraDeAreas calculadora = new CalculadoraDeAreas();

     Circulo circulo = new Circulo(5);
     Cuadrado cuadrado = new Cuadrado(4);

     double areaCirculo = calculadora.calcularArea(circulo);
     double areaCuadrado = calculadora.calcularArea(cuadrado);

     System.out.println("Área del círculo: " + areaCirculo);
     System.out.println("Área del cuadrado: " + areaCuadrado);
}
