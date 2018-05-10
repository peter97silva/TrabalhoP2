public class Aluno extends Pessoa {


    public Aluno(String nome, long numero) {
        super(nome, numero);
    }

    @Override
    public void preencherSumario(Aula aula) {
        if (aulas.contains(aula)) {
            aula.adicionarLinhaSumario(nome);
        } else {
            return;
        }
    }

}
