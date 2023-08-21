package org.example.points_bowling;

public class Game {

    private int[] rolls = new int[21]; // Ajustado o tamanho do array para 21
    private int currentRoll = 0;

    public void roll(int pins) {
        // Validação da entrada para garantir que o número de pinos seja válido
        if (pins < 0 || pins > 10) {
            throw new IllegalArgumentException("Número inválido de pinos.");
        }

        // Validação para garantir que não excedemos o número de jogadas permitidas
        if (currentRoll >= 21) {
            throw new IllegalStateException("Número máximo de jogadas atingido.");
        }

        rolls[currentRoll++] = pins;
    }

    public int score() {
        int score = 0;
        int frameIndex = 0;
        for (int frame = 0; frame < 10; frame++) {
            if (isSpare(frameIndex)) {
                score += 10 + spareBonus(frameIndex);
                frameIndex += 2;
            } else if (isStrike(frameIndex)) {
                score += 10 + strikeBonus(frameIndex);
                frameIndex = (frame == 9 && isStrike(frameIndex + 1)) ? frameIndex + 3 : frameIndex + 1;
            } else {
                score += twoBallsInFrame(frameIndex);
                frameIndex += 2;
            }
        }
        return score;
    }

    private int twoBallsInFrame(int frameIndex) {
        return rolls[frameIndex] + rolls[frameIndex + 1];
    }

    private int spareBonus(int frameIndex) {
        return rolls[frameIndex + 2];
    }

    private int strikeBonus(int frameIndex) {
        return rolls[frameIndex + 1] + rolls[frameIndex + 2];
    }

    private boolean isStrike(int frameIndex) {
        return rolls[frameIndex] == 10;
    }

    private boolean isSpare(int frameIndex) {
        return twoBallsInFrame(frameIndex) == 10;
    }
}
