//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class MyList {
    private int[] arr;
    private int size;
    private int capacity;

    {
        capacity = 10;
        size = 0;
        arr = new int[capacity];
    }

    public void add(int value) {
        if (size >= capacity) {
            Yvelecin();
        }
        arr[size] = value;
        size++;
    }

    public void Yvelecin() {
        capacity = capacity * 2;
        int[] tmp = new int[capacity];
        for (int i = 0; i < size; i++) {
            tmp[i] = arr[i];
        }
        arr = tmp;
    }

    public void PrintInfo() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //public void removeByValue(int value)
    public void removeByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                System.out.print("Index = " + i);
                break;
            }else if (i == size-1){
                System.out.println("-1");
            }
        }
    }

    //public void removeByIndex(int index)
    public void removeByIndex(int index) {
        if (index >= 0 && index < size) {
            for (int i = 0; i < size; i++) {
                if (i == index) {
                    System.out.print(arr[i]);
                }
            }
        } else {
            System.out.println("Данного индекса нет");
        }
    }

    //public boolean isHasValue(int value)
    public boolean isHasValue(int value) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }
}




public class Main {
    public static <T> void zd(T element) {
        System.out.println("\nZD " + element);
    }

    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add(1);
        myList.add(3);
        myList.add(2);
        myList.add(8);
        myList.PrintInfo();

        zd(1);
        myList.removeByValue(8);

        zd(2);
        myList.removeByIndex(3);

        zd(3);
        System.out.println(myList.isHasValue(7));

    }
}