Com base nos arquivos inspecionados, aqui está um resumo das lógicas de negócio do projeto `movie_rental`:

### 1. **VideoRegistry**:
- Mantém um registro de filmes disponíveis para aluguel.
- Os filmes são categorizados em dois tipos: REGULAR e CHILDRENS.
- Permite adicionar um novo filme ao registro e recuperar um filme existente com base em seu título.

### 2. **RentalCalculator**:
- Mantém uma lista de aluguéis.
- Permite adicionar um novo aluguel à lista.
- Calcula a taxa total de aluguel com base nos aluguéis na lista.
- Calcula os pontos totais de aluguel com base nos aluguéis na lista.
- Permite limpar a lista de aluguéis.

### 3. **Rental**:
- Representa um aluguel de filme.
- Mantém o número de dias pelo qual o filme foi alugado.
- Recupera o filme alugado do `VideoRegistry` com base em seu título.
- Permite obter o título do filme alugado.
- Calcula os pontos de aluguel e a taxa de aluguel com base no filme e no número de dias.

### Exemplos de Pontuação e Taxa:
- A pontuação e a taxa de aluguel são calculadas com base no tipo de filme (REGULAR ou CHILDRENS) e no número de dias pelo qual o filme foi alugado.
- O método `getPoints()` em `Rental` recupera os pontos de aluguel para o filme alugado.
- O método `getFee()` em `Rental` recupera a taxa de aluguel para o filme alugado.

Para obter detalhes específicos sobre como a pontuação e a taxa são calculadas para cada tipo de filme, as classes `RegularMovie` e `ChildrensMovie`.

**RegularMovie**:
- Taxa: 150 (unidade monetária) para os primeiros 3 dias. Taxas adicionais podem ser aplicadas após o período de carência.
- Pontos: 1 ponto, com possíveis ajustes após o período de carência de 3 dias.

**ChildrensMovie**:
- Taxa: 100 (unidade monetária) por dia.
- Pontos: 1 ponto fixo.


