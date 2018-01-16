package ru.job4j.loop;
/**
 * @author Alexander Sharikov (alexsander.sharikov@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class Paint {
    public String piramid(int height) {
        StringBuilder screen = new StringBuilder();
        int weight = 2 * height - 1;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (row >= height - column - 1 && row + height - 1 >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }

    public String rightTrl(int height) {
        //Буфер для результата.
        StringBuilder screen = new StringBuilder();
        //Ширена будет равна высоте.
        int weigth = height;
        //Внешний цикл двигается по строкам.
        for (int row = 0; row != height; row++) {
            //Внутрений цикл определяет положение ячейки в строке.
            for (int column = 0; column != weigth; column++) {
                //Если строка равна ячейки, то ресум галку.
                //В данном случае определяем сколько в строке будет галок.
                if (row >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            //Добавим перенос строки.
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }

    public String leftTrl(int height) {
        StringBuilder screen = new StringBuilder();
        int weight = height;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (row >= weight - column - 1) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}
