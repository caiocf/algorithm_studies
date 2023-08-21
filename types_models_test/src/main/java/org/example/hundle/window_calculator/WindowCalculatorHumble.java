package org.example.hundle.window_calculator;

import java.awt.*;

public class WindowCalculatorHumble {
    private TextField input;
    private Label result;
    private Calculator calc;

    public WindowCalculatorHumble(Calculator calc) {
        this.calc = calc;
    }

    public void buttonPressed() {
        int valor = Integer.parseInt(input.getText());
        int resultCalculator = calc.calculator(valor);
        result.setText(String.valueOf(resultCalculator));
    }
}
