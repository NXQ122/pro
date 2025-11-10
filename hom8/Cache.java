

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

