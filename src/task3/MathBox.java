package task3;

import task2.ObjetBox;

import java.util.*;

public class MathBox<T extends Number> extends ObjetBox<Number> {


    MathBox(T[] numbersArr) throws Exception {
        Set<T> duplicates = getDublicat(numbersArr);
        Collections.addAll(super.collection, numbersArr);
    }


    public double summator() {
        double sum = 0;
        for (Number n : super.collection) {
            sum += n.doubleValue();
        }
        return sum;

    }


    public Object splitter(T div) {

        ArrayList<Number> filterNumbers = new ArrayList<>(collection);
        try {
            for (int i = 0; i < filterNumbers.size(); i++) {
                filterNumbers.set(i, filterNumbers.get(i).doubleValue() / div.doubleValue());
            }
        } catch (ArithmeticException ar) {
            System.out.println("ты на что то не то делишь.... давай занова" + ar.getMessage());
        }
        return filterNumbers;
    }


    public Set<Number> input(Integer integer) {
        super.deleteObject(integer);
        return collection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        MathBox<?> mathBox = (MathBox<?>) o;
        return Objects.equals(collection, mathBox.collection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), collection);
    }

    private Set<T> getDublicat(T[] arr) {
        Set<T> duplicates = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            T a = arr[i];
            if (a == null) {
                continue;
            }
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    continue;
                }
                T a1 = arr[j];
                if (a.equals(a1)) {
                    duplicates.add(a1);
                }
            }
        }
        return null;
    }
}