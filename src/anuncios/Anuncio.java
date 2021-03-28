package src.anuncios;
public abstract class Anuncio {
	
	protected String descricao;
	protected Integer diasDuracao;

	public Anuncio(String descricao, int diasDuracao) {
		this.descricao = descricao;
		this.diasDuracao = diasDuracao;
	}

	public Integer getDiasDuracao() {
		return diasDuracao;
	}

	public void setDiasDuracao(Integer diasDuracao) {
		this.diasDuracao = diasDuracao;
	}

	public String getDescricao (){
		return descricao;
	}

	public abstract double calculaPreco();

	public int calculaPontuacao() {
		return 1;
	}
}