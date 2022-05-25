public class Examen {

    public GestorDePersonas gestorDePersonas;

    public Examen() {
        gestorDePersonas = ObtenerPersonasRequest.Companion.get();
    }

    /**
     * busca en gestorDePersonas.getPersonas() aquellas personas que son mujeres y devuelve una array de "Personas" con ellas
     * @return array con las personas que son mujeres
     */
    public Persona[] obtenerMujeres(){
        // TODO (0,5 punto) Completa la función y realiza todos los test que sean necesarios para probarla.
        return gestorDePersonas.getPersonas();
    }

    /**
     * busca en el array de personas recibido a aquellas personas que son hombres y devuelve una array de "Personas"
     * con ellos
     * @param arrayPersonas array de personas sobre las que vas a buscar
     * @return
     */
    public Persona[] obtenerHombres(Persona[] arrayPersonas) throws NullPointerException, PersonaNulaException  {
        // TODO (0,5 punto) Completa la función y realiza todos los test que sean necesarios para probarla.
        return new Persona[0];
    }

    /**
     * Busca en gestorDePersonas.getPersonas() y devuelve un array de personas cuyo número de teléfono contiene el texto introducido (en el orden exacto)
     * @param texto que quieres buscar en el número de teléfono
     * @return aquellas personas que en su número de teléfono se encuentra el texto especificado.
     * @throws NullPointerException si texto es null
     */
    public Persona[] obtenerPersonasCuyoTelefonoContiene(String texto) throws NullPointerException {
        // TODO (0,5 punto) Completa la función y realiza todos los test que sean necesarios para probarla.
        return gestorDePersonas.getPersonas();
    }

    /**
     * Comprueba que el email de la persona introducida empieza por su nombre. En caso de que no se cumpla, se deberá
     * lanzar una exception: EmailSinNombreException()
     * @param persona array de personas
     * @throws EmailSinNombreException si el email de alguna persona no empieza por su nombre.
     * @throws PersonaNulaException si personas == null
     */
    public void comprobarEmailEmpiezaPorNombre(Persona persona) throws EmailSinNombreException, PersonaNulaException {
        // TODO (1,5 punto) Completa la función y realiza todos los test que sean necesarios para probarla.
        // Tip: El "nombre" está compuesto por 3 atributos: "title", "first", "last".
        throw new EmailSinNombreException();
    }


    /**
     * comprueba si se cumple que todas las personas recibidas tienen un "title" en el nombre y se corresponde a:
     *  - si es hombre, el título es Mr
     *  - si es mujer, el título es Miss
     * @param personas array de personas.
     * @return true si todos los hombres son Mr y todas las mujeres son Miss
     * @throws NullPointerException si una persona es null
     * @throws PersonaNulaException si una persona es null
     */
    public boolean verificarTitulos(Persona[] personas) throws PersonaNulaException, NullPointerException {
        // TODO (2 punto) Completa la función y realiza todos los test que sean necesarios para probarla.
        // Tip: El "nombre" está compuesto por 3 atributos: "title", "first", "last".
        return true;
    }
}
