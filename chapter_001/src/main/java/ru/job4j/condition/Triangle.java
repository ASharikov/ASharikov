package ru.job4j.condition;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    /**
     * Метод вычисления полупериметра по длинам сторон.
     *
     * Формула.
     *
     * (ab + ac + bc)/2
     *
     * @param ab растояние между точками a b
     * @param ac растояние между точками a с
     * @param bc растояние между точками b c
     * @return Перимент.
     */
    public double period(double ab, double ac, double bc) {
        return (ab + ac +bc) /2;
    }

    /**
     * Метод проверяет можно ли построить треугольник с такими длмнами сторон.
     *
     * @param ab длина от точки a b.
     * @param ac длина от точки a c.
     * @param bc длина от точки b c.
     */
    private boolean exist(double ab, double ac, double bc) {
        return ab > 0 & ac > 0 & bc > 0;
    }

    /**
     * Метод должен вичислить площадь треугольника.
     *
     * @return Вернуть площадь, если треугольник существует или -1, если треугольника нет.
     */
    public double area() {
        double rls = -1;
        double ab = this.a.distanceTo(this.b);
        double ac = this.a.distanceTo(this.c);
        double bc = this.b.distanceTo(this.c);
        double p = this.period(ab, ac, bc);

        if(this.exist(ab, ac, bc)) {
            rls = Math.sqrt(p*(p-bc)*(p-ac)*(p-ab));
        }
        return rls;
    }
}
