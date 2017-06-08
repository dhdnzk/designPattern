import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogPrintHandler implements InvocationHandler { // 프록시 클래스 (핸들러)

    private Object target; // 객체에 대한 정보

    LogPrintHandler(Object target) { // 생성자

        this.target = target;

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("This line is written in invoke method in " +
                "LogPrintHandler class before invoking MyCalculator instance");

        int result = (int) method.invoke(target, args); // (3) 주업무를 invoke 함수를 통해 호출

        System.out.println("This line is written in invoke method in " +
                "LogPrintHandler class after invoking MyCalculator instance");

        return result;

    }

}

