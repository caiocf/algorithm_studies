package org.example.hundle.window_calculator;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.ReflectionUtils;

import java.awt.*;
import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

class WindowCalculatorHumbleTest {

    @Test
    public void buttonPressedSuccess() throws Exception {
        Calculator calculator = mock(Calculator.class);
        when(calculator.calculator(anyInt())).thenReturn(10);

        WindowCalculatorHumble windowCalculatorHumble  = new WindowCalculatorHumble(calculator);
        Field inputField = WindowCalculatorHumble.class.getDeclaredField("input");
        Field resulField = WindowCalculatorHumble.class.getDeclaredField("result");

        inputField.setAccessible(true);
        resulField.setAccessible(true);

        inputField.set(windowCalculatorHumble, new TextField("5"));
        resulField.set(windowCalculatorHumble, new Label());

        windowCalculatorHumble.buttonPressed();

        assertEquals("10", ((Label) resulField.get(windowCalculatorHumble)).getText());
        verify(calculator, times(1)).calculator(5);

    }

}
