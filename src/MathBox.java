
import java.util.*;

public class MathBox<t> {
    List<Number> numbers = new ArrayList<>();

    public List<Number> mathbox() {
        for (int i = 0; i < 10; i++) {
            numbers.addAll(Collections.singleton((float)i));
        }
        return numbers;
    }

    public float summer() {
        float sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum +=(float) numbers.get(i);
        }
        return sum;
    }

    public List<Number> splitter() {
        int div = 0;
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i,(float) numbers.get(i) / 2);
        }
        return numbers;
    }
    public List<Number> input(){
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        for (Number n:numbers){
            if (a == (float) n){
                numbers.remove(n);
            }
        }

        return numbers;
    }
}
