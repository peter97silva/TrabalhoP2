import java.util.LinkedList;

public class Sala extends Divisao implements RepositorioAulas {

    protected LinkedList<Aula> aulas;
    public Sala(String nome, boolean aberta) {
        super(nome,aberta);
        aulas = new LinkedList<>();
    }

    @Override
    public LinkedList<Aula> getAulas() {
        return aulas;
    }

    @Override
    public void adicionar(Aula aula) {
        if(aula == null || aulas.contains(aula)){
            return;
        }
        aulas.add(aula);
    }

    @Override
    public void remover(Aula aula) {
        if(aula == null || aulas.contains(aula)){
            aulas.remove(aula);
            aula.desassociarProfessor();
        }
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


