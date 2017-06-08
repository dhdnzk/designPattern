import Shape.Shape;
import Shape.circle.CircleFactory;
import Shape.rectangle.RectangleFactory;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Shape> arrayList = new ArrayList<Shape>();

        arrayList.add(RectangleFactory.create());

        arrayList.add(CircleFactory.create());

        for (Shape shape: arrayList) {

            shape.setColor("blue");

        }

        for (Shape shape: arrayList) {

            shape.draw();

        }

    }

}
