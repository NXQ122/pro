

import java.util.LinkedList;

public class Cache<T> {
    private final int capacity;
    private final LinkedList<T> list;

    public Cache(int capacity) {
        this.capacity = capacity;
        this.list = new LinkedList<>();
    }

    public void add(T item) {
        if (list.size() == capacity) {
            list.removeFirst(); // удаляем самый старый
        }
        list.addLast(item); // добавляем новый
    }

    public boolean remove(T item) {
        return list.remove(item);
    }

    public boolean exists(T item) {
        return list.contains(item);
    }

    public T getFirst() {
        return list.isEmpty() ? null : list.getFirst();
    }

    public T getLast() {
        return list.isEmpty() ? null : list.getLast();
    }

    
