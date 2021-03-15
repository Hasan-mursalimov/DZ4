import task3.MathBox;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    private static Object Number;

    public static void main(String[] args) {

        MathBox mathBox1=new MathBox(null);
        int hCode;
        hCode=mathBox1.hashCode();
        System.out.println(hCode);
        System.out.println(mathBox1.mathbox());
        System.out.println(mathBox1.summer());
        System.out.println(mathBox1.splitter(2));
       System.out.println(mathBox1.input());

        }
}



