package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public final class Rectangle implements Polygon {

    private final float a; // первая сторона
    private final float b; // вторая сторона
    private final float x;
    private final float y;
    private final int angle;   // угол поворота


    public Rectangle() {
        a = (float) (100 * Math.random());
        b = (float) (100 * Math.random());
        x = (float) (100 * Math.random());
        y = (float) (100 * Math.random());
        angle = (int) (360 * Math.random());


    }


    @Override
    public float getPerimeter() {

        return 2 * (a + b);
    }

    @Override
    public float getX() {
        return x;
    }

    @Override
    public float getY() {
        return y;
    }

    @Override
    public float getArea() {
        return a * b;
    }

    @Override
    public int getRotation() {
        return angle;
    }

    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */

    @Override
    public String toString() {
        return "Прямоугольник (" +
                " a = " + a +
                ", b = " + b +
                ')';
    }
}
