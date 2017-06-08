package Shape.square;

import Shape.Shape;

/**
 * Created by Loui on 2017. 6. 8..
 */
public class Square implements Shape{

    String color;

    @Override
    public void setColor(String color) {

        this.color = color;

    }

    @Override
    public void draw() {

        System.out.println("Draw " + this.color + " square!");

    }

}
