package task3;


import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {


    public static void main(String[] args) {

        Number[] numbers = new Number[]{100, 101, 4l, 127, 102.1F, 103.4D,100, 101};
        int n=numbers.length;
        for (int i=0,m=0;i!=n;i++,n=m){
            for (int j=m=i+1;j!=n;j++){
                if (numbers[j]!=numbers[i]){
                    if (m!=j)numbers[m]=numbers[j];
                    m++;
                }
            }
        }
        if (n!=numbers.length){
            Number [] numbers1=new Number [n];
            for (int i=0;i<n;i++)numbers1[i]=numbers[i];
            numbers=numbers1;
        }
        MathBox<Number> mathBox1 = new MathBox(numbers);

        System.out.println(mathBox1);
        System.out.println(mathBox1.summator());
//        System.out.println(mathBox1.splitter());


    }
}




