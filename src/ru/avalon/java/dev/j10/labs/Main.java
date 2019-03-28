package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.*;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Triangle();
        shapes[3] = new Rectangle();
        shapes[4] = new Circle();
        shapes[5] = new Rectangle();
        shapes[6] = new Circle();
        shapes[7] = new Triangle();
        shapes[8] = new Triangle();
        shapes[9] = new Rectangle();
    
        /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать переменную 'shapes' массивом
         *    содержащим 10 произвольных фигур. Массив должен
         *    содержать экземпляры классов Circle, Rectangle
         *    и Triangle.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью. Для поиска фигуры необходимо создать
         *    статический метод в текущем классе (Main).
         */
        int shapeNo = 0;
        Shape maxShape = shapes[0];
        float maxArea = shapes[0].getArea();
        for (int x = 0; x < shapes.length; x++){
            if (maxArea < shapes[x].getArea()){
                maxShape = shapes[x];
                maxArea = shapes[x].getArea();
                shapeNo = x;
            }
        }
        System.out.println("Максимальная площадь = " + maxArea + " у фигуры №" 
                + shapeNo);
        }

}
