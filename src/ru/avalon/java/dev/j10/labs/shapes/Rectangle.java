package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Shape, Polygon, Point{
    private final float x, y, a, b; //точки и стороны
    private final int rotation;
    
    public Rectangle(){
        x = (float) Math.random()*20; //точки
        y = (float) Math.random()*20;
        a = (float) Math.random()*20; //стороны
        b = (float) Math.random()*20;
        rotation = (int) Math.random()*360;
    }
    
    @Override
    public float getX(){
        return x;
    }
    
    @Override
    public float getY(){
        return y;
    }
    
    @Override
    public float getPerimeter(){
        return a*2 + b*2;
    }
    
    @Override
    public float getArea(){
        return a*b;
    }
    
    @Override
    public int getRotation(){
        return rotation;
    }
    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
