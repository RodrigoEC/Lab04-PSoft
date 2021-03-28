# Laboratório 04

## Bad smells identificados

Irei dividir os bad smells de acordo com a classe para melhor organização

### Anúncio:
-   O atributo "codigoPreco" não tem um nome significativo, tanto que não entendi propriamente o seu significado. Entendi que esse seria o tipo do anuncio, podem esse ser do tipo Imagem, Video ou Texto.

### Compra:
-   O atributo "diasAnuncio" não é de forma alguma significativo para a duração em dias do anúncio. ​
-   A classe compra é uma clase preguiçosa, uma vez que ela não adiciona nenhuma lógica de negócio, apenas possui um objeto do tipo Anuncio e uma informação sobre esse anuncio, informação essa que deveri estar dentro da classe Anuncio.

### Cliente:
- A classe Cliente conhece atribútos demais das classe Anuncio e Compra, além de trazer regras de negócio que deveriam pertencer à classe Anuncio ou Compra, dessa forma a classe Cliente é uma classe que tem o bad smell "inveja de recursos"
- O método "historico" dessa classe faz muitas operações distintas, chegando ao ponto de ficar confuso o que ela se propõe a fazer, esse fato se encaixa no bad smell de "método muito grande". 


## Refatorações feitas

### Anúncio

- A classe anúncio será transformada em um classe abstrata com os subtipos **Imagem**, **Video** e **Texto**, nele a lógico de cálculo do preço será imbutida no anúncio e cada tipo terá sua lógica de negócio para  o cálculo desse preço.
- O objeto Anúncio abrigará o atributo "tempoDuracao" que antes estava na classe Compra como "diasAnuncio"

### Compra

- Essa classe será descartada

### Cliente

- O cliente passará a conhecer menos as propriedades do objeto Anuncio, principalmente no seu método ***historico***.
- O método histórico será internamente modularizado para entre "calculaPrecoTotal" e "apresentaInformacoesCliente"
