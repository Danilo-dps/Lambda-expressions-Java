# Programação Funcional e Expressões Lambdas

## 📚 Conceitos Principais

- Interface Funcional: Pode ter apenas um método abstrato, mas também pode conter métodos `default`e `static`.
- Função Lambda: Toda função lambda é uma função anônima, sendo uma implementação concisa de uma interface funcional.

# 🔍 Comparator

- Para usar o `Comparator`, não é obrigatório implementar a interface, diferente do que acontece ao usar a interface `Comparable`. O `Comparator` pode ser usado diretamente através de `classes anônimas` ou `lambdas`, proporcionando flexibilidade na definição de critérios de comparação.
- O `Comparator` permite a criação de funções lambda que implementam o método compare de maneira concisa.