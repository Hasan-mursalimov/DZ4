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
//        ObjetBox objetBox=new ObjetBox();
        System.out.println(mathBox1.mathbox());
        System.out.println(mathBox1.summer());
        System.out.println(mathBox1.splitter(0));
       System.out.println(mathBox1.input());
//        System.out.println(objetBox.getObjects());
//        System.out.println(objetBox.deleteObject());
//        System.out.println(objetBox.dump());
        }
}



