import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Main {

    /**
     * @author Solodovnykov M.S.
     * @version 1.0
     */

    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException {

        //exercise1
        EdString newString = new EdString("content");

        Class<EdString> newClaas = EdString.class;
        Field field = newClaas.getDeclaredField("str");

        field.setAccessible(true);

        System.out.println(field.get(newString));
        System.out.println("");
        field.set(newString, "New string");
        System.out.println(field.get(newString));

        field.setAccessible(false);

        //exercise2

        Class<Math> newMath = Math.class;
        Constructor<Math> construe = newMath.getDeclaredConstructor();

        construe.setAccessible(true);

        Math m = construe.newInstance();
        int i = (int) m.pow(1,2);
        System.out.println(i);

        }
}
