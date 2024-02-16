package seminar.list.core;

public interface GBLinkedList<T> extends GBList<T> {
    void addFirst(T elem);
    void addLast(T elem);
}