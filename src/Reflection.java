import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {


    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        Class<?> fClass = FirstTask.class;
        if (fClass.isAnnotationPresent(TestClass.class)){
            System.out.println("Class Annotation");
        }
        TestClass testClass = fClass.getAnnotation(TestClass.class);
        System.out.println( "class annotation parameter = " +  testClass.param());

        Field[] fields = fClass.getDeclaredFields(); // // получить все поля
        for ( Field f : fields) {
            Class<?> fieldType = f.getType();
            System.out.println( f.getName()+" = " + fieldType.getTypeName());
        }
        try {
            Class<?>[] obj = new Class<?>[]{int.class, int.class}; //указуем два параметра которые мы имеем в классе
            Method method = fClass.getMethod("test", obj );
            Test test = method.getAnnotation(Test.class);
            FirstTask firstTask = new FirstTask();

            if (method.isAnnotationPresent(Test.class))
            method.invoke(firstTask, test.a(), test.b() );
            System.out.println(test.a());

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
