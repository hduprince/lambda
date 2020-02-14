import java.util.function.Supplier;

/**
 * 提供T对象（例如工厂），不接收值
 * @create: 2020-02-14 14:38
 **/
public class SupplierTest {


    public static void main(String[] args) {

        DemoClass demoClass = new DemoClass();

        Supplier<String> s1 = ()->"123";
        Supplier<String> s2 = DemoClass::staticStringMethodReturn;
        Supplier<String> s3 = demoClass::stringMethodReturn;
        Supplier<String> s4 = ()->demoClass.stringMethodReturnOne("123");
        Supplier<String> s5 = ()->demoClass.stringMethodReturnOne2("123", "123");
        Supplier<String> s6 = ()->demoClass.stringMethodReturnTwo("123", 123);
        Supplier<String> s7 = ()->DemoClass.staticStringMethodReturn();
        Supplier<String> s8 = ()->DemoClass.staticStringMethodReturnOne("123");
        Supplier<String> s9 = ()->DemoClass.staticStringMethodReturnTwo2("123", "123");
        Supplier<String> s10 = ()->DemoClass.staticStringMethodReturnTwo("123", 123);


        System.out.println(s1.get());
        System.out.println(s2.get());
        System.out.println(s3.get());
        System.out.println(s4.get());
        System.out.println(s5.get());
        System.out.println(s6.get());
        System.out.println(s7.get());
        System.out.println(s8.get());
        System.out.println(s9.get());
        System.out.println(s10.get());

        System.out.println("----------------------");

        Supplier<DemoClass> sc1 = DemoClass::new;
        Supplier<DemoClass> sc2 = ()->new DemoClass("123");
        Supplier<DemoClass> sc3 = ()->new DemoClass("123", 123);
        Supplier<DemoClass> sc4 = ()->new DemoClass("123", "123");

        System.out.println(sc1.get());
        System.out.println(sc2.get());
        System.out.println(sc3.get());
        System.out.println(sc4.get());

    }

}
