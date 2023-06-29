package de.yoyosource.advancedcollections;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;

public interface ImmutableCollection<T> extends Iterable<T> {

    int size();

    boolean isEmpty();

    boolean contains(T element);

    Iterator<T> iterator();

    T[] toArray();

    boolean containsAll(Iterable<T> elements);

    boolean equals(Object object);

    int hashCode();

    @Override
    default Spliterator<T> spliterator() {
        return Spliterators.spliterator(iterator(), size(), 0);
    }

    // Custom methods
    default T any() {
        return iterator().next();
    }
}
