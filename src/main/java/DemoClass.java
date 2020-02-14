/**
 * @create: 2020-02-13 20:07
 **/
public class DemoClass {


    //-------------------------------构造方法

    public DemoClass(){
        System.out.println("无参构造方法");
    }

    public DemoClass(String string){
        System.out.println("1个参数构造方法: "+ string);
    }

    public DemoClass(String string, Integer integer){
        System.out.println("两个参数构造方法 string: " + string + " integer :" + integer);
    }


    public DemoClass(String string, String string2){
        System.out.println("两个参数构造方法 string: " + string + " string2 :" + string2);
    }

    //--------------------------------- 静态无返回值方法

    public static void staticVoidMethod(){
        System.out.println("staticVoidMethod");
    }

    public static void staticStringMethodOne(String string){
        System.out.println("staticStringMethodOne:" + string);
    }

    public static void staticStringMethodTwo(String string, Integer i){
        System.out.println("staticStringMethodTwo string" + string + " int : " + i);
    }

    public static void staticStringMethodTwo2(String string, String string2){
        System.out.println("staticStringMethodTwo string" + string + " string2 : " + string2);
    }

    //---------------------------------  普通无返回值方法

    public void voidMethod(){
        System.out.println("voidMethod");
    }

    public void stringMethodOne(String string){
        System.out.println("stringMethodOne:" + string);
    }

    public void stringMethodTwo(String string, Integer i){
        System.out.println("stringMethodTwo string" + string + " int : " + i);
    }

    public void stringMethodTwo2(String string, String string2){
        System.out.println("stringMethodTwo2 string" + string + " string2 : " + string2);
    }


    //---------------------------------  静态有返回值方法


    public static String staticStringMethodReturn(){
        System.out.println("staticStringMethodReturn");
        return "staticStringMethodReturn return";
    }


    public static String staticStringMethodReturnOne(String string){
        System.out.println("staticStringMethodReturnOne:" + string);
        return "staticStringMethodReturnOne return";
    }

    public static String staticStringMethodReturnTwo(String string, Integer integer){
        System.out.println("staticStringMethodReturnOne string" + string + " int:" + integer );
        return "staticStringMethodReturnTwo return";
    }


    public static String staticStringMethodReturnTwo2(String string, String string2){
        System.out.println("staticStringMethodReturnOne2 string" + string + " string2 : " + string2);
        return "staticStringMethodReturnOne2 return";
    }


    //---------------------------------  普通有返回值方法

    public String stringMethodReturn(){
        System.out.println("stringMethodReturn");
        return "stringMethodReturn return";
    }


    public String stringMethodReturnOne(String string){
        System.out.println("stringMethodReturnOne:" + string);
        return "stringMethodReturnOne return";
    }

    public String stringMethodReturnTwo(String string, Integer integer){
        System.out.println("stringMethodReturnTwo string" + string + " int:" + integer );
        return "stringMethodReturnTwo return";
    }


    public String stringMethodReturnOne2(String string, String string2){
        System.out.println("stringMethodReturnOne2 string" + string + " string2 : " + string2);
        return "stringMethodReturnOne2 return";
    }


    public boolean getBoolean(){
        return false;
    }

    @Override
    public String toString() {
        return "DemoClass{}";
    }
}
