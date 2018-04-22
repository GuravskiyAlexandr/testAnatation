import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



@Target(value = ElementType.METHOD) // Указаваем что хотим анатировать в дс метод
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Test {
    int a();
    int b();
}

