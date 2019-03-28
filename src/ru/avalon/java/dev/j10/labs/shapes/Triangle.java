package ru.avalon.java.dev.j10.labs.shapes;

public class Triangle implements Point, Polygon, Shape{
    private final float section1, section2, section3, point1, point2, 
            point3; 
    private final int rotation;
    
    public Triangle(){
        section1 = (float) Math.random()*20; //стороны
        section2 = (float) Math.random()*20; 
        section3 = (float) Math.random()*20;
        point1 = (float) Math.random()*20; //точки
        point2 = (float) Math.random()*20;
        point3 = (float) Math.random()*20;
        rotation = (int) Math.random()*360; //ротация
    }
    
    @Override
    public float getX(){
        return point1;
    }
    
    @Override
    public float getY(){
        return point2;
    }
    
    @Override
    public float getPerimeter(){
        return section1 + section2 + section3;
    }
    
    @Override
    public float getArea(){
        float halfPerimeter = (section1+section2+section3)/2;
        float area = (float) Math.sqrt(halfPerimeter*(halfPerimeter-section1)*
                (halfPerimeter-section2)*(halfPerimeter-section3));
        return area;
    }
    
    @Override
    public int getRotation(){
        return rotation;
    }
}
