package ru.job4j.loop;

/**
 * Calculate.
 * @author Alexander Sharikov (alexsander.sharikov@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class Board {
    /**
     * Рисует доску сим. X и " "
     * @param width ширина
     * @param height высота
     * @return Строку в виде доски из символов X и " "
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for(int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++) {
                if((j % 2 == 0) & (i % 2 == 0) | ((j % 2 != 0) & (i % 2 != 0))) {
                    screen.append("x");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}
