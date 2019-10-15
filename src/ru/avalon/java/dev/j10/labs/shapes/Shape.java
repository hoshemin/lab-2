package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Абстрактное представление о геометрической фигуре.
 * <p>
 * Фигура (от лат. figura) — термин, формально применимый к
 * произвольному множеству точек; тем не менее обычно
 * фигурой называют замкнутые множества на плоскости,
 * которые ограничены конечным числом линий. При этом
 * допускаются вырождения, например: угол, луч и точка
 * считаются геометрическими фигурами.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A4%D0%B8%D0%B3%D1%83%D1%80%D0%B0_(%D0%B3%D0%B5%D0%BE%D0%BC%D0%B5%D1%82%D1%80%D0%B8%D1%8F)">Фигура (геометрия)</a>
 */
public interface Shape {

    /*
     * TODO: Закончить определение интерфейса 'Shape'
     *
     * 1. Включите интерфейс в общую систему типов.
     *
     * 2. При необходимости, дополните структуру интерфеса.
     */

    /**
     * Возвращает площадь фигуры.
     * <p>
     * Площадь плоской фигуры — аддитивная числовая
     * характеристика фигуры, целиком принадлежащей одной
     * плоскости. В простейшем случае, когда фигуру можно
     * разбить на конечное множество единичных квадратов,
     * площадь равна числу квадратов.
     *
     * @return площадь фигуры.
     *
     * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D0%BB%D0%BE%D1%89%D0%B0%D0%B4%D1%8C_%D1%84%D0%B8%D0%B3%D1%83%D1%80%D1%8B">Площадь фигуры</a>
     */
    float getArea();

    /**
     * Возвращает угол поворота фигуры.
     * <p>
     * Угол поворота изменяется в диапазоне от 0 до 360
     * градусов.
     * <p>
     * Если фигура не поддерживает вращение, метод всегда
     * возвращает значение {@code 0}.
     *
     * @return угол поворота фигуры.
     */
    int getRotation();

    /*
     * TODO: изменить определение метотода 'getRotation()'
     * Измените определение метода таким образом, чтобы
     * классам, не поддерживающим вращение, не требовалось
     * переопределять данный метод.
     */
}
