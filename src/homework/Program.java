package homework;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {

        Box<Apple> boxApple = new Box<>(new ArrayList<>());
        Box<Apple> boxApple1 = new Box<>(new ArrayList<>());

        Apple apple = new Apple();

        boxApple.addFruit(apple);
        boxApple.addFruit(apple);
        boxApple.addFruit(apple);

        boxApple1.addFruit(apple);
        boxApple1.addFruit(apple);
        boxApple1.addFruit(apple);
        boxApple1.addFruit(apple);

        System.out.println(boxApple);
        System.out.println(boxApple1);

        Box<Orange> boxOrange = new Box<>(new ArrayList<>());

        Orange orange = new Orange();

        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);

        System.out.println(boxOrange);

        System.out.println(boxApple.compare(boxOrange));
        boxApple.moveBox(boxApple1);

        System.out.printf("Получилось:  %s",boxApple1);
    }

}


