public class Main {
    public static void main(String[] args) {

        SingletonClass singletonClass1 = SingletonClass.getInstance();

        SingletonClass singletonClass2 = SingletonClass.getInstance();

        SingletonClass singletonClass3 = SingletonClass.getInstance();

        singletonClass1.printObjectID();

        singletonClass2.printObjectID();

        singletonClass3.printObjectID();

        SingletonClassTwo singletonClassTwo1 = SingletonClassTwo.getInstance();

        SingletonClassTwo singletonClassTwo2 = SingletonClassTwo.getInstance();

        SingletonClassTwo singletonClassTwo3 = SingletonClassTwo.getInstance();

        singletonClassTwo1.printObjectID();

        singletonClassTwo2.printObjectID();

        singletonClassTwo3.printObjectID();

        Enumeration enumeration = Enumeration.INSTANCE;

        enumeration.getA();

    }

}
