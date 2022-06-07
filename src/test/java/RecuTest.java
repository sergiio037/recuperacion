import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class RecuTest {


    Examen examen = new Examen();
    EjercicioRecu examenRecu = new EjercicioRecu();
    // TIP:
    // Para obtener la lista de personas:
    //      examen.personas.getResults()
    // Para obtener una persona:
    //      examen.personas.getResults()[0]

    // TODO: (2,5 puntos) Piensa en que test son necesarios para probar la función "esIrlandes" y realizalos.
    //  Si la persona es null deberá devolver la excepción PersonaNulaException
    //  Si la "nat" no es "IE" pero vive en "Ireland", deberá devolver ErrorEnNacionalidadException
    //  Si la "nat" es "IE" pero no vive en "Ireland", deberá devolver ErrorEnNacionalidadException
    //  Asegurate que el 100% de pasar el test sobre el 100% de las personas disponibles.
    //  esIrlandes deberá devolver "true" si es irlandés. En caso contrario, "false"
    @Test
    public void testEsIrlandes_XXX() {
        // TODO 2p
        Persona [] personas = {examen.gestorDePersonas.getPersonas().clone()[1],examen.gestorDePersonas.getPersonas().clone()[3],examen.gestorDePersonas.getPersonas().clone()[6]};
        for (Persona p: personas)
        Assertions.assertEquals("Ireland", p.getLocation().getCountry());
    }

    @Test
    public void IrlandesPersonaNula() {
        Assertions.assertThrows(PersonaNulaException.class, () -> PersonasFun.Companion.esIrlandes(null));
    }

    @Test
    public void IrlandesSinIE() {
        Persona personas = examen.gestorDePersonas.getPersonas().clone()[1];
        personas.getLocation().setCountry("Ireland");
        personas.setNat("ES");
        Assertions.assertThrows(ErrorEnNacionalidadException.class, () -> PersonasFun.Companion.esIrlandes(personas));
    }

    @Test
    public void NoEsIrlandesTieneIE() {
        Persona personas = examen.gestorDePersonas.getPersonas().clone()[5];
        personas.getLocation().setCountry("Spain");
        personas.setNat("IE");
        Assertions.assertThrows(ErrorEnNacionalidadException.class, () -> PersonasFun.Companion.esIrlandes(personas));
    }

    @Test
    public void PersonaEspanola() {
        Persona[] personas = examenRecu.personasQueVivenEnSpain();
        for (int x = 0; x < personas.length; x++) {
            Assertions.assertEquals("Spain", personas[x].getLocation().getCountry());
        }
    }

    @Test
    public void PersonaNoEspanola() {
        Persona[] personas = examen.gestorDePersonas.getPersonas();

        Assertions.assertNotEquals("Spain", personas[0].getLocation().getCountry());
        Assertions.assertNotEquals("Spain", personas[1].getLocation().getCountry());
        Assertions.assertNotEquals("Spain", personas[2].getLocation().getCountry());
        Assertions.assertNotEquals("Spain", personas[3].getLocation().getCountry());
        Assertions.assertEquals("Spain", personas[4].getLocation().getCountry());
        Assertions.assertNotEquals("Spain", personas[5].getLocation().getCountry());
        Assertions.assertNotEquals("Spain", personas[6].getLocation().getCountry());
        Assertions.assertNotEquals("Spain", personas[7].getLocation().getCountry());
        Assertions.assertNotEquals("Spain", personas[8].getLocation().getCountry());
        Assertions.assertEquals("Spain", personas[9].getLocation().getCountry());
    }

    @Test
    public void PersonaViveSpain(){

        Persona[] personas = examenRecu.personasQueVivenEnSpain(examen.gestorDePersonas.getPersonas());
        for (int x = 0; x < personas.length; x++) {
            Assertions.assertEquals("Spain", personas[x].getLocation().getCountry());
        }
    }

    @Test
    public void PersonaMasVieja() throws NoHayViejosException, PersonaNulaException {


        Assertions.assertEquals(300, examenRecu.personaMasVieja().getDob().getAge());
        Assertions.assertEquals(300, examenRecu.edadDelMasViejo(examen.gestorDePersonas.getPersonas()));

    }
    @Test

    public void PersonasEdadMenor18() {
        Persona [] todas=examen.gestorDePersonas.getPersonas();
        Long[] edades= new Long[10];

        for (int x=0;x<todas.length;x++){
            edades[x] =todas[x].getDob().getAge();
        }
        for (int x=0;x<todas.length;x++){
            todas[x].getDob().setAge(1);
        }

        Assertions.assertThrows(NoHayViejosException.class, ()-> examenRecu.edadDelMasViejo(todas));

        for (int x=0;x<todas.length;x++){
            todas[x].getDob().setAge(edades[x]);
        }

    }
    @Test
    public void PersonasNula() {
        Persona []personas=examen.gestorDePersonas.getPersonas().clone();
        personas[1] = null;

        for(Persona p: examen.gestorDePersonas.getPersonas()){
            System.out.println(p.getDob().getAge());
        }

        Assertions.assertThrows(PersonaNulaException.class, ()-> examenRecu.edadDelMasViejo(personas));


    }
}

