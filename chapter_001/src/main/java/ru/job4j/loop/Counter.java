package ru.job4j.loop;

/**
 * @author Alexander Sharikov (alexsander.sharikov@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class Counter {
    /**
     * Складывает заданный диапазон чисел.
     * @param start начало диапазона.
     * @param finish конец диапазона
     * @return сумму четных чисел из диапазона
     */
    public int add(int start, int finish) {
        int result = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                result = result + i;
            }
        }
        return result;
    }
}
