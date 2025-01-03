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

# 🔍 Comparator

- Interface Funcional: Pode ter apenas um método abstrato, mas também pode conter métodos `default`e `static`.
- Para usar o `Comparator`, não é obrigatório implementar a interface, diferente do que acontece ao usar a interface `Comparable`. O `Comparator` pode ser usado diretamente através de `classes anônimas` ou `lambdas`, proporcionando flexibilidade na definição de critérios de comparação.
- O `Comparator` permite a criação de funções lambda que implementam o método compare de maneira concisa.