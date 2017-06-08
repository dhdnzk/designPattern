package Shape.rectangle;

import Shape.Shape;

public class RectangleFactory {

    public static Shape create() {

        Shape rectangle = new Rectangle();

        init();

        return rectangle;
    }

    private static void init() {

    }

}
