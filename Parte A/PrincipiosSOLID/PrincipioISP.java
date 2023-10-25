//El principio ISP nos dice que Existen clases que implementan interfaces que no siempre usan
//lo correcto seria usar interfaces que tengan comportamientos que vayan de acorde a la clase

public class PrincipioISP {
    class interface Vehiculo{
        void prender();
    }
    class interface Vehiculo_rueda{

        void moverse();//Teniendo en cuenta que es la accion que hacen los vehiculos de rueda para decir que estan moviendose de lugar



    }
    class interface Vehiculo_Aeronave{
        void despegar();//accion unica de las aeronaves ya que los carros no tienen esta caracteristica

    }
    class Carro implements Vehiculo, Vehiculo_rueda{
        @verride
        public void moverse() {

        }
        @Override
        public void prender() {

        }


    }
    class Avion implements Vehiculo, Vehiculo_Aeronave{
        @Override
        public void prender() {

        }
        @Override
        void despegar(){

        }

    }
}
