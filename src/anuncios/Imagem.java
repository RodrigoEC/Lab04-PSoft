package src.anuncios;

public class Imagem extends Anuncio {
    public Imagem(String descricao, int diasDuracao) {
        super(descricao, diasDuracao);
    }

    @Override
    public double calculaPreco() {
        double precoTotal = 2;

        if (this.diasDuracao > 2) {
            precoTotal += (this.diasDuracao - 2) * 1.5;
        }

        return precoTotal;
    }
}
