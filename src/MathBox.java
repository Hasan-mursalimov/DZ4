
import java.util.*;

public class MathBox {
    List<Integer> numbers = new ArrayList<>();

    public List<Integer> mathbox() {
        for (int i = 0; i < 10; i++) {
            numbers.addAll(Collections.singleton(i));
        }
        return numbers;
    }

    public int summer() {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        return sum;
    }

    public List<Integer> splitter() {
        int div = 0;
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i) / 2);
        }
        return numbers;
    }
    public List<Integer> input(){
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
