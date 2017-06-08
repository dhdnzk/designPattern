public class SingletonClassTwo {

    private static SingletonClassTwo singletonClassTwo;

    public static SingletonClassTwo getInstance() {

        if (singletonClassTwo == null) {

            singletonClassTwo = new SingletonClassTwo();

        }

        return singletonClassTwo;

    }

    public void printObjectID() {

        System.out.println(singletonClassTwo.toString());

    }

}
