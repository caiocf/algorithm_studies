Tipos de Objetos Substitutos em Testes

Esses termos são usados em testes de software, especificamente no contexto de testes unitários. Eles se referem a diferentes tipos de objetos substitutos usados para isolar componentes sob teste de suas dependências:
1. Dummy

   Descrição: Um objeto que é passado ao redor, mas nunca realmente usado. Geralmente é utilizado para preencher listas de parâmetros.
   Propósito: É usado para permitir que o teste seja executado, mas o próprio objeto dummy não tem funcionalidade.
   Exemplo: Uma interface que um método requer como parâmetro, mas que nunca é chamado no cenário específico que está sendo testado.

2. Fake

   Descrição: Um objeto que tem uma implementação, mas é simplificado e não adequado para produção.
   Propósito: Permite que o teste seja executado em um ambiente isolado.
   Exemplo: Uma implementação de repositório de dados que armazena dados em uma lista em vez de uma base de dados real.

3. Mock

   Descrição: Um objeto que verifica as interações durante o teste, como verificar se um método foi chamado.
   Propósito: Verificar comportamentos.
   Exemplo: Usando uma biblioteca de mock como Mockito em Java, verificar se um método específico foi chamado.

4. Spy

   Descrição: Um objeto que atua como a implementação real, mas também permite a verificação de interações.
   Propósito: Envolver um objeto real e verificar se certos métodos foram chamados sem afetar o comportamento desse objeto.
   Exemplo: Usando Mockito, criar um spy de uma lista real e verificar se o método add foi chamado.

Nota: As diferenças entre Mocks e Spies podem ser sutis e podem variar entre diferentes bibliotecas e linguagens de programação. A distinção principal é que um Mock é uma imitação completa de uma classe ou interface, enquanto um Spy é um envoltório em torno de uma instância rea
