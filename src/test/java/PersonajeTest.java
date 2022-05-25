import org.junit.jupiter.api.Test;

public class PersonajeTest {


    Examen examen = new Examen();

    // TIP:
    // Para obtener la lista de personas:
    //      examen.personas.getResults()
    // Para obtener una persona:
    //      examen.personas.getResults()[0]

    // TODO: (2,5 puntos) Piensa en que test son necesarios para probar la función "passSegura" y realizalos.
    //  Si la persona es null deberá devolver la excepción PersonaNulaException
    //  Si la contraseña es null o está vacía deberá devolver la excepción PassInvalidaException
    //  Si la contraseña cumple todas estas condiciones:
    //  - Longitud 8 y 16 caracteres
    //  - Al menos un dígito
    //  - Al menos una minúscula
    //  - Al menos una mayúscula.
    //  - NO puede tener otros símbolos.
    //  passSegura deberá devolver "true". En caso contrario, "false"
    @Test
    public void testPassSegura_XXX() {
        // Tip:
        // Ejemplo de llamada a la funcion esEspanol
        // PersonasFun.Companion.esPassValida(examen.personas.getResults()[0]);
    }

    // TODO: (2,5 puntos) Piensa en que test son necesarios para probar la función "esEspanol" y realizalos.
    //  Esta función mira si el documento de identidad de la persona es un "DNI". No debe tener en cuenta las mayúsculas.
    //  Es decir, ya ponga "DNI", "dni", "Dni", etc, se debería considerar español y por tanto devolver true.
    //  Si la persona recibida es null, entonces devolverá PersonaNulaException
    //  Si cumple la condición anterior pero el "value" del documento de identidad es null, entonces devolverá un
    //  DocumentoInvalidoException
    @Test
    public void testEsEspanol_XXX() {
        // Tip:
        // Ejemplo de llamada a la funcion esEspanol
        // PersonasFun.Companion.esEspanol(examen.personas.getResults()[0]);
    }







}
