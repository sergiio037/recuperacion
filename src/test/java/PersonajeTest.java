import org.junit.jupiter.api.Assertions;
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

    @Test
    public void testPassSegura_PassCasoNormal() {
        Persona p = examen.gestorDePersonas.getPersonas()[0];
        p.getLogin().setPassword("Aa12345678");
        Assertions.assertTrue(PersonasFun.Companion.passSegura(p));
    }
    @Test
    public void testPassSegura_PersonaNull() {
        Assertions.assertThrows(PersonaNulaException.class, () -> PersonasFun.Companion.passSegura(null));
    }

    @Test
    public void testPassSegura_PersonaPassNull() {
        Persona p = examen.gestorDePersonas.getPersonas()[0];
        p.getLogin().setPassword(null);
        Assertions.assertThrows(PassInvalidaException.class, () -> PersonasFun.Companion.passSegura(p));
    }

    @Test
    public void testPassSegura_PassMenos8() {
        Persona p = examen.gestorDePersonas.getPersonas()[0];
        p.getLogin().setPassword("Aa1");
        Assertions.assertFalse(PersonasFun.Companion.passSegura(p));
    }

    @Test
    public void testPassSegura_PassMas16() {
        Persona p = examen.gestorDePersonas.getPersonas()[0];
        p.getLogin().setPassword("Aa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        Assertions.assertFalse(PersonasFun.Companion.passSegura(p));
    }

    @Test
    public void testPassSegura_PassNoNumber() {
        Persona p = examen.gestorDePersonas.getPersonas()[0];
        p.getLogin().setPassword("Aaaaaaaaaaaaa");
        Assertions.assertFalse(PersonasFun.Companion.passSegura(p));
    }

    @Test
    public void testPassSegura_PassNoMayuscula() {
        Persona p = examen.gestorDePersonas.getPersonas()[0];
        p.getLogin().setPassword("1aaaaaaaaaaaa");
        Assertions.assertFalse(PersonasFun.Companion.passSegura(p));
    }

    @Test
    public void testPassSegura_PassNoMinuscula() {
        Persona p = examen.gestorDePersonas.getPersonas()[0];
        p.getLogin().setPassword("1AAAAAAAAA");
        Assertions.assertFalse(PersonasFun.Companion.passSegura(p));
    }

    @Test
    public void testPassSegura_PassNoSimbolos() {
        Persona p = examen.gestorDePersonas.getPersonas()[0];
        p.getLogin().setPassword("1AAAAAAAA$");
        Assertions.assertFalse(PersonasFun.Companion.passSegura(p));
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

    @Test
    public void testEsEspanol_NoEspanol() {
        // En este caso podemos modificar un usuario nuestro, como en el caso anterior o bien usar personas ya existentes.
        // Para ello miramos en el debugger que usuarios cumplen / no cumplen los criterios.
        // Por ejemplo el usuario
        Persona p = examen.gestorDePersonas.getPersonas()[0];
        p.getLogin().setPassword("1AAAAAAAA$");
        Assertions.assertFalse(PersonasFun.Companion.passSegura(p));
    }

    @Test
    public void testEsEspanol_SiEspanol() {
        // En este caso podemos modificar un usuario nuestro, como en el caso anterior o bien usar personas ya existentes.
        // Para ello miramos en el debugger que usuarios cumplen / no cumplen los criterios.
        // Por ejemplo el usuario el usuario 9 tiene id = "DNI" y value = "66135422-N"
        Persona p = examen.gestorDePersonas.getPersonas()[9];
        Assertions.assertTrue(PersonasFun.Companion.passSegura(p));
    }
    @Test
    public void testEsEspanol_DocumentoInvalidoException() {
        // Por ejemplo el usuario el usuario 7 tiene id = "dni" y value = "null"
        Persona p = examen.gestorDePersonas.getPersonas()[7];
        Assertions.assertThrows(DocumentoInvalidoException.class, () -> PersonasFun.Companion.esEspanol(p));
        // La función no tiene en cuenta el "dni", solo busca por "DNI". El test es correcto, la función incorrecta.
    }

    @Test
    public void testEsEspanol_DocumentoInvalidoPeroNoDni() {
        // En este caso podemos modificar un usuario nuestro, como en el caso anterior o bien usar personas ya existentes.
        // Para ello miramos en el debugger que usuarios cumplen / no cumplen los criterios.
        // Por ejemplo el usuario el usuario 6 tiene id = "dni" y value = "null"
        Persona p = examen.gestorDePersonas.getPersonas()[6];
        Assertions.assertFalse(PersonasFun.Companion.esEspanol(p));
        // La función no tiene en cuenta el "dni", solo busca por "DNI". El test es correcto, la función incorrecta.
    }

    // TEST de la clase Examen

    @Test
    public void testEsMujer() {
        Persona[] personas = new Persona[]{
                examen.gestorDePersonas.getPersonas()[4],
                examen.gestorDePersonas.getPersonas()[5],
                examen.gestorDePersonas.getPersonas()[6],
                examen.gestorDePersonas.getPersonas()[8],
                examen.gestorDePersonas.getPersonas()[9]
        };
        Assertions.assertArrayEquals(examen.obtenerMujeres(), personas);
    }

    @Test
    public void testEsHombre_Null() {
        Persona[] personas = null;
        Assertions.assertThrows(NullPointerException.class, () -> examen.obtenerHombres(personas));
    }
    @Test
    public void testEsHombre_Todos() {
        Persona[] personas = new Persona[]{
                examen.gestorDePersonas.getPersonas()[0],
                examen.gestorDePersonas.getPersonas()[1],
                examen.gestorDePersonas.getPersonas()[2],
                examen.gestorDePersonas.getPersonas()[3],
                examen.gestorDePersonas.getPersonas()[7]
        };
        try {
            Assertions.assertArrayEquals(examen.obtenerHombres(examen.gestorDePersonas.getPersonas()), personas);
        } catch (PersonaNulaException e) {
            Assertions.fail();
        }
    }

    @Test
    public void testComprobarTelefono_Null(){
        Assertions.assertThrows(NullPointerException.class, () -> examen.obtenerPersonasCuyoTelefonoContiene(null));
    }

    @Test
    public void testComprobarTelefono_NumeroExistente(){
        Persona[] personas = new Persona[]{
                examen.gestorDePersonas.getPersonas()[0],
        };
        String phone = "177-466-0970";

        Assertions.assertArrayEquals(personas, examen.obtenerPersonasCuyoTelefonoContiene(phone));
    }

    @Test
    public void testComprobarTelefono_Parcial(){
        Persona[] personas = new Persona[]{
                examen.gestorDePersonas.getPersonas()[0],
                examen.gestorDePersonas.getPersonas()[1],
                examen.gestorDePersonas.getPersonas()[3],
                examen.gestorDePersonas.getPersonas()[4],
                examen.gestorDePersonas.getPersonas()[5],
                examen.gestorDePersonas.getPersonas()[6],
                examen.gestorDePersonas.getPersonas()[7],
                examen.gestorDePersonas.getPersonas()[9],
        };
        String phone = "-";

        Assertions.assertArrayEquals(personas, examen.obtenerPersonasCuyoTelefonoContiene(phone));
    }

    @Test
    public void testComprobarTelefono_NoExistente(){
        Persona[] personas = new Persona[0];
        String phone = ":D";

        Assertions.assertArrayEquals(personas, examen.obtenerPersonasCuyoTelefonoContiene(phone));
    }

    @Test
    public void testEmailEmpiezaPorNombre_PersonaNull(){
        Assertions.assertThrows(PersonaNulaException.class, () -> examen.comprobarEmailEmpiezaPorNombre(null));
    }

    @Test
    public void testEmailEmpiezaPorNombre_PasswordNull(){
        Persona p = examen.gestorDePersonas.getPersonas()[1];
        // Si miramos en los datos, el número 2 jay-robert tiene un email erroneo
        Assertions.assertThrows(EmailSinNombreException.class, () -> examen.comprobarEmailEmpiezaPorNombre(p));
    }

    @Test
    public void testEmailEmpiezaPorNombre_Ok(){
        Persona p = examen.gestorDePersonas.getPersonas()[0];
        Assertions.assertDoesNotThrow(() -> examen.comprobarEmailEmpiezaPorNombre(p));
    }


    @Test
    public void testVerificarTitulos_PersonasNull(){
        Assertions.assertThrows(NullPointerException.class, () -> examen.verificarTitulos(null));
    }

    @Test
    public void testVerificarTitulos_PersonaNull(){
        Persona[] personas = examen.gestorDePersonas.getPersonas().clone();
        personas[0] = null;
        Assertions.assertThrows(PersonaNulaException.class, () -> examen.verificarTitulos(personas));
    }

    @Test
    public void testVerificarTitulos_NoOk(){
        try {
            // La señora "Aubree" tiene el título de Mrs, no de Miss.
            // La señora "Emily" tiene el título de Ms, no de Miss.

            Assertions.assertFalse(examen.verificarTitulos(examen.gestorDePersonas.getPersonas()));
        } catch (PersonaNulaException e) {
            Assertions.fail();
        }
    }

    @Test
    public void testVerificarTitulos_Ok(){
        // Creamos un nuevo array con aquellas personas que cumplen los requisitos
        Persona[] personas = new Persona[]{
                examen.gestorDePersonas.getPersonas()[0],
                examen.gestorDePersonas.getPersonas()[1],
                examen.gestorDePersonas.getPersonas()[2],
                examen.gestorDePersonas.getPersonas()[3],
                examen.gestorDePersonas.getPersonas()[4],
                //examen.gestorDePersonas.getPersonas()[5],
                examen.gestorDePersonas.getPersonas()[6],
                examen.gestorDePersonas.getPersonas()[7],
                //examen.gestorDePersonas.getPersonas()[8],
                examen.gestorDePersonas.getPersonas()[9],
        };

        try {
            // La señora "Aubree" tiene el título de Mrs, no de Miss.
            Assertions.assertTrue(examen.verificarTitulos(personas));
        } catch (PersonaNulaException e) {
            Assertions.fail();
        }
    }

}
