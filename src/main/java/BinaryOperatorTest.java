import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/**
 * @create: 2020-02-14 14:38
 **/
public class BinaryOperatorTest {


    public static void main(String[] args) {
        BinaryOperator<String> demo = BinaryOperator.maxBy(Comparator.comparingInt(String::length));
        System.out.println(demo.apply("2123121112312", "12123123"));


        BiFunction<Integer, Integer, Integer> mul = (x, y) -> x * y;
        BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
        Function<Integer, Integer> sub = (x) -> x - 10;

        System.out.println(mul.apply(3, 5));
        System.out.println(add.apply(3, 5));

        System.out.println(mul.andThen(sub).andThen(sub).apply(3, 5));

        System.out.println("-------------------");

        Function<String, String> after = (s) -> s + "-after";
        Function<String, String> after1 = (s) -> s + "-after1";
        Function<String, String> after2 = (s) -> s + "-after2";
        Function<String, String> after3 = (s) -> s + "-after3";
        Function<String, String> before = (s) -> "before-" + s;
        Function<String, String> before1 = (s) -> "before1-" + s;
        Function<String, String> before2 = (s) -> "before2-" + s;
        Function<String, String> before3 = (s) -> "before3-" + s;

        Function<String, String> function = (s) -> s;

        System.out.println(function.compose(before).compose(before1).compose(before2).compose(before3).andThen(after).andThen(after1).andThen(after2)
                .andThen(after3).apply("string"));


    }

}
