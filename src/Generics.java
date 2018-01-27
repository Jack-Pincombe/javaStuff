import java.util.function.*;

public class Generics{

    public static void main (String[] args)
    {

        //using the test method of Predicate
        Predicate<String> stringLen = (s) -> s.length() < 10;
        System.out.println(stringLen.test("Apples") + " - Apples is less than 10");

        //Consumer example uses accept method
        Consumer<String> consumerStr = s -> System.out.println(s.toLowerCase());
        consumerStr.accept("abcdegHIjk456LmnoPqRstuvwxyZ");

        //Function Example
        Function<Integer, String> converter = (num) -> Integer.toString(num);
        System.out.println("length of 1002 " + converter.apply(1002).length());

        //Supplier example
        Supplier<String> s = () -> "Java is fun";
        System.out.println(s.get());

        //
        BinaryOperator<Integer> isNow = (a, b) -> a  = b;
        System.out.println("10 is now equal to 20 " + isNow.apply(10 , 20 ));

        UnaryOperator<String> str = (msg) -> msg.toUpperCase();
        System.out.println(str.apply("THis is my message in uppercase!"));

        person jack = new person("Jack", 23, "Male");

        System.out.println(jack.personIs.get());

    }
}
