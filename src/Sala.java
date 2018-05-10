import java.util.LinkedList;

public class Sala extends GestorAulasSala implements RepositorioAulas {

    public Sala(String nome, boolean aberta) {
        super(nome,aberta);
    }

    @Override
    public LinkedList<Aula> getAulas() {
        return aulas;
    }

    public LinkedList<Aula> getAulas(Horario horario) {
        LinkedList<Aula> aulasHorario = new LinkedList<>();
        for (Aula aula : aulas) {
            if (aula.getHorario().isSobreposto(horario)) {
                aulasHorario.add(aula);
            }
        }
        return aulasHorario;
    }

    public void setAulas(LinkedList<Aula> aulas) {
        this.aulas = aulas;
    }


}


