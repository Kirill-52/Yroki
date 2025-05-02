import java.util.ArrayList;
import java.util.Collection;
import java.util.NavigableSet;

class MySet<E> {
    // Динамический массив для хранения элементов
    private ArrayList<E> elements;

    // Конструктор
    public MySet() {
        elements = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "MySet" + elements;
    }

    // 1. Добавляет элемент в множество, если его еще нет
    public boolean add(E e) {
        if (elements.contains(e)) {
            return false;
        }
        return elements.add(e);
    }

    // 2. Удаляет элемент из множества
    public boolean remove(Object o) {
        if (elements.contains(o)) {
            return elements.remove(o);
        }
        return false;
    }

    // 3. Проверяет, содержит ли множество указанный элемент
    public boolean contains(Object o) {
        if (elements.contains(o)) {
            return true;
        }
        return false;
    }

    // 4. Возвращает количество элементов в множестве
    public int size() {
        if (elements.isEmpty()) {
            return 0;
        }
        return elements.size();
    }

    // 5. Проверяет, пусто ли множество
    public boolean isEmpty() {
        if (size() > 0) {
            return false;
        }
        return true;
    }

    // 6. Удаляет все элементы из множества
    public void clear() {
        elements.clear();
    }

    // 7. Добавляет все элементы из указанной коллекции в множество
    public boolean addAll(Collection<? extends E> c) {
        if (c.isEmpty() == false) {
            return elements.addAll(c);
        }
        return false;
    }

    //
    // 8. Проверяет, содержит ли множество все элементы из указанной коллекции
    public boolean containsAll(Collection<?> c) {
        Object[] arr = c.toArray();
        int i = 0;
        while (contains(arr[i])) {
            i++;
            if (i == c.size()) {
                return true;
            }
        }
        return false;
    }

    //
    // 9. Удаляет из множества все элементы, которые есть в указанной коллекции
    public boolean removeAll(Collection<?> c) {
        Object[] arr = c.toArray();
        int i = 0;
        while (contains(arr[i])) {
            remove(arr[i]);
            i++;
            if (i == c.size()) {
                return true;
            }
        }
        return false;
    }

    //
    // 10. Сохраняет только те элементы, которые есть в указанной коллекции
    public boolean retainAll(Collection<?> c) {
        boolean prov = false;
            MySet mySet2 = new MySet();
            Object[] arr = c.toArray();
            for (int i = 0; i < c.size(); i++) {
                if (elements.contains(arr[i])){
                    mySet2.add(arr[i]);
                    prov = true;
                }
            }
            if (prov){
                elements = mySet2.elements;
                return true;
            }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        MySet mySet = new MySet();
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(7);
        mySet.add("Srrr");
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(9);
//        mySet.remove(1);
//        System.out.println(mySet.contains(2));
//        System.out.println(mySet.size());
//        System.out.println(mySet.isEmpty());
//        mySet.addAll(arrayList);
//        System.out.println(mySet.containsAll(arrayList));
//        mySet.removeAll(arrayList);
        System.out.println(mySet.retainAll(arrayList));
        System.out.println(mySet.toString());
    }
}