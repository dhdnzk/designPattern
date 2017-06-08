package Shape.square;

import Shape.Shape;
import Shape.ShapeFactory;

/**
 * Created by Loui on 2017. 6. 8..
 */
public class SquareFactory extends ShapeFactory{

    public static Shape create(String color) {

        Shape square = new Square();

        init(square, color);

        return square;

    }

    public static void init(Shape square ,String color) {

        square.setColor(color);

    }


}
