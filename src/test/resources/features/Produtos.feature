#language: pt
#encoding: utf-8
Funcionalidade: Login
  como usuario desejo acessar minha conta

  @addMochila
  Cenario: adicionando mochila ao carrinho
    Dado que o usuario esteja logado
    E deseja ver detalhes do item mochila
    E adiciona ao carrinho
    E e aciona o botao carrinho
    Entao mostra que a mochila foi adicionada

  @addTodosItens
  Cenario: adicionando todos os itens ao carrinho
    Dado que o usuario esteja logado
    E deseje adicionar todos os itens ao carrinho
    Entao carrinho mostra possuir todos os itens

  @removerTodosItens
  Cenario: removendo todos os itens do carrinho
    Dado que o usuario esteja logado
    E deseje adicionar todos os itens ao carrinho
    E e aciona o botao carrinho
    Mas o usuario desejou remover os itens
    Entao mostra o carrinho vazio

  @voltarPaginaInicial
  Cenario: voltando pagina inicial
    Dado que o usuario esteja logado
    E adiciona um item ao carrinho
    E e aciona o botao carrinho
    E deseja contunuar comprando
    Entao volta a pagina inicial

  @selecionarPorMenorPreco
  Cenario: selecionar por menor preco
    Dado que o usuario esteja logado
    E deseje selecionar itens do mais barato para o mais caro
    Entao mostra que esta do mais barato para o mais caro
