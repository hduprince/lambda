import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * 接收T对象并返回boolean
 * @create: 2020-02-14 14:38
 **/
public class PredicateTest {


    public static void main(String[] args) {
        Predicate<String> k = (s)->s.length()>0;

        Predicate<DemoClass> p = (c)-> c.getBoolean();


        Predicate<DemoClass> p2 = DemoClass::getBoolean;



    }

}
