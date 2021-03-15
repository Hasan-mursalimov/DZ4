package task2;

import java.util.Collection;

public class ObjetBox {

    public Collection<Object> collection;

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

}

