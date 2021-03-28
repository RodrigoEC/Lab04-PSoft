package src.anuncios;

public class Video extends Anuncio{


    public Video(String descricao, int diasDuracao) {
        super(descricao, diasDuracao);
    }

    @Override
    public double calculaPreco() {
        return this.diasDuracao * 3;
    }

    @Override
    public int calculaPontuacao() {
        int pontuacao = 1;

        if (this.diasDuracao > 1) pontuacao++;

        return pontuacao;
    }
}
