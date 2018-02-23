import java.util.*;
import java.util.function.Supplier;

public class person {

    public String name;
    public Integer age;
    public String gender;

    public person(String Name , int Age, String sex)
    {
        name = Name;
        age = Age;
        gender = sex;
    }

    public Supplier personIs = () -> name+ " is " + age + " and is " + gender;
}
