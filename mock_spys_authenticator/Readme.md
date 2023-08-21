Tipos de Objetos Substitutos em Testes

Esses termos são usados em testes de software, especificamente no contexto de testes unitários. Eles se referem a diferentes tipos de objetos substitutos usados para isolar componentes sob teste de suas dependências:

### 1. Dummy
- **Descrição:** Um objeto que é passado mas nunca realmente usado. Geralmente é utilizado para preencher listas de parâmetros.
- **Propósito:** Garantir que o código pode ser executado sem erros quando um argumento é necessário, mas o valor real não é relevante para o teste.
- **Exemplo:** Se uma função requer um parâmetro do tipo `User`, mas o teste não se preocupa com os detalhes desse usuário, um objeto `User` dummy pode ser passado.

### 2. Fake
- **Descrição:** Uma implementação que tem um comportamento funcional, mas não é a implementação real usada em produção. Por exemplo, uma base de dados em memória em vez de uma base de dados real.
- **Propósito:** Simular componentes reais de maneira mais leve e controlada para facilitar os testes.
- **Exemplo:** Se você tem um repositório que normalmente acessa um banco de dados, um repositório fake pode ser criado que apenas usa uma lista em memória.

### 3. Mock
- **Descrição:** Um objeto que verifica se certas chamadas ou interações são feitas nele durante o teste.
- **Propósito:** Garantir que certas ações ocorram durante o teste. É usado para verificar comportamentos.
- **Exemplo:** Se você quer garantir que uma função `enviarEmail` foi chamada durante um teste, você pode criar um mock dessa função e verificar se ela foi chamada.

### 4. Spy
- **Descrição:** Um objeto que registra algumas ou todas as interações que são feitas nele.
- **Propósito:** Observar o comportamento de um objeto, como quais métodos foram chamados e com quais argumentos, sem alterar seu comportamento.
- **Exemplo:** Se você quer saber quantas vezes uma função foi chamada, mas não quer alterar seu comportamento, você pode usar um spy.

### 5. Stub
- **Descrição:** Um objeto que substitui um método específico de um objeto para retornar um valor ou comportamento específico.
- **Propósito:** Controlar o comportamento de um objeto para facilitar o teste.
- **Exemplo:** Se você tem uma função que faz uma chamada HTTP e você não quer fazer essa chamada durante o teste, você pode substituir essa função por um stub que retorna um valor fixo.

