import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonajeTest {


    Examen ej = new Examen();

    @Test
    public void test1(){
        // TODO Haz una función que te devuelva un array compuesto por:
        //  Personajes que tienen imagen asociada.
        // tip: ej.personajes.obtenerTodos()[0].getImage()

        // TODO comprueba que tu función devuelve el número correcto de elementos
        // tip: es 25
    }


    @Test
    public void test2(){
        // TODO Comprueba que la función: obtenerPotters()
        //  nos devuelve una lista de 6 elementos
        // tip: ej.personajes.obtenerPotters()
        Assertions.assertEquals(6, ej.personajes.obtenerPotters().length);
    }

}
