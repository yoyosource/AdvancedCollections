package de.yoyosource.advancedcollections;

import java.util.function.Predicate;

public interface MutableCollection<T> extends ImmutableCollection<T> {

    boolean add(T element);

    boolean remove(T element);

    boolean addAll(Iterable<T> elements);

    boolean removeAll(Iterable<T> elements);

    boolean removeIf(Predicate<? super T> predicate);

    boolean retainAll(Iterable<T> elements);

    void clear();
}
