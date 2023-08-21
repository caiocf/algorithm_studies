### O Padrão "Objeto Self-Shunt:"
O padrão Self-Shunt é um padrão de teste unitário onde a classe de teste implementa uma interface que está sendo stubbed ou mockada, permitindo que a própria classe de teste seja usada como um substituto para outro componente.

Vantagens:
- Simplicidade: Evita a necessidade de criar stubs e mocks adicionais.
- Diretividade: Pode tornar o teste mais direto, pois o comportamento do stub ou mock é definido na própria classe de teste.

Desvantagens:
- Complexidade: A classe de teste pode se tornar mais complexa.
- Legibilidade: Pode não ser claro para outros desenvolvedores o que está acontecendo, pois a classe de teste está desempenhando dois papéis.

### O Padrão "Humble Object"
O padrão Objeto Humble é um padrão de design usado em testes de software. Ele sugere que separemos o comportamento difícil de testar (geralmente comportamento que interage com sistemas externos, como I/O, banco de dados, sistema de arquivos ou interfaces de rede) do comportamento que é fácil de testar. Isso é feito criando "objetos humildes", que têm a responsabilidade de lidar com as interações difíceis de testar, deixando o restante do código mais fácil de ser verificado por meio de testes unitários.

Vantagens:
- Testabilidade: Separar o comportamento difícil de testar facilita a escrita de testes unitários para o código restante.
- Separation of Concerns (SoC): Promove a separação de responsabilidades no código, tornando-o mais modular e fácil de manter.
- Reutilização: Pode permitir que partes do código (aquelas fáceis de testar) sejam reutilizadas em diferentes contextos.

Desvantagens:
- Mais classes e interfaces: Pode levar à criação de mais classes e interfaces, o que pode tornar o sistema globalmente mais complexo.
- Performance: Pode haver um leve impacto na performance devido à indireção adicional, embora na prática isso raramente seja um problema.
