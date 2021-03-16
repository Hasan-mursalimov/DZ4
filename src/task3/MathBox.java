package task3;

import task2.ObjetBox;

import java.util.*;

public class MathBox<T extends Number> extends ObjetBox<Number> {

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    List<Number> numbers = new ArrayList<>();


    public List<Number> addNumber() {
        Integer a = 100;
        Short s = 101;
        Long l = 4l;
        Byte b = 127;
        Float f = 102.1F;
        Double d = 103.4D;

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



    public double summator() {
        double sum = 0;
        for (Number n : numbers) {
            if (!(n instanceof Integer || n instanceof Short || n instanceof Long
                    || n instanceof Byte || n instanceof Float || n instanceof Double)) {
                throw new IllegalArgumentException();
            }
            sum += n.doubleValue();
        }
        return sum;
    }


    public List<Number> splitter(Number div) {
        try {
            for (int i = 0; i < numbers.size(); i++) {
                numbers.set(i, numbers.get(i).doubleValue() / div.doubleValue());
            }
        } catch (ArithmeticException ar) {
            System.out.println("ты на что то не то делишь.... давай занова" + ar.getMessage());
        }
        return numbers;
    }


    public void input(Integer integer) {
        Iterator<Number> numberIterator = numbers.iterator();
        while (numberIterator.hasNext()) {
            Number numberNext = numberIterator.next();
            if (numberNext.equals(integer)) {
                numberIterator.remove();
            }
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MathBox<?> mathBox = (MathBox<?>) o;
        return Objects.equals(random, mathBox.random) &&
                Objects.equals(scanner, mathBox.scanner) &&
                Objects.equals(numbers, mathBox.numbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(random, scanner, numbers);
    }

}