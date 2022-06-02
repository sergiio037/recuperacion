import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RecuTest {


    Examen examen = new Examen();

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

    }

}
