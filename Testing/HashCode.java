package Testing;
//import java.lang.reflect.Method
import java.lang.reflect.Method;
public class HashCode {
    public static void main(String[] args){
        try {
            Class<?> c = HashCode.class;
            Method[] methods = c.getMethods();
            for (Method method : methods){
                int hashCode = method.hashCode();
                System.out.println("hashCode of method " + method.getName() + "is: " + hashCode);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void getSimpleMethod(){};
}
