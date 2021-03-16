import task3.MathBox;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        MathBox mathBox1=new MathBox();

        int hCode;
        hCode=mathBox1.hashCode();
        System.out.println(hCode);
        System.out.println(mathBox1.addNumber());
        System.out.println(mathBox1.summator());
        System.out.println(mathBox1.splitter( 2));
        mathBox1.input(50);

        }
}



