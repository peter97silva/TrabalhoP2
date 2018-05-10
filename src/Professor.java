import java.util.LinkedList;

public class Professor extends Pessoa implements Funcionario<GabineteProfessor, Sala> {

    private Gabinete<Professor> gabinete;
    private LinkedList<Horario> horariosAtendimento;

    public Professor(String nome, long numero, GabineteProfessor gabinete) {
        super(nome, numero);
        this.gabinete = gabinete;
        horariosAtendimento = new LinkedList<>();
    }

    public Gabinete<Professor> getGabinete() {
        return gabinete;
    }


    @Override
    public void preencherSumario(Aula aula) {
        if (!aulas.contains(aula)) {
            return;
        }
        aula.adicionarLinhaSumario(aula.getNome());
        aula.adicionarLinhaSumario(String.valueOf(aula.getNumero()));
        aula.adicionarLinhaSumario(nome);
        for (Aluno aluno : aula.getAlunos()) {
            aluno.preencherSumario(aula);
        }
    }


    @Override
    public void abrir(Sala divisao) {
        if(divisao == null){
            return;
        }
        divisao.abrir();
    }

    @Override
    public void fechar(Sala divisao) {
        if(divisao == null){
            return;
        }
        divisao.fechar();
    }

    @Override
    public void abrir() {
        if(this.gabinete.isAberta()){
            return;
        }
        gabinete.abrir();
    }

    @Override
    public void fechar() {
        if(this.gabinete.isAberta()){
            return;
        }
        gabinete.fechar();
    }

    @Override
    public void adicionar(Horario horario){
        if(horario == null){
            return;
        }
        horariosAtendimento.add(horario);
    }

    @Override
    public void remover(Horario horario){
        if(horario == null || !horariosAtendimento.contains(horario)){
            return;
        }
        horariosAtendimento.remove(horario);
    }

    @Override
    public void associar(Gabinete gabineteRecebido) {
        if(gabineteRecebido != null)
        {
            gabinete.adicionar(this);
            this.gabinete = gabineteRecebido;
        }
    }

    @Override
    public void desassociar(Gabinete gabinete) {
        if(gabinete == null){
            return;
        }
        Gabinete<Professor> gabineteAux = gabinete;
        this.gabinete = null;
        gabineteAux.remover(this);
    }

    @Override
    public LinkedList<Horario> getHorario() {
        return new LinkedList<>(horariosAtendimento);
    }
}

