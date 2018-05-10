import java.util.LinkedList;

public abstract class Pessoa extends GestorAulasPessoa {

    public Pessoa(String nome, long numero) {
        super(nome, numero);
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


}
