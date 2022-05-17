public class Ejercicio5 {

    public Personaje[] arrayPersonajes = new Personaje[0];

    public void iniciarEjercicio5() {
        arrayPersonajes = ObtenerPersonajesRequest.Companion.get();
    }

    public Personaje[] getAll(){
        return arrayPersonajes;
    }


}
