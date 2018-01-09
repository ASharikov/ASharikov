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

        List<Integer> integerList = Arrays.asList(first, second, thrid);

        return integerList.stream().max(Integer::compareTo).get();
    }
}
