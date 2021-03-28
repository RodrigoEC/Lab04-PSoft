package src;

import src.anuncios.Anuncio;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;


class Cliente {
	private String nome;
	private List<Anuncio> anuncios;
	private int pontosTotal;

	public Cliente(String nome) {
		this.nome = nome;
		this.anuncios = new ArrayList<>();
		this.pontosTotal = 0;
	}

	public void addAnuncio(Anuncio novoAnuncio) {
		anuncios.add(novoAnuncio);
	}

	public String getNome() {
		return nome;
	}

	public double calculaPrecoTotal() {
		double precoTotal = 0;

		for (Anuncio anuncio: anuncios) {
			precoTotal += anuncio.calculaPreco();
			this.pontosTotal += anuncio.calculaPontuacao();
		}

		return precoTotal;
	}

	public String exibeInfoCliente(double precoTotal) {
		String info = String.format("Histórico de compras de anúncios por: %s \n" +
				"- Total devido é %.1f\n" +
				"- Você ganhou %d pontos.", this.getNome(), precoTotal, this.pontosTotal);
		return info;
	}

	public String historico() {
		double precoTotal = this.calculaPrecoTotal();
		return exibeInfoCliente(precoTotal);
	}

}