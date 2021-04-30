# Lista de exercícios

1. Faça um Programa que peça dois números e imprima o maior deles. [Resolução](/logicaDeProgramacao/src/estruturaDeDecisao/Exercicio01.java)
2. Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo. [Resolução](/logicaDeProgramacao/src/estruturaDeDecisao/Exercicio02.java)
3. Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido. [Resolução](/logicaDeProgramacao/src/estruturaDeDecisao/Exercicio03.java)
4. Faça um Programa que verifique se uma letra digitada é vogal ou consoante. [Resolução](/logicaDeProgramacao/src/estruturaDeDecisao/Exercicio04.java)
5. Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar: [Resolução](/logicaDeProgramacao/src/estruturaDeDecisao/Exercicio05.java)
    * A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
    * A mensagem "Reprovado", se a média for menor do que sete;
    * A mensagem "Aprovado com Distinção", se a média for igual a dez.
6. Faça um Programa que leia três números e mostre o maior deles. [Resolução](/logicaDeProgramacao/src/estruturaDeDecisao/Exercicio06.java)
7. Faça um Programa que leia três números e mostre o maior e o menor deles. [Resolução](/logicaDeProgramacao/src/estruturaDeDecisao/Exercicio07.java)
8. Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato. [Resolução](/logicaDeProgramacao/src/estruturaDeDecisao/Exercicio08.java)
9. Faça um Programa que leia três números e mostre-os em ordem decrescente. [Resolução](/logicaDeProgramacao/src/estruturaDeDecisao/Exercicio09.java)
10. Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso. [Resolução](/logicaDeProgramacao/src/estruturaDeDecisao/Exercicio10.java)
11. As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contraram para desenvolver o programa que calculará os reajustes. Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual: [Resolução](/logicaDeProgramacao/src/estruturaDeDecisao/Exercicio11.java)
    * salários até R$ 280,00 (incluindo) : aumento de 20%
    * salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
    * salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
    * salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado, informe na tela:
    * o salário antes do reajuste;
    * o percentual de aumento aplicado;
    * o valor do aumento;
    * o novo salário, após o aumento.
12. Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos os descontos. O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês. [Resolução](/logicaDeProgramacao/src/estruturaDeDecisao/Exercicio12.java)<br/>
    Desconto do IR:<br/>
    * Salário Bruto até 900 (inclusive) - isento
    * Salário Bruto até 1500 (inclusive) - desconto de 5%
    * Salário Bruto até 2500 (inclusive) - desconto de 10%
    * Salário Bruto acima de 2500 - desconto de 20% Imprima na tela as informações, dispostas conforme o exemplo abaixo. No exemplo o valor da hora é 5 e a quantidade de hora é 220.
    ```
        Salário Bruto: (5 * 220)        : R$ 1100,00
        (-) IR (5%)                     : R$   55,00  
        (-) INSS ( 10%)                 : R$  110,00
        FGTS (11%)                      : R$  121,00
        Total de descontos              : R$  165,00
        Salário Liquido                 : R$  935,00
    ```
13. Faça um Programa que leia um número e exiba o dia correspondente da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido. [Resolução](/logicaDeProgramacao/src/estruturaDeDecisao/Exercicio13.java)
14. Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre, e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo: [Resolução](/logicaDeProgramacao/src/estruturaDeDecisao/Exercicio14.java)
    ```
      Média de Aproveitamento  Conceito
      Entre 9.0 e 10.0        A
      Entre 7.5 e 9.0         B
      Entre 6.0 e 7.5         C
      Entre 4.0 e 6.0         D
      Entre 4.0 e zero        E
    ```
O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem “APROVADO” se o conceito for A, B ou C ou “REPROVADO” se o conceito for D ou E.

15. Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem ser um triângulo. Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno. [Resolução](/logicaDeProgramacao/src/estruturaDeDecisao/Exercicio15.java)<br/>
    Dicas:<br/>
    - Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
    - Triângulo Equilátero: três lados iguais;
    - Triângulo Isósceles: quaisquer dois lados iguais;
    - Triângulo Escaleno: três lados diferentes;
16. Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2 + bx + c. O programa deverá pedir os valores de a, b e c e fazer as consistências, informando ao usuário nas seguintes situações: [Resolução](/logicaDeProgramacao/src/estruturaDeDecisao/Exercicio16.java)<br/>
    a. Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o programa não deve fazer pedir os demais valores, sendo encerrado;<br/>
    b. Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário e encerre o programa;<br/>
    c. Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao usuário;<br/>
    d. Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário;<br/>
    
17. Faça um Programa que peça um número correspondente a um determinado ano e em seguida informe se este ano é ou não bissexto. [Resolução](/logicaDeProgramacao/src/estruturaDeDecisao/Exercicio17.java)
18. Faça um Programa para leitura de três notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e presentar: [Resolução](/logicaDeProgramacao/src/estruturaDeDecisao/Exercicio18.java)<br/>
    a. A mensagem "Aprovado", se a média for maior ou igual a 7, com a respectiva média alcançada;<br/>
    b. A mensagem "Reprovado", se a média for menor do que 7, com a respectiva média alcançada;<br/>
    c. A mensagem "Aprovado com Distinção", se a média for igual a 10.<br/>
    
19. Faça um Programa que peça um número inteiro e determine se ele é par ou impar. Dica: utilize o operador módulo (resto da divisão). [Resolução](/logicaDeProgramacao/src/estruturaDeDecisao/Exercicio19.java)
20. Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são: [Resolução](/logicaDeProgramacao/src/estruturaDeDecisao/Exercicio20.java)<br/>
    a. "Telefonou para a vítima?"<br/>
    b. "Esteve no local do crime?"<br/>
    c. "Mora perto da vítima?"<br/>
    d. "Devia para a vítima?"<br/>
    e. "Já trabalhou com a vítima?"<br/>
    O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".<br/>
21. Um posto está vendendo combustíveis com a seguinte tabela de descontos: [Resolução](/logicaDeProgramacao/src/estruturaDeDecisao/Exercicio21.java)<br/>
    a. Álcool:<br/>
    b. até 20 litros, desconto de 3% por litro<br/>
    c. acima de 20 litros, desconto de 5% por litro<br/>
    d. Gasolina:<br/>
    e. até 20 litros, desconto de 4% por litro<br/>
    f. acima de 20 litros, desconto de 6% por litro<br/>
    Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível (codificado da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90.<br/>
22. Uma fruteira está vendendo frutas com a seguinte tabela de preços: [Resolução](/logicaDeProgramacao/src/estruturaDeDecisao/Exercicio22.java)
    ```
                          Até 5 Kg           Acima de 5 Kg
    Morango         R$ 2,50 por Kg          R$ 2,20 por Kg
    Maçã            R$ 1,80 por Kg          R$ 1,50 por Kg
    ```
    Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.<br/>
23. O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira: [Resolução](/logicaDeProgramacao/src/estruturaDeDecisao/Exercicio23.java)
    ```
                          Até 5 Kg           Acima de 5 Kg
    File Duplo      R$ 4,90 por Kg          R$ 5,80 por Kg
    Alcatra         R$ 5,90 por Kg          R$ 6,80 por Kg
    Picanha         R$ 6,90 por Kg          R$ 7,80 por Kg
    ```
    Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos de carne da promoção, porém não há limites para a quantidade de carne por cliente. Se compra for feita no cartão Tabajara o cliente receberá ainda um desconto de 5% sobre o total da compra. Escreva um programa que peça o tipo e a quantidade de carne comprada pelo usuário e gere um cupom fiscal, contendo as informações da compra: tipo e quantidade de carne, preço total, tipo de pagamento, valor do desconto e valor a pagar.<br/>

Fonte dos exercícios: http://wiki.python.org.br/EstruturaDeDecisao
