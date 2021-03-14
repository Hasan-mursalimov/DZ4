import java.util.*;

public class ObjetBox {

    Collection<Object> collection;

    public ObjetBox(Collection<Object> collection) {
        this.collection = collection;
    }

    public ObjetBox() {
    }

    public Object addObject(Object o) throws Exception {
        return collection.add(o);
    }

    public boolean deleteObject(Object o) {
        return collection.remove(o);
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
        ObjetBox objetBox = (ObjetBox) o;
        return Objects.equals(collection, objetBox.collection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(collection);
    }
}

