package edu.escuelaing.arem.ASE.app.utils;

public interface List<E> {

    /**
     * Remove the first apparition of the element.
     * @param data element
     * @return true if the element was deleted else false
     */
    boolean remove(E data);


    /**
     * Remove the element in de given index.
     * @param i index
     * @return the element deleted from the list
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    E remove(int i) throws IndexOutOfBoundsException;

    /**
     * Add an element to the list.
     * @param data
     * @return true if the operation modify the list else false
     */
    boolean add(E data);

    /**
     * Get the element in the given index.
     * @param i index
     * @return The element in the i position
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    E get(int i) throws IndexOutOfBoundsException;

    /**
     * Determinate if a list is empty.
     * @return true if is empty else false
     */
    boolean isEmpty();

    /**
     * The current size of the list
     * @return size
     */
    int size();

}
