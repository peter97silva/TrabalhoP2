import java.util.LinkedList;

public class Gabinete<TFuncionario extends Funcionario> extends Divisao {

    private LinkedList<TFuncionario> funcionarios;

    public Gabinete(String nome, boolean aberta) {
        super(nome, aberta);
    }

    public LinkedList<TFuncionario> getFuncionarios() {
        return funcionarios;
    }

    public void adicionar(TFuncionario funcionario) {
        if (funcionario == null || funcionarios.contains(funcionario)) {
            return;
        }
        funcionarios.add(funcionario);
        funcionario.adicionar(null);
    }

    public void remover(TFuncionario funcionario) {
        if (funcionario == null) {
            return;
        }
        funcionarios.remove(funcionario);
        funcionario.remover(null);
    }
}
