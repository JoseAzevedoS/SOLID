# Classes e Suas Responsabilidades
---
```Item.java```
O que faz: Representa um produto individual
Para que serve: Armazenar nome e preço de um item do pedido

```Pedido.java```
O que faz: Representa um pedido completo do cliente
Para que serve: Guardar lista de itens e forma de pagamento escolhida

```RepositorioPedido.java (Interface)```
O que faz: Define contrato para salvar pedidos
Para que serve: Garantir que todo repositório implemente o método salvar

```MySQLRepositorio.java```
O que faz: Salva pedidos no banco MySQL
Para que serve: Implementar a persistência real no banco de dados

```ProcessadorPagamento.java (Interface)```
O que faz: Define contrato para processar pagamentos
Para que serve: Garantir que todos os pagamentos tenham método processar

```PagamentoCartaoCredito.java```
O que faz: Processa pagamentos com cartão
Para que serve: Executar lógica específica do cartão de crédito

```PagamentoBoleto.java```
O que faz: Processa pagamentos com boleto
Para que serve: Executar lógica específica do boleto bancário

```PagamentoPix.java```
O que faz: Processa pagamentos com PIX
Para que serve: Executar lógica específica do PIX

```FabricaProcessadorPagamento.java```
O que faz: Cria objetos de pagamento baseado no tipo
Para que serve: Converter "cartao" em new PagamentoCartaoCredito()

```CalculadoraTotal.java```
O que faz: Calcula valor total do pedido
Para que serve: Somar preços de todos os itens

```NotificadorEmail.java```
O que faz: Envia emails de confirmação
Para que serve: Notificar cliente sobre o pedido

```ProcessadorDePedidos.java```
O que faz: Coordena todo o processamento do pedido
Para que serve: Orquestrar a sequência: calcular → pagar → salvar → notificar

```ECommerceSolid.java```
O que faz: Classe principal com método main
Para que serve: Demonstrar o funcionamento do sistema com exemplos
