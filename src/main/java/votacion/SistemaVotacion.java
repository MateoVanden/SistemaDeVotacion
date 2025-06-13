package votacion;

import java.util.ArrayList;
import java.util.List;

public class SistemaVotacion {
    private final List<String> idsVotantes = new ArrayList<>();
    private final Notificador notificador;

    public SistemaVotacion(Notificador notificador) {
        this.notificador = notificador;
    }

    public boolean votar(Votante votante) {
        if (idsVotantes.contains(votante.getId())) {
            System.out.println("El votante ya ha votado.");
            return false;
        }
        idsVotantes.add(votante.getId());
        System.out.println("Voto registrado de: " + votante.getNombre());

        boolean exito = notificador.notificar(); // ahora devuelve algo
        if (!exito) {
            System.out.println("Error al notificar.");
        }

        return true;
    }


    public int totalVotos() {
        return idsVotantes.size();
    }
}