import java.util.LinkedList;

public abstract class Pessoa extends Identificador {

    protected LinkedList<Aula> aulas;

    public Pessoa(String nome, long numero) {
        super(nome, numero);
        aulas = new LinkedList<>();
    }

    public LinkedList<Aula> getAulas() {
        return new LinkedList<Aula>(aulas);
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


    public abstract void preencherSumario(Aula aula);


    public void adicionar(Horario horario) {

    }

    public void adicionar(Aula aula) {
        if(aula == null || aulas.contains(aula)){
            return;
        }
        aulas.add(aula);
    }

    public void remover(Aula aula) {
        if(!aulas.contains(aula)) {
            return;
        }
        aulas.remove(aula);
    }

}
