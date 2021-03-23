package task3;


import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {


    public static void main(String[] args) throws Exception {

        Number[] numbers = new Number[]{100, 101, 4l, 127, 102.1F, 103.4D,100, 101};
        Set<Number>set=new HashSet<Number>(Arrays.asList(numbers));
        MathBox<Number> mathBox1 = new MathBox(set);

        System.out.println(mathBox1);
        System.out.println(mathBox1.summator());
        System.out.println(mathBox1.splitter(2));
        System.out.println(mathBox1.input(50));


    }
}




