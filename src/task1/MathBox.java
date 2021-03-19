package task1;


import task2.ObjetBox;

import java.util.*;

public class MathBox<T extends Number> extends ObjetBox<Number> {


    MathBox(T[] numbersArr) {
        List<T> duplicates = getDublicat(numbersArr);
        if (duplicates.size() > 0) ;
        Collections.addAll(collection, numbersArr);
    }


    public double summator() {
        double sum = 0;
        for (Number n : collection) {
            sum += n.doubleValue();
        }
        return sum;
    }


    public void splitter(T div) {
        try {
            for (int i = 0; i < collection.size(); i++) {
                collection.remove(i);
                collection.add(i/div.doubleValue());
//                collection.set(i, collection.get(i).doubleValue() / div.doubleValue());
            }
        } catch (ArithmeticException ar) {
            System.out.println("ты на что то не то делишь.... давай занова" + ar.getMessage());
        }
    }


    public void input(Integer integer) {
        Iterator<Number> numberIterator = collection.iterator();
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
        if (!super.equals(o)) return false;
        task3.MathBox<?> mathBox = (task3.MathBox<?>) o;
        return Objects.equals(collection, mathBox.collection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), collection);
    }

    private List<T> getDublicat(T[] arr) {
        Set<T> duplicates = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            T a = arr[i];
            if (a == null) continue;
            for (int j = 0; j < arr.length; j++) {
                if (i == j) continue;
                T a1 = arr[j];
                if (a.equals(a1)) {
                    duplicates.add(a1);
                }
            }
        }
        return new ArrayList<>(duplicates);
    }
}