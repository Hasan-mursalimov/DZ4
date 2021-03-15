package task3;

import task2.ObjetBox;

import java.util.*;

public class MathBox<T extends Number> extends ObjetBox {

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    List<Number> numbers = new ArrayList<>();

    public List<Number> mathbox(T [] numberArray) {
        Integer a=100;
        Short s=101;
        Long l=4l;
        Byte b=127;
        Float f=102.1F;
        Double d=103.4D;

        numbers.add(d);
        numbers.add(f);
        numbers.add(b);
        numbers.add(l);
        numbers.add(a);
        numbers.add(s);
        HashSet hs = new HashSet();
        hs.addAll(numbers);
        numbers.clear();
        numbers.addAll(hs);

        return numbers;
    }

    public double summer() {
        double sum=0;
        for (Number n:numbers) {
            if (!(n instanceof Integer|| n instanceof Short|| n instanceof Long
                    ||n instanceof Byte|| n instanceof Float|| n instanceof Double)){
                throw new IllegalArgumentException();
                }
            sum+=n.longValue();
        }
        return sum;
    }

    public List<Number> splitter(T div) {
//        div=scanner.nextInt();
        try {
            for (int i=0;i<numbers.size();i++) {
                numbers.set(i,numbers.get(i).doubleValue() / div.doubleValue());
            }
        } catch (ArithmeticException ar) {
            System.out.println("ты на что то не то делишь.... давай занова" + ar.getMessage());
        }
        return numbers;
    }


    public List<Number> input(Double a) {

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