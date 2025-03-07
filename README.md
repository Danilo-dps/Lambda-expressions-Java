# Programação Funcional e Expressões Lambdas

## 📚 Conceitos Principais

- É comum os objetos serem imutáveis
- Tipagem dinâmica / inferência de tipos
- Expressividade / código conciso
- **Expressão lambda** em programação funcional, corresponde a uma função anônima de primeira classe.
- Cálculo Lambda = formalismo matemático base da programação funcional
- Expressão lambda = função anônima de primeira classe

# Paradigma programação funcional & transparência referencial

- Uma função possui transparência referencial se seu resultado for sempre o mesmo para os mesmos dados de entrada
- Um exemplo claro de transparência referencial, é quando uma função não depende de valores externos para fazer a operação
- No exemplo **Non-referential transparency** ocorre justamente o oposto, já que a função `changeOddValues` depende de um valor externo
- `Paradigma programação funcional` tem fortíssima transparência referencial

# Funções são objetos de primeira ordem (ou primeira classe)

- Quando dizemos que uma função é um objeto de primeira ordem (ou primeira classe) em um determinado paradigma de programação, isso significa que funções podem ser tratadas como qualquer outro valor ou variável. Ou seja, elas podem ser:
  - Atribuídas a variáveis
  - Passadas como argumentos para outras funções
  - Retornadas por outras funções
  - Armazenadas em coleções (listas, arrays, mapas, etc.)
- Um objeto (ou entidade) é considerado de primeira classe quando ele pode ser usado em qualquer lugar que outros objetos também possam
- Quem chama o método ou classe precisa oferecer suporte para tratar funções como objetos de primeira classe. Ou seja, a função que faz a chamada precisa estar preparada para receber outra função como argumento

# O que são interfaces funcionais?

- Interfaces funcionais são interfaces em Java que possuem **apenas um método abstrato**, o que permite que elas sejam usadas como o alvo de expressões lambda. Embora tenham um único método abstrato, interfaces funcionais podem também conter métodos `default` e `static`, que possuem implementações concretas.
- No Java, expressões lambda são uma forma concisa de implementar interfaces funcionais. Internamente, a linguagem trata expressões lambda como instâncias de interfaces funcionais, criando um mapeamento direto entre programação funcional e orientação a objetos.
- Em linguagens puramente funcionais, não há necessidade de interfaces; tudo é baseado em funções e expressões lambda. No entanto, no Java, como é uma linguagem orientada a objetos, as interfaces funcionais oferecem uma maneira de integrar conceitos funcionais dentro do paradigma orientado a objetos.

# 🔍 Comparator

- Interface Funcional: Pode ter apenas um método abstrato, mas também pode conter métodos `default`e `static`.
- Para usar o `Comparator`, não é obrigatório implementar a interface, diferente do que acontece ao usar a interface `Comparable`. O `Comparator` pode ser usado diretamente através de `classes anônimas` ou `lambdas`, proporcionando flexibilidade na definição de critérios de comparação.
- O `Comparator` é uma interface funcional e permite a criação de funções lambda que implementam o método compare de maneira concisa.

# 💡 Predicate 

- A interface funcional `Predicate<T>` representa uma função que recebe um argumento do tipo `T` e retorna um valor booleano, sendo usada para avaliar uma condição.
- Pode ser usada com expressões lambda.
- Nesse exemplo, é feito o uso de 5 formas, mostrando como é a variedade de uso. Todas essas formas estão comentadas.

# 🔍 Consumer

- A interface funcional `Consumer<T>` representa uma função que recebe um argumento do tipo `T` e executa alguma operação, mas não retorna nenhum valor (é void). É usada para processar ou consumir dados.
- Pode ser usada com expressões lambda.
- Nesse exemplo, é feito o uso de 5 formas, mostrando como é a variedade de uso. Todas essas formas estão comentadas.

# 💡 Function 

