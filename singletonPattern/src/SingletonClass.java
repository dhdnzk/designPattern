public class SingletonClass {

    private static SingletonClass singletonClass = new SingletonClass();

    public static SingletonClass getInstance() {

        return singletonClass;

    }

    public void printObjectID() {

        System.out.println(singletonClass.toString());

    }

}
