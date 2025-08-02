# 💳 Projeto ContaTerminal

Este projeto em Java simula a criação de uma conta bancária no terminal, interagindo com o usuário por meio da entrada de dados via `Scanner`.

## 📋 Descrição

O programa `ContaTerminal` foi desenvolvido para coletar informações básicas de um cliente e exibir uma mensagem personalizada de sucesso ao final do processo de criação da conta.

O sistema solicita os seguintes dados ao usuário:

- Número da conta (apenas 4 dígitos)
- Número da agência (com formato sugerido: `000-X`)
- Nome do cliente (primeiro nome ou nome completo)
- Saldo inicial da conta

Após coletar essas informações, o programa exibe uma mensagem de confirmação com os dados fornecidos.

## 📌 Funcionalidades

- Leitura de dados com `Scanner`
- Validação visual e instruções para o usuário
- Exibição de mensagem de boas-vindas personalizada

## 🧾 Exemplo de execução

```bash
-- O numero da conta deve ter âpenas 4 digitos Ex:0000 --
   Por favor, digite o número da Conta !
   Conta: 1234
----------------------------------------------------------------------------------
-- O numero da conta deve possuir 4 digitos o ultimo separado por (-) Ex: 000-X --
   Por favor, digite o número da Agência !
   Agência: 123-4
----------------------------------------------------------------------------------
-- Informar âpenas o primeiro nome Ex: Maria Clara --
   Por favor, digite o seu nomme !
   Nome: Jonatas Vinicius
----------------------------------------------------------------------------------
-- Informar o saldo dessa conta Ex: R$100,00 --
   Por favor, digite o seu saldo !
   R$: 250.75

----------------------------------------------------------------------------------
  PARABENS!!!
   Olá Jonatas Vinicius, obrigado por criar uma conta em nosso banco, sua agência é 123-4, conta 1234 e seu saldo R$250.75 já está disponível para saque
