package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ObjetBox<T extends Object> {
    public List<T> collection = new ArrayList<>();

    public Object addObject(T object) throws Exception {
        return collection.add(object);
    }

    public boolean deleteObject(T object) {
        return collection.remove(object);
    }

    public void dump() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "ObjetBox{" +
                "collection=" + collection +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjetBox<?> objetBox = (ObjetBox<?>) o;
        return Objects.equals(collection, objetBox.collection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(collection);
    }
}

