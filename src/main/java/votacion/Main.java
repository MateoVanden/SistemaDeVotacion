package votacion;

public class Main {
    public static void main(String[] args) {
        SistemaVotacion sistema = new SistemaVotacion(new Notificador());
        Votante v1 = new Votante("123", "Ana");
        Votante v2 = new Votante("456", "Luis");

        sistema.votar(v1);
        sistema.votar(v2);
    }
}
