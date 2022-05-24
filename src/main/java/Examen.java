public class Examen {

    public Personajes personajes;

    public Examen() {
        personajes = new Personajes(ObtenerPersonajesRequest.Companion.get());
    }

    // TODO Haz una función que te devuelva un array compuesto por:
    //  Personajes que tienen imagen asociada.

    public Personaje[] personajesConImagen() {

        for (Personaje p : personajes.obtenerTodos()){
            if (!p.getImage().isEmpty()) {
                // TODO añadir al output
            }
        }
        return personajes.obtenerTodos();
    }

}
