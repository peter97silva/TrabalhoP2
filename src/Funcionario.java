public interface Funcionario<TGabinete extends  Gabinete, TDivisao extends Divisao> {
    void abrir(TGabinete gabinete);

    void fechar(TGabinete gabinete);

    void abrir(TDivisao divisao);

    void fechar(TDivisao divisao);

    void adicionar(Horario horario);

    void remover(Horario horario);

    void associar(Gabinete gabinete);

    void desassociar(Gabinete gabinete);
}
