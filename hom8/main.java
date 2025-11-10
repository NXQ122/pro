public class main {
    public static void main(String[] args) {
        Cache<String> cache = new Cache<>(3);

        cache.add("A");
        cache.add("B");
        cache.add("C");
        System.out.println("После добавления A, B, C: " + cache);

        cache.add("D"); 
        System.out.println("После добавления D (A удален): " + cache);

        System.out.println("Первый элемент: " + cache.getFirst());
        System.out.println("Последний элемент: " + cache.getLast());
        System.out.println("Элемент с индексом 7: " + cache.getItemByIndex(7));

        System.out.println("Есть ли элемент 'B'? " + cache.exists("B"));
        System.out.println("Удаляем 'B': " + cache.remove("B"));
        System.out.println("После удаления 'B': " + cache);
    }
}