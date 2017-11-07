package Exercise;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class p01_ListyIteratorImpl<T> implements Iterable<T>, p01_ListyIterator<T>{
    private List<T> data;

    public p01_ListyIteratorImpl(T... items) {
        this.data = Arrays.asList(items);
    }

    @Override
    public boolean move() {
        if (this.iterator().hasNext()) {
            this.iterator().next();
            return true;
        }
        return false;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public void print() {
    }

    @Override
    public Iterator<T> iterator() {
        return new ListyIteratorInner();
    }

    @Override
    public void forEach(Consumer< ? super T> action) {

    }


    private final class ListyIteratorInner implements Iterator<T> {

        private int index;

        public ListyIteratorInner() {
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            return this.index < data.size() - 1;
        }

        @Override
        public T next() {
            return data.get(this.index++);
        }

    }
}



