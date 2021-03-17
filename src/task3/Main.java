package task3;


public class Main {


    public static void main(String[] args) {

        Number[] numbers = new Number[]{100, 101, 4l, 127, 102.1F, 103.4D};

        MathBox<Number> mathBox1 = new MathBox(numbers);

        System.out.println(mathBox1);
        System.out.println(mathBox1.summator());
//        System.out.println(mathBox1.splitter());


    }
}




