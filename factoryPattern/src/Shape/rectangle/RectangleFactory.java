package Shape.rectangle;

import Shape.Shape;
import Shape.ShapeFactory;

public class RectangleFactory extends ShapeFactory {

    public static Shape create(String color) {

        Shape rectangle = new Rectangle();

        init(rectangle, color);

        return rectangle;
    }

    public static void init(Shape shape, String color) {

        shape.setColor(color);

    }
}
