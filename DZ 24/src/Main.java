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
        if (size >= capacity) {
            capacity = capacity * 2;
            int[] tmp = new int[capacity];
            for (int i = 0; i < size; i++) {
                tmp[i] = arr[i];
            }
            arr = tmp;
        }
    }

    public void PrintInfo() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void addStart(int value) {
        size++;
        Yvelecin();
        int[] str = new int[capacity];
        for (int i = 0; i < size; i++) {
            str[i + 1] = arr[i];
        }
        str[0] = value;
        arr = str;
    }

    public void addFerst(int value) {
        size++;
        Yvelecin();
        int[] str = new int[capacity];
        for (int i = 0; i < size; i++) {
            str[i] = arr[i];
        }
        str[size - 1] = value;
        arr = str;
    }

    public void addByIndex(int index, int value) {
        if (index <= 0) {
            addStart(value);
        } else if (index >= size) {
            add(value);
        } else {
            Yvelecin();
            size++;
            for (int i = size; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = value;
        }
    }

    public void addAll(int index, MyList myList) {
        if (myList == null || myList.size == 0) {
            return;
        }
        if (index < 0) {
            index = 0;
        }
        for (int i = 0; i < myList.size; i++) {
            addByIndex(index + i, myList.arr[i]);
        }
    }

    public int capacity() {
        return capacity;
    }

    //-----------------------------------------------------------------------------------//
    // -   public void clear()
    public void clear() {
        size = 0;
        decreaseArr();
    }

    //   -   public boolean isHasValue(int value)
    public boolean isHasValue(int value) {
        for (int i = 0; i < size; i++) {
            if (value == arr[i]){
                return true;
            }
        }
        return false;
    }

    //   -   public int indexOf(int value)
    public int indexOf(int value){
        for (int i = 0; i < size; i++) {
            if (arr[i] == value){
                return i;
            }
        }
        return -1;
    }
    //-----------------------------------------------------------------------------------//
//   -   public void removeByIndex(int index)
    public void removeByIndex(int index){
        if (index < 0 || index > size){
            System.out.println("Данного индекса нет");
        }
        int [] tmp = new int[capacity];
        for (int i = 0; i < size; i++) {
            tmp[i] = arr[i];
            if (i >= index){
                tmp[i] = arr[i+1];
            }
        }
        arr = tmp;
        size--;
        decreaseArr();
    }
//   -   public void removeByValue(int value)
    public void removeByValue(int value){
        boolean nahod = true;
        int [] tmp = new int[capacity];
        for (int i = 0, j = 0; i < size; i++,j++) {
            if (arr[i] == value){
                j++;
            }
            tmp[i] = arr[j];
            if (i == size-1 && i == j) {
                nahod = false;
                System.out.println("Данного value нет");
                break;
            }
        }
        if (nahod){
            size--;
        }
        arr = tmp;
        decreaseArr();
    }
//   -   public void addAll(Integer[] arr)
    public void addAll(MyList myList){
        if (myList == null || myList.size == 0) {
            return;
        }
        for (int i = 0; i < myList.size; i++) {
            add(myList.arr[i]);
        }
    }
    //-----------------------------------------------------------------------------------//
//   -   public void removeAllDuplikat()
    public void removeAllDuplikat(){
        boolean prov = false;
        for (int i = 0; i < size; i++) {
            prov = false;
            for (int j = 0; j < size; j++) {
                if (arr[i] == arr[j]){
                    if(prov){
                        removeByIndex(j);
                    }
                    prov = true;
                }
            }
        }
    }
//   -   public void decreaseArr()
    public void decreaseArr() {
        if (size <= (capacity / 2) && capacity > 10) {
            capacity = capacity / 2;
            decreaseArr();
        }
    }
    //-----------------------------------------------------------------------------------//
}

//    //public void removeByValue(int value)
//
//    //public void removeByIndex(int index)
//    public void removeByIndex(int index) {
//        if (index >= 0 && index < size) {
//            for (int i = 0; i < size; i++) {
//                if (i == index) {
//                    System.out.print(arr[i]);
//                }
//            }
//        } else {
//            System.out.println("Данного индекса нет");
//        }
//    }
//
//    //public boolean isHasValue(int value)
//    public boolean isHasValue(int value) {
//        for (int i = 0; i < size; i++) {
//            if (arr[i] == value) {
//                return true;
//            }
//        }
//        return false;
//    }
//}


public class Main {
    public static <T> void zd(T element) {
        System.out.println("\nZD " + element);
    }

    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.add(7);
        myList.add(8);
        myList.add(9);

        MyList myList2 = new MyList();
        myList2.add(10);
        myList2.add(1);
        myList2.add(12);
        myList2.add(1);
        myList2.add(14);
        myList.addAll(myList2);
        myList.removeAllDuplikat();
//        myList.clear();
//        myList.removeByIndex(1);
//        myList.removeByValue(101);
        myList.PrintInfo();
//        System.out.println("\n");
//        System.out.println(myList.isHasValue(9));
//        System.out.println(myList.indexOf(12));
        System.out.println("\ncapacity = " + myList.capacity());
    }
}