package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.*;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];

        for(int i=0; i<10; i++){
        int n = (int) (Math.random()*3);
         
        switch(n){
                case 0:
                shapes[i] = new Circle();
                break;
                case 1:
                shapes[i] = new Rectangle();
                break;                
                default:
                shapes[i] = new Triangle();
        }
        }   
        
        Shape max = null;
        
        for(int j = 0; j < shapes.length; j++){
            System.out.println(shapes[j] + "|Area " + shapes[j].getArea() + " m2|"); 
            if(max != null){          
                if(shapes[j].getArea() > max.getArea()){
                    max = shapes[j];
                }
            }
                else {
                    max = shapes[j];
                }
        }
            
        System.out.println("\n" + "Max area for figure " + max + "is " + max.getArea() + " m2"); 
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
    }
}
