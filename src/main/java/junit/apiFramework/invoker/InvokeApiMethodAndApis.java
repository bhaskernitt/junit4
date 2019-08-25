package junit.apiFramework.invoker;

import org.junit.internal.runners.statements.InvokeMethod;
import org.junit.runners.model.FrameworkMethod;

public class InvokeApiMethodAndApis extends InvokeMethod {

    private final FrameworkMethod testMethod;
    private final Object target;

    public InvokeApiMethodAndApis(FrameworkMethod testMethod, Object target) {
        super(testMethod, target);
        this.testMethod = testMethod;
        this.target = target;
    }

    @Override
    public void evaluate() throws Throwable {

        System.out.println("");
        testMethod.invokeExplosively(target);
    }

    public  void invokeApis(){

    }
}
