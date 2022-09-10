package ru.mephi.java.ch03.dop.Iterator;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MyIterator<E> implements Iterator<E>{

    private final List<E> filteredCollection;
    private Iterator<E> iterator;   // Ссылка на Iterator
    private E cursor;

    public MyIterator(){
        filteredCollection= new ArrayList<>();
        iterator= null;
    }

    public MyIterator(Iterator<E> iterator) {
        this();
        this.iterator = iterator;
    }

    @Override
    public E next() {
        if(iterator!=null) {
            if(!filteredCollection.isEmpty())
                return cursor = filteredCollection.remove(0);
            return cursor = this.iterator.next();
        }
        return null;
    }
    @Override
    public boolean hasNext() {
        if(iterator!=null) {
            if(!filteredCollection.isEmpty())
                return true;
            return this.iterator.hasNext();
        }
        return false;
    }

    public MyIterator<E> fromIterator(Iterator<E> iterator) {
        return new MyIterator<>(iterator);
    }

    public MyIterator<E> filter(Predicate<E> predict) {
        if(iterator==null)
            return null;
        while (this.iterator.hasNext()){
            cursor = this.iterator.next();
            if(predict.test(cursor))
                filteredCollection.add(cursor);
        }
        return this;
    }

    public void forEach(Consumer<E> consumer) {
        if(iterator != null){
            if(!filteredCollection.isEmpty()){
                filteredCollection.forEach(consumer);
            }
            else
                this.iterator.forEachRemaining(consumer);
        }
    }

    public <K> Map<K, E> collectToMap(Function<E, K> keyExtracter) throws NoSuchElementException {
        Map<K, E> mapResult = new HashMap<>();
        while (this.hasNext()) {
            E element = this.next();
            mapResult.put(keyExtracter.apply(element), element);
        }
        return mapResult;
    }

    public MyIterator<E> union(MyIterator<E> iteratorToUnion) {
        List<E> unitedElements = new ArrayList<>();

        while (this.hasNext()) {
            unitedElements.add(this.next());
        }
        while (iteratorToUnion.hasNext()) {
            unitedElements.add(iteratorToUnion.next());
        }

        return new MyIterator<>(unitedElements.iterator());
    }

    public <U> MyIterator<U> map(Function<E, U> mapFunc) {
        List<U> elementsFromMapping = new ArrayList<>();
        while (this.hasNext()) {
            elementsFromMapping.add(mapFunc.apply(this.next()));
        }
        return new MyIterator<>(elementsFromMapping.iterator());
    }
}
