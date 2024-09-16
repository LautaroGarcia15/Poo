public class Agenda {
    String lugar;
    List<Pariticipante> participantes;
    int duracion;

    public Agenda(String lugar, List<Pariticipante> participantes, int duracion) {
        this.lugar = lugar;
        this.participantes = participantes;
        this.duracion = duracion;
    }

    class Participante {
        String nombre;
        String email;

    }
}
