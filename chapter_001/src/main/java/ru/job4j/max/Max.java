package ru.job4j.max;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Alexander Sharikov (alexsander.sharikov@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class Max {
    /**
     * Max.
     * @return Максимальное число.
     */
    public int max(int first, int second) {
        return first > second ? first : second;
    }

    public int max(int first, int second, int thrid) {
        //Вариант 1
        //List<Integer> integerList = Arrays.asList(first, second, thrid);
        //return integerList.stream().max(Integer::compareTo).get();

        //Вариант 2
        //return Math.max(first, Math.max(second, thrid));

        //Вариант 3
        return (Math.abs(2 * thrid - Math.abs(second - first) - second - first) + 2 * thrid + Math.abs(second - first) + second + first) / 4;
    }
}
