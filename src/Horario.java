public class Horario {
    private DiaSemana diaSemana;
    private int horaInicio;
    private int duracao;

    public Horario(DiaSemana diaSemana, int horaInicio, int duracao) {
        this.diaSemana = diaSemana;
        this.horaInicio = horaInicio;
        this.duracao = duracao;
    }

    public DiaSemana getDiaSemana() {
        return diaSemana;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public int getDuracao() {
        return duracao;
    }

    public boolean isSobreposto(Horario horario) {
        int horafim;
        int horafimSobreposto = horario.getHoraInicio() + horario.getDuracao();
        horafim = horaInicio + duracao;
        if (horario.getDiaSemana() != this.getDiaSemana())
            return false;
        if (horario.getHoraInicio() >= horaInicio &&
                horafimSobreposto <= horafim) {
            return true;
        }
        return false;
    }
}
