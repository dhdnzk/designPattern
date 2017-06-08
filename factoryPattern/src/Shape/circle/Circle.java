package Shape.circle;

import Shape.Shape;

public class Circle implements Shape {

    private String color = "black";

    @Override
    public void setColor(String color) {

        this.color = color;

    }

    @Override
    public void draw() {

        System.out.println("Draw "+ this.color + " circle!");

    }

}
