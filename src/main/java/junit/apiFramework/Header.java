package junit.apiFramework;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Headers.class)
public @interface Header {
    String hKey();
    String hValue();
}
