import Shape.Shape;
import Shape.ShapeFactory;
import Shape.circle.CircleFactory;
import Shape.rectangle.RectangleFactory;
import Shape.square.SquareFactory;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Shape> arrayList = new ArrayList<Shape>();

        arrayList.add(RectangleFactory.create("blue"));

        arrayList.add(CircleFactory.create("green"));

        arrayList.add(SquareFactory.create("pink"));

        for (Shape shape: arrayList) {

            shape.draw();

        }

    }

}
