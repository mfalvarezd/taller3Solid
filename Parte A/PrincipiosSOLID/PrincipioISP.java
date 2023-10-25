//El principio ISP nos dice que Existen clases que implementan interfaces que no siempre usan
//lo correcto seria usar interfaces que tengan comportamientos que vayan de acorde a la clase

public class PrincipioISP {
    class interface Vehiculo{
        void prender();
    }
    class interface Vehiculo_rueda{

        void moverse();



    }
    class interface Vehiculo_Aeronave{
        void despegar();

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
