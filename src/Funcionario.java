public interface Funcionario {
    void abrir(GabineteProfessor gabinete);

    void fechar(GabineteProfessor gabinete);

    void abrir(Divisao divisao);

    void fechar(Divisao divisao);

    void adicionar(Horario horario);

    void remover(Horario horario);
}
