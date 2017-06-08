package Shape.circle;

import Shape.Shape;
import Shape.ShapeFactory;

public class CircleFactory extends ShapeFactory {

    public static Shape create(String color) {

        Shape circle = new Circle();

        init(circle, color);

        return circle;

    }

    public static void init(Shape shape, String color) {

        shape.setColor(color);

    }

}
