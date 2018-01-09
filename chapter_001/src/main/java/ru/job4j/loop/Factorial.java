package ru.job4j.loop;

/**
 * @author Alexander Sharikov (alexsander.sharikov@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class Factorial {
    /**
     * Вычеляет факториал
     * @param n значение факториала
     * @return факториал
     */
    public int calc(int n) {
        int result = 1;
        for(int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}
