import org.junit.Assert;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestUtils {

    public static void testGetter(Object object, String methodName, String fieldName){
        Object fromGetter = null;
        Object fromReflection = null;
        try {
            fromGetter = object.getClass().getDeclaredMethod(methodName).invoke(object);
            Field field = object.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            fromReflection = field.get(object);
        } catch (Exception exc){
            Assert.fail();
            exc.printStackTrace();
        }
        Assert.assertEquals(fromGetter, fromReflection);
    }
}
