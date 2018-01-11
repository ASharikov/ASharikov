package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.number.IsCloseTo.closeTo;

public class TriangleTest {
    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        // создаем три объекта класс Point.
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(2, 0);

        // создаем объетк треугольник и передаем внего объекты точек.
        Triangle triangle = new Triangle(a, b, c);
        // вычисляем площадь.
        double result = triangle.area();
        // Задаем ожидаемый результат.
        double expected = 2D;
        // проверяем результат и ожидаемое значение.
        assertThat(result, closeTo(expected, 0.1));
    }

    @Test
    public void whenPointsOnLineThenNotTriangleArea() {
        // создаем три объекта класс Point.
        Point a = new Point(0, 0);
        Point b = new Point(0, 3);
        Point c = new Point(0, 2);

        // создаем объетк треугольник и передаем внего объекты точек.
        Triangle triangle = new Triangle(a, b, c);
        // вычисляем площадь.
        double result = triangle.area();
        // Задаем ожидаемый результат.
        double expected = -1D;
        // проверяем результат и ожидаемое значение.
        assertThat(result, closeTo(expected, 0.1));
    }
}
