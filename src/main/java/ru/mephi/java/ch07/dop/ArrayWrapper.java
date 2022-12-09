package ru.mephi.java.ch07.dop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class ArrayWrapper <T>{
    private ArrayList<T> list;
    private ArrayList<T> parentList; //list for computation
    private Set<Predicate<T>> filters;
    private boolean isComputed;

    private ArrayWrapper(ArrayWrapper<T> parent, Predicate<T> filter) {
        this.list = null;
        this.isComputed = false;
        this.parentList = parent.list == null ? parent.parentList : parent.list;

        this.filters = parent.filters == null ? new HashSet<>() : new HashSet<>(parent.filters);
        filters.add(filter);
    }

    public ArrayWrapper(ArrayList<T> list) {
        this.list = new ArrayList<>(list);
        this.parentList = null;
        this.filters = null;
        this.isComputed = true; //don't need to compute
    }

    // return new object with lazy list init
    public ArrayWrapper<T> where(Predicate<T> filter) {
        return new ArrayWrapper<>(this, filter);
    }


    @Override
    public String toString(){
        if (!isComputed){
            // only for demonstration
            System.out.println("Computed!");
            compute();
        }

        return list.toString();
    }

    // construct the list of wrapper
    private void compute(){
        list = new ArrayList<>(parentList);
        for (Predicate<T> filter: filters) {
            list.removeIf((x) -> !filter.test(x));
        }

        parentList = null;
        filters = null;
        isComputed = true;
    }

}
