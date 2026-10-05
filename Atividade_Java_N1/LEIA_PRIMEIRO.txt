TÉCNICAS DE PROGRAMAÇÃO

ATIVIDADE JAVA N1

Resumo dos cinco exercícios

Cada exercício fica em uma pasta separada. Os exercícios 1 e 2 recebem dados pelo
teclado. Nos exercícios 3, 4 e 5, os dados de exemplo já estão definidos no código.

1. CAIXA ELETRÔNICO

Pasta: exercicio1 · Arquivo: CaixaEletronico.java

Recebe um valor inteiro de saque e informa quantas notas de R$ 200, 100, 50, 20, 10, 5 e
2 são necessárias.

Como funciona

Um vetor guarda as notas. O laço for percorre os valores da maior nota para a menor. A
divisão inteira calcula a quantidade de notas, e o resto da divisão permite ajustar a
distribuição para evitar sobras de R$ 1 ou R$ 3.

Exemplos

- R$ 387: uma nota de cada valor.
- R$ 6: três notas de R$ 2.
- R$ 1 ou R$ 3: informa que o saque não é possível.
Conceitos: variáveis, vetor, repetição, condicionais e operações aritméticas.

2. SISTEMA DE VENDAS

Pasta: exercicio2 · Arquivo: SistemaVendas.java

Recebe a quantidade de vendas e o valor de cada uma. Apresenta total, maior venda, menor
venda, média, quantidade de vendas acima de R$ 500 e comissão.

Como funciona

O programa soma os valores durante a repetição. A primeira venda serve como referência
para encontrar a maior e a menor. O contador aumenta somente quando uma venda ultrapassa
R$ 500.

Comissão sobre o total vendido

- Até R$ 1.000: comissão: 3%
- Acima de R$ 1.000 até R$ 5.000: comissão: 5%
- Acima de R$ 5.000: comissão: 8%

Exemplo

Vendas de R$ 100, 600, 500, 1.000 e 300 resultam em:

- Total: R$ 2.500 · Média: R$ 500.
- Maior: R$ 1.000 · Menor: R$ 100.
- Acima de R$ 500: 2 vendas.
- Comissão: R$ 125.
Conceitos: entrada de dados, repetição, acumulador, contador e condicionais.

3. SISTEMA DE FUNCIONÁRIOS

Pasta: exercicio3 · Arquivos: Funcionario.java e Principal.java

A classe Funcionario guarda nome, cargo e salário em atributos privados. O construtor
recebe os dados iniciais de cada funcionário.

Métodos

- aumentarSalario(): recebe um percentual e atualiza o salário.
- calcularSalarioAnual(): retorna o salário mensal multiplicado por 12.
- exibirDados(): mostra as informações do funcionário.
Resultados dos cinco funcionários

- Ana: aumento: 10%; salário final: R$ 3.300
- Bruno: aumento: 5%; salário final: R$ 2.100
- Carla: aumento: 15%; salário final: R$ 4.600
- Diego: aumento: 8%; salário final: R$ 2.700
- Elisa: aumento: 12%; salário final: R$ 5.600

Conceitos: classes, objetos, construtor, encapsulamento e métodos.

4. FUNCIONÁRIOS COM HERANÇA

Pasta: exercicio4 · Arquivos: Funcionario.java, Gerente.java, Vendedor.java e
Principal.java

Funcionario guarda nome e salário-base. Gerente e Vendedor herdam dessa classe e possuem
suas próprias regras de cálculo.

Cálculo do salário

- Funcionário: recebe o salário-base.
- Gerente: recebe o salário-base mais 20%.
- Vendedor: recebe o salário-base mais 10% do total de suas vendas.
O programa guarda os três tipos em um vetor de Funcionario e chama calcularSalario()
para todos. Cada objeto executa a versão correspondente ao seu tipo.

Resultados

- Ana: tipo: Funcionário; salário final: R$ 2.500
- Bruno: tipo: Gerente; salário final: R$ 6.000
- Carla: tipo: Vendedor; salário final: R$ 3.200

Conceitos: herança, construtores, encapsulamento, sobrescrita e polimorfismo.

5. SISTEMA DE CONTAS BANCÁRIAS

Pasta: exercicio5 · Arquivos: Conta.java, ContaCorrente.java, ContaPoupanca.java e
Principal.java

Conta guarda número, titular e saldo em atributos privados. ContaCorrente e
ContaPoupanca herdam dessa classe.

Operações

- depositar(): soma um valor ao saldo.
- sacar(): subtrai um valor do saldo.
- calcularSaldo(): na conta corrente, desconta a taxa no resultado; na poupança,
  acrescenta o rendimento percentual.
O cálculo retorna o resultado sem modificar o saldo armazenado. Depósitos e saques
alteram esse saldo.

Resultados após as operações

- Corrente 1: saldo calculado: R$ 1.280
- Corrente 2: saldo calculado: R$ 2.070
- Poupança 1: saldo calculado: R$ 1.224
- Poupança 2: saldo calculado: R$ 3.030

Conceitos: classes, objetos, encapsulamento, herança e sobrescrita de métodos.

COMO EXECUTAR NO COMPUTADOR

É necessário ter um JDK instalado, com os comandos java e javac disponíveis.

1. Abra a pasta do exercício

No terminal, entre na pasta do exercício que deseja testar. Exemplo, partindo da pasta
que contém Atividade_Java_N1:

    cd .\Atividade_Java_N1\exercicio1

2. Compile os arquivos

Dentro da pasta escolhida, execute:

    javac -encoding UTF-8 *.java

3. Execute o programa

Use o comando correspondente ao exercício:

- exercicio1: comando: java CaixaEletronico
- exercicio2: comando: java SistemaVendas
- exercicio3: comando: java Principal
- exercicio4: comando: java Principal
- exercicio5: comando: java Principal

4. Informe os dados, quando solicitado

- Exercício 1: digite um valor inteiro de saque, como 387.
- Exercício 2: digite a quantidade de vendas e depois cada valor. Use vírgula nos
  centavos, como 125,50, sem separador de milhar.
- Exercícios 3, 4 e 5: os resultados aparecem automaticamente.
Compile cada exercício dentro da sua própria pasta, pois alguns usam os mesmos nomes de
classes.
