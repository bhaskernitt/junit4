package junit.apiFramework;

import junit.apiFramework.entity.HttpMethod;
import java.lang.annotation.*;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Repeatable(TestApis.class)
public @interface TestApi {
    String url();
    HttpMethod httpMethod();

    Headers[] headers() default {};
    String payload() default "";
    String actualResponse() default "";
}
