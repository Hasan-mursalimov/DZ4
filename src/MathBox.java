
import java.util.*;

public class MathBox<t> {
    List<Number> numbers = new ArrayList<>();

    public List<Number> mathbox() {
        for (int i = 0; i < 10; i++) {
            numbers.addAll(Collections.singleton(i));
        }
        return numbers;
    }

    public int summer() {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum +=(int) numbers.get(i);
        }
        return sum;
    }

    public List<Number> splitter() {
        int div = 0;
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i,(int) numbers.get(i) / 2);
        }
        return numbers;
    }
    public List<Number> input(){
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        for (Number n:numbers){
            if (a == (int) n){
                numbers.remove(n);
            }
        }

        return numbers;
    }
}
