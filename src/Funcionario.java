public interface Funcionario<TGabinete extends  Gabinete, TDivisao extends Divisao> {
    void abrir(TDivisao gabinete);

    void fechar(TDivisao gabinete);

    void abrir();

    void fechar();

    void adicionar(Horario horario);

    void remover(Horario horario);

    void associar(Gabinete gabinete);

    void desassociar(Gabinete gabinete);
}
