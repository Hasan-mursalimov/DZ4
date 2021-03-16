package task2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ObjetBox<T extends Object> {
    List<T>collection=new ArrayList<>();

    public Object addObject(T object) throws Exception {
        return collection.add(object);
    }

    public boolean deleteObject(T objec) {
        return collection.remove(objec);
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

