package src.anuncios;

public class Imagem extends Anuncio {
    public Imagem(String descricao, int diasDuracao) {
        super(descricao, diasDuracao);
    }

    @Override
    public double calculaPreco() {
        return 2;
    }
}
