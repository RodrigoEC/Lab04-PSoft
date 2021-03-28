# Laboratório 04

## Bad smells identificados

Irei dividir os bad smells de acordo com a classe para melhor organização

### Anúncio

- O atributo "codigoPreco" não tem um nome significativo, tanto que não entendi direito ainda se a interpretação que tive foi correta. Entendi que esse é o tipo do Anuncio, sendo esse **IMAGEM**, **VIDEO** ou **TEXTO —**
- A classe anúncio poderia ser uma classe abstrata, cujo subClasses tem o calculo do preço de acordo com seu tipo —

### Compra

- O atributo "diasAnuncio" não é significativo o suficiente para que outro programador conseguir entender o que ele representa.
- A classe compra é uma classe **preguiçosa**, uma vez que ela não adiciona nenhuma lógica de negócio, apenas possui a classe anúncio e uma informação sobre esse anúncio, informação essa que deveria estar dentro da classe Anuncio — `**Classe preguiçosa**`

### Cliente

- A classe Cliente conhece muitos atributos e trás para sí regras de negócio que deveriam pertencer à classe de Anúncio ou a classe de Compra, se cacterizando como o bad smell — **`INVEJA DE RECURSOS`**
- O método "histórico" dessa classe faz muita coisa, chegando ao ponto de ficar confuso o que ele se propõe a fazer, se encaixando no bad smell de método muito grande. — `**Metodo muito grande**`

## Refatorações feitas

### Anúncio

- A classe anúncio será transformada em um classe abstrata com os subtipos **Imagem**, **Video** e **Texto**, nele a lógico de cálculo do preço será imbutida no anúncio e cada tipo terá sua lógica de negócio para  o cálculo desse preço.
- O objeto Anúncio abrigará o atributo "tempoDuracao" que antes estava na classe Compra como "diasAnuncio"

### Compra

- Essa classe será descartada

### Cliente

- O cliente passará a conhecer menos as propriedades do objeto Anuncio, principalmente no seu método ***historico***.
- O método histórico será internamente modularizado para entre "calculaPrecoTotal" e "apresentaInformacoesCliente"
