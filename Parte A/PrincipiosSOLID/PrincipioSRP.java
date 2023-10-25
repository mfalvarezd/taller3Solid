package taller3Solid;

public class PrincipioSRP {
	
/*En este ejemplo no se cumple el principio de responsabilidad única, el cual coniste 
en que una clase debe tener una sola razón para cambiar, es decir que una clase solo debe concentrarse
en una responsablidad. Esto no significa que la clase tenga un solo método, sino que puede tener varios métodos 
que estén relacionados a esa única responsabilidad.*/

	class Coche {  
	    String marca;

	    Coche(String marca){ this.marca = marca; }

	    String getMarcaCoche(){ return marca; } //	Este método retorna un atributo de la clase coche

	    void guardarCocheDB(Coche coche){ ... }// Este método se encarga de guardar un coche en la base de datos
	}
	//Como se puede observar, ambos métodos tienen responsabilidades/propósitos totalmente diferentes.
}

//CORRECCIÓN//

/* En este ejemplo se corrigió el código para que cumpliera con el principio de responsabilidad única. El problema principal
era las diferentes responsabilidades que tenía la clase Coche y para solucionarlo se creó otra clase llamada CocheDB 
para que se enfoque únicamente en la manipulación de la base de datos, donde se implementaron métodos como guardaeCocheDB  
y eliminarCocheDB. Mientras que la clase Coche solo se enfoca en retornar los atributos de la clase.*/

class Coche {  //Se enfoca únicamente en retornar los atributos
    String marca;

    Coche(String marca){ this.marca = marca; }

    String getMarcaCoche(){ return marca; }
}

class CocheDB{ //Se enfoca únicamente en actualizar la base de datos
    void guardarCocheDB(Coche coche){ ... }
    void eliminarCocheDB(Coche coche){ ... }
}


