
import java.util.*;

public class MathBox<T extends Number> extends ObjetBox {

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    List<Number> numbers = new ArrayList<>();


    public MathBox() {
    }

    public List<Number> mathbox() {
        for (int i = 0; i < 10; i++) {
            int a = (int) (Math.random() * 10 - 5);
            numbers.add(a);
        }
        HashSet hs = new HashSet();
        hs.addAll(numbers);
        numbers.clear();
        numbers.addAll(hs);

        return numbers;
    }

    public double summer() {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += (int) numbers.get(i);
        }
        return sum;
    }

    public List<Number> splitter(int div) {
//        div=scanner.nextInt();
        try {
            for (int i = 0; i < numbers.size(); i++) {
                numbers.set(i, (int) numbers.get(i) / div);
            }
        } catch (ArithmeticException ar) {
            System.out.println("ты на что то не то делишь.... давай занова" + ar.getMessage());
        }
        return numbers;
    }


    public List<Number> input() {
        int a = scanner.nextInt();
        Iterator<Number> numberIterator = numbers.iterator();
        while (numberIterator.hasNext()) {
            Number numberNext = numberIterator.next();
            if (numberNext.equals(a)) {
                numberIterator.remove();
            }
        }
        return numbers;
    }

    @Override
    public Object addObject(Object o) throws Exception {
        if (!(o instanceof Number)) {
            if (!(o instanceof Number)) {
                throw new Exception("Wrong type!");
            } else {
                return super.addObject(o);
            }
        }
        return collection;
    }
}