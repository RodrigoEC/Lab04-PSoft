package src;

import src.anuncios.Anuncio;
import src.anuncios.Imagem;
import src.anuncios.Texto;
import src.anuncios.Video;

public class main {

    public static void main(String[] args) {
        Anuncio anuncio = new Texto("oi meu nome é julia", 3);
        Cliente cliente = new Cliente("Xosh");
        cliente.addAnuncio(anuncio);

        System.out.println(cliente.historico());


    }
}
