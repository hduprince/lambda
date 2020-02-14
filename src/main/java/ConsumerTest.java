import java.util.function.Consumer;

/**
 * 接收T对象，不返回值
 *
 * @create: 2020-02-14 14:38
 **/
public class ConsumerTest {

    public static void main(String[] args) {

        DemoClass demoClass = new DemoClass();

        Consumer<String> c1 = (x)-> System.out.println("1212");
        Consumer<String> c2 = System.out::println;

        c1.accept("12");
        c2.accept("12");

        System.out.println("-----------------------");


        Consumer<String> c3 = (x)-> DemoClass.staticStringMethodOne(x);
        Consumer<String> c4 = (x)-> DemoClass.staticStringMethodTwo(x, 12);
        Consumer<String> c5 = (x)-> DemoClass.staticStringMethodTwo2(x, x);
        Consumer<String> c6 = (x)-> DemoClass.staticStringMethodReturnOne(x);
        Consumer<String> c7 = (x)-> DemoClass.staticStringMethodReturnTwo(x, 12);
        Consumer<String> c8 = (x)-> DemoClass.staticStringMethodReturnTwo2(x, x);



        Consumer<String> c9 = DemoClass::staticStringMethodOne;
        Consumer<String> c10 = DemoClass::staticStringMethodReturnOne;


        c3.accept("12");
        c4.accept("12");
        c5.accept("12");
        c6.accept("12");
        c7.accept("12");
        c8.accept("12");
        c9.accept("12");
        c10.accept("12");

        System.out.println("-----------------------");

        Consumer<String> c11 = demoClass::stringMethodOne;
        Consumer<String> c12 = demoClass::stringMethodReturnOne;
        Consumer<String> c13 = (x)-> demoClass.stringMethodReturnOne(x);


        System.out.println("-----------------------");

        Consumer<DemoClass> cc1 = DemoClass::voidMethod;
        Consumer<DemoClass> cc2 = (x)-> x.stringMethodTwo("12", 12);

        cc1.accept(new DemoClass());
        cc2.accept(new DemoClass());


    }




}
