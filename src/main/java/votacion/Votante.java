package votacion;

public class Votante {
    private final String id;
    private final String nombre;

    public Votante(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
}