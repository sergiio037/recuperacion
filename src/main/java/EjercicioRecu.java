import java.util.ArrayList;

public class EjercicioRecu {

    // TODO Completa todas las funciones que aparecen en este fichero.
    //  Realiza todos los test que prueben esas funciones
    public GestorDePersonas gestorDePersonas;

    public EjercicioRecu() {
        gestorDePersonas = ObtenerPersonasRequest.Companion.get();
    }

    /**
     * Devuelve todas las personas que viven en España : location - city.
     *
     * @return Devuelve todas las personas que viven en España : location - city.
     */
    public Persona[] personasQueVivenEnSpain() {
        // TODO 1p
        int x=0;
        int y=0;
        Persona[] persona = gestorDePersonas.getPersonas().clone();
        for (Persona pers : persona){
            if (pers.getLocation().getCountry().equals("Spain")){
                x++;
            }
        }
        Persona[] p = new Persona[x];
        for (x=0;x< persona.length;x++){
            if (persona[x].getLocation().getCountry().equals("Spain")){
                p[y]=persona[x];
                y++;
            }
        }
        return p;
    }


    /**
     * @param personas array de personas sobre el que debes buscar
     * @return Devuelve todas las personas que viven en España : location - city.
     */
    public Persona[] personasQueVivenEnSpain(Persona[] personas) {
        // TODO 1p
        int x=0;
        int y=0;

        for (Persona pers : personas){
            if (pers.getLocation().getCountry().equals("Spain")){
                x++;
            }
        }
        Persona[] p = new Persona[x];
        for (x=0;x< personas.length;x++){
            if (personas[x].getLocation().getCountry().equals("Spain")){
                p[y]=personas[x];
                y++;
            }
        }
        return p;
    }

    /**
     * @return Devuelve a la persona más vieja de todas (age)
     */
    public Persona personaMasVieja() {
        // TODO 1p
        Persona[] p = gestorDePersonas.getPersonas();
        Long i=(long)0;
        int maximo=0;
        for (int x=0;x<p.length;x++) {

            if(i<p[x].getDob().getAge()){
                i=p[x].getDob().getAge();
                maximo=x;
            }
        }

        return p[maximo];
    }


    /**
     *
     * @return personas array de personas sobre el que debes buscar
     * @throws NoHayViejosException si todas las personas tienen menos de 18 años
     * @throws PersonaNulaException si alguna de las personas fuera null
     */
    public Long edadDelMasViejo(Persona[] personas) throws NoHayViejosException, PersonaNulaException {
        // TODO 1p
        Persona[] p = personas;
        boolean checkviejo=true;
        Long i=(long)0;
        int maximo=0;
        for (Persona p1: personas){
            if(p1 == null){
                throw new PersonaNulaException();
            }
        }
        for (int x=0;x<p.length;x++) {
            if(p[x].getDob().getAge()>=18)
                checkviejo=false;

            if(i<p[x].getDob().getAge()){
                i=p[x].getDob().getAge();
                maximo=x;
            }
        }
        if (checkviejo==true)
            throw new NoHayViejosException();




        return p[maximo].getDob().getAge();
    }

    /**
     *
     * @return Devuelve todas las personas que viven en unas coordenadas comprendidas entre:
     * latitud -4 y 0
     * longitug 50 y 60
     */
    public Persona[] personasQueVivenEnCoordenadaFijas() {
        // TODO 1p
        return gestorDePersonas.getPersonas();
    }

    /**
     *
     * @param personas array de personas sobre el que debes buscar
     * @param latitudMaxima coordenada sobre la que buscar
     * @param latitudMinima coordenada sobre la que buscar
     * @param longitudMaxima coordenada sobre la que buscar
     * @param longitudMinima coordenada sobre la que buscar
     * @return Devuelve todas las personas que viven en unas coordenadas comprendidas entre:
     * latitudMaxima y latitudMinima
     * longitudMaxima y longitudMinima
     * @throws PersonaNulaException si alguna de las personas fuera null
     * @throws CoordenadaIncompatibleException si alguna de las coordenadas tuviera un mínimo superior al máximo
     */
    public Persona[] personasQueVivenEnCoordenadaFijas(Persona[] personas, float latitudMaxima, float latitudMinima, float longitudMaxima, float longitudMinima) throws PersonaNulaException, CoordenadaIncompatibleException{
        // TODO 2p
            personas = gestorDePersonas.getPersonas().clone();
            if (personas == null) {
                throw new PersonaNulaException();
            }

        return gestorDePersonas.getPersonas();


    }
}
