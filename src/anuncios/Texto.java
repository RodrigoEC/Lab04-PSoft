package src.anuncios;

public class Texto extends Anuncio{
    public Texto(String descricao, int diasDuracao) {
        super(descricao, diasDuracao);
    }

    @Override
    public double calculaPreco() {
        double precoTotal = 1.5;

        if (this.diasDuracao > 3) {
            precoTotal += (this.diasDuracao - 3) * 1.5;
        }

        return precoTotal;
    }

}
