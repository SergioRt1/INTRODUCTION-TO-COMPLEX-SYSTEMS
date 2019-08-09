package edu.escuelaing.arem.ASE.app.utils;

public interface List<E> {

    boolean remove(E data);

    E remove(int i);

    boolean add(E data);

    E get(int i);

    boolean isEmpty();

    int size();
}
