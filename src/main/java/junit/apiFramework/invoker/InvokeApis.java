package junit.apiFramework.invoker;

import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;

public class InvokeApis extends Statement {

    private final Object target;

    private final FrameworkMethod method;

    public InvokeApis(FrameworkMethod method, Object target) {
        this.method = method;
        this.target = target;
    }

    @Override
    public void evaluate() throws Throwable {

        invokeMethod(method);

    }

    /**
     * @since 4.13
     */
    protected void invokeMethod(FrameworkMethod method) throws Throwable {
        method.invokeExplosively(target);
    }
}