#language: pt
#encoding: utf-8
Funcionalidade: Login
  como usuario desejo acessar minha conta

  Contexto: 
    Dado que na pagina inicial e clicar em acessar

  @bloqueado
  Cenario: usuario bloqueado
    E insiro o usuario "locked_out_user"
    E a senha "secret_sauce"
    E clico em login
    Entao aparece mensagem que o usuario esta bloqueado

  @semDados
  Cenario: tentativa de login sem dados
    E clico em login
    Entao aparece mensagem solicitando o usurario

  @senhaErrada
  Cenario: senha errada
    E insiro o usuario "standard_user"
    E a senha "senha"
    E clico em login
    Entao aparece mensagem que senha e usuario nao correspondem

  @valido
  Cenario: usuario valido
    E insiro o usuario "standard_user"
    E a senha "secret_sauce"
    E clico em login
    Entao carrega pagina principal com produtos
