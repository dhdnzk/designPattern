import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new MyCalculator();

        System.out.println("calculator without proxy");

        System.out.println(calculator.add(1, 2));

        System.out.println();

        Calculator proxyCalculator = (Calculator) Proxy.newProxyInstance(
                calculator.getClass().getClassLoader(),
                calculator.getClass().getInterfaces(),
                new LogPrintHandler(calculator)
        );

        System.out.println("calculator with proxy");

        System.out.println(proxyCalculator.add(1, 2));

    }
}