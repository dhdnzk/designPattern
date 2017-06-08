package Shape.circle;

import Shape.Shape;

public class CircleFactory {

    public static Shape create() {

        Shape circle = new Circle();

        init();

        return circle;
    }

    private static void init() {

    }

}
