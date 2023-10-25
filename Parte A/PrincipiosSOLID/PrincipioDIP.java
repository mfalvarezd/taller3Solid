//El principio DIP nos dice que nuestras clases de alto nivel no deben depender de otra de un nivel mas bajo
//El principio de inversión de dependencia establece que nuestras clases deben depender de interfaces o clases
//abstractas en lugar de clases y funciones concretas


public class PrincipioDIP {
    class Persona {

        private String nombre;

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre=nombre;
        }
    }
    public interface IPersistencia {

        public void guardar(Object object);


    }
    public class MySql implements IPersistencia {

        public void guardar(Object object) {
            System.out.println("Guardado.");

        }

    }
    public class PersonaServicio {


        private IPersistencia persistencia;

        public PersonaServicio(IPersistencia persistencia) {
            this.persistencia = persistencia;
        }

        public void guardarPersona(Persona persona) {
            persistencia.guardar(persona);
        }

    }

}