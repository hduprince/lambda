import java.util.function.Function;
import java.util.function.Supplier;

/**
 *
 * 接收T对象，返回R对象
 * @create: 2020-02-14 14:38
 **/
public class FunctionTest {

    public static void main(String[] args) {

        DemoClass demoClass = new DemoClass();

        Function<String, String> f1 = (s)->s+"--";
        System.out.println(f1.apply("kk"));


        Function<String, String> f2 = (s)->DemoClass.staticStringMethodReturnTwo(s, 12);

        Function<String, String> f3 = (s)->DemoClass.staticStringMethodReturn();

        Function<String, String> f4 = (s)->DemoClass.staticStringMethodReturnOne(s);

        Function<String, String> f41 = DemoClass::staticStringMethodReturnOne;

        //Function<String, String> f5 = (s)->DemoClass.staticStringMethodOne(s);

        System.out.println("-------------");

        Function<DemoClass, String> ff1 = (d)->d.stringMethodReturnOne("12");
        Function<DemoClass, String> ff2 = (d)->d.stringMethodReturnTwo("12", 12);

        Function<DemoClass, String> ff3 = DemoClass::stringMethodReturn;
        Function<DemoClass, String> ff31 = (d)->d.stringMethodReturn();


        Function<String, DemoClass> fff1 = (s)-> new DemoClass(s);
        Function<String, DemoClass> fff11 = DemoClass::new;
        Supplier<DemoClass> s11 = DemoClass::new;
        fff11.apply("LLL");
        s11.get();
        Function<String, DemoClass> fff2 = (s)-> new DemoClass(s, "12");
        Function<String, DemoClass> fff4 = (s)-> new DemoClass(s, 12);



    }
}