- A interface funcional `Function<T, R>` representa uma função que recebe um argumento do tipo `T` e retorna um resultado do tipo `R`. É usada para aplicar uma operação ou transformação em um dado, produzindo um novo valor.
- Nesse exemplo será usado a função `map`, é feito também o uso de 5 formas, mostrando como é a variedade de uso. Todas essas formas estão comentadas.
- A função `"map"` **(não confunda com a estrutura de dados Map)** é uma função que aplica uma função a todos elementos de uma `stream(fluxos de dados)`.
- A função `map` aplica a transformação e gera um novo stream com os resultados. O método `collect` pega os elementos desse novo `stream` e os coleta em uma coleção (como uma lista), com as modificações feitas pelo `map`. Essas operações ocorrem em conjunto.
- Conversões:
  -  **List para stream:** `.stream()`
  -  **Stream para List:** `.collect(Collectors.toList())`

# 🔍 Functions that take functions as a parameter (Funções que recebem funções como parâmetro)

- Nesse exemplo, é criada a classe `ProductService`, que usa como parâmetro um `Predicate`. Isso permite a criação de um método que utiliza métodos dessa interface funcional, como o método `.test`, passando uma lista para verificar qual item se encaixa na lógica implementada e aplicando a função.
- No programa principal, é feita a instanciação de um objeto do tipo `ProductService`, e a função `.filteredSum` criada nessa classe recebe dois parâmetros: o primeiro é uma lista, e o segundo é um objeto `Predicate`.
- O objeto `Predicate` aceita uma função lambda que define a condição a ser aplicada.

# 💡 Stream

- A interface `Stream<T>` representa uma sequência de elementos sobre os quais operações agregadas podem ser realizadas. A Stream não armazena dados, mas opera sobre uma fonte de dados, como coleções, arrays, ou geradores de dados.
- Uma **Stream** pode ser vista como uma ponte que conecta uma fonte de dados, como uma coleção, array ou qualquer outra estrutura de dados, a uma série de operações agregadas que você deseja realizar sobre esses dados.
- Ao invocar **.stream()**, a fonte de dados não é alterada; em vez disso, uma nova Stream é criada. Esta Stream fica preparada para receber operações adicionais, como filtros, mapeamentos e reduções, sem modificar o estado original da coleção.

## Características

- Stream é uma solução para processar sequências de dados de forma:
    -  Declarativa (iteração interna: escondida do programador)
    -  Parallel-friendly (imutável -> thread safe)
    -  Sem efeitos colaterais
    -  Sob demanda (lazy evaluation)
    -  Acesso sequencial (não há índices)
    -  Single-use: só pode ser "usada" uma vez
    -  **Pipeline**: operações em streams retornam novas streams. Então possível criar uma cadeia de operações (fluxo de processamento).

## Operações intermediárias e terminais

- O pipeline é composto por zero ou mais operações intermediárias e
uma terminal.
- Operação intermediária:
  - Produz uma nova streams (encadeamento)
  - Só executa quando uma operação terminal é invocada (lazy evaluation)
- Operação terminal:
  - Produz um objeto não-stream (coleção ou outro)
  - Determina o fim do processamento da stream

## Operações intermediárias

- filter, map, flatmap, peek, distinct, sorted, skip, `limit(*)`

    - `(*) short-circuit` é quando a condição do método é encontrada resultando na finalização do método

## Operações terminais

- forEach, forEachOrdered, toArray, reduce, collect, min, max, count, `anyMatch (*), allMatch (*), noneMatch (*), findFirst (*), findAny (*)`

    - `(*) short-circuit` é quando a condição do método é encontrada resultando na finalização do método

## Criar uma stream

- Basta chamar o método stream() ou parallelStream() a partir
de qualquer objeto Collection.
- Outras formas de se criar uma stream incluem:
  - Stream.of
  - Stream.ofNullable
  - Stream.iterate

# 🔍 Pipeline

- Termo `pipeline` é frequentemente utilizado para descrever um processo em que dados são transformados em uma série de etapas sequenciais, em que a saída de uma etapa é a entrada da próxima.