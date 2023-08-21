## 🎳 Jogo de Boliche: Regras, Implementação e Exemplos

### 📜 Regras do Jogo:

O boliche é jogado em 10 frames. Em cada frame, o jogador tem até duas oportunidades para derrubar 10 pinos. A pontuação de um frame é a soma total de pinos derrubados mais bônus por strikes e spares.

- **Strike**: Quando todos os 10 pinos são derrubados na primeira jogada. O bônus para esse frame é a soma das duas próximas jogadas.
- **Spare**: Quando todos os 10 pinos são derrubados em duas jogadas. O bônus para esse frame é a pontuação da próxima jogada.
- **Jogada Normal**: Simplesmente a soma dos pinos derrubados nas duas tentativas.

### 🛠️ Implementação:

A implementação modela um jogo de boliche, permitindo que os jogadores registrem suas jogadas e calculem sua pontuação total. A classe principal, `Game`, contém métodos para:

- Registrar jogadas.
- Calcular a pontuação total.
- Verificar condições especiais como strikes e spares.
- Calcular bônus de pontuação para strikes e spares.

### 🎯 Exemplos de Jogadas e Pontuações:

1. **Jogada Perfeita (Perfect Game)**
    - Jogadas: Strike em todos os frames.
    - Pontuação: 300 pontos.

2. **Jogada com Todos Spares**
    - Jogadas: Spare em todos os frames, com 5 pinos derrubados em cada jogada.
    - Pontuação: 150 pontos.

3. **Jogada Mista**
    - Jogadas: Strike, 7 e 2, Spare (5 e 5), 5 e 4, Strike, Strike, 8 e 1, Spare (3 e 7), 7 e 2, Strike, 8 e 2, 9.
    - Pontuação: Varia conforme os bônus de strikes e spares.

4. **Jogada Sem Strikes e Spares**
    - Jogadas: 4 e 4 em todos os frames.
    - Pontuação: 80 pontos.

