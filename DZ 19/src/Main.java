import java.lang.reflect.Array;
import java.util.ArrayList;

class Triple <T1, T2, T3>{
    T1 value1;
    T2 value2;
    T3 value3;

    public T1 getValue1() {
        return value1;
    }

    public void setValue1(Integer value1) {
        this.value1 = (T1) value1;
    }

    public T2 getValue2() {
        return value2;
    }

    public void setValue2(Character value2) {
        this.value2 = (T2) value2;
    }

    public T3 getValue3() {
        return value3;
    }

    public void setValue3(String value3) {
        this.value3 = (T3) value3;
    }
}
class Pair<T1, T2> {

    T1 valu1;

    T2 valu2;

    public T1 getFirst() {
        return valu1;
    }

    public void setFirst(T1 valu1) {
        this.valu1 = valu1;
    }

    public T2 getSecond() {
        return valu2;
    }

    public void setSecond(T2 valu2) {
        this.valu2 = valu2;
    }


}

public class Main {

    private static <q> void zd(q element) {
        System.out.println("\nZADANIE => " + element);
    }

    private static <Q> Q printElement(Q element) {
        return element;
    }

    private static <W> void getFirstElement(W[] element) {
        System.out.println(element[0]);
    }


    private static <T> boolean isEqual(T element1, T element2) {
        if (element1 == element2) {
            return true;
        }
        return false;
    }

    private static <T> T[] reversedArray(T[] arr) {
        T [] reverseArray = (T[]) new Object[arr.length];
        for (int i = reverseArray.length-1, y = 0; i > -1; i--,y++) {
            reverseArray[i] = arr[y];
        }
        for (int i = 0; i < reverseArray.length; i++) {
            System.out.print(reverseArray[i]);
        }
        System.out.println();
        return reverseArray;
    }

    private static <Y> void compareElements(Y element11, Y element22) {
        if (element11 == element22){
            System.out.println("Элементы равны");
        }else {
            System.out.println("Элементы не равны");
        }
    }

    private static <U> void findIndex (U [] arr , U elemnt){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elemnt){
                System.out.println(i);
                break;
            }else if (i == arr.length-1){
                System.out.println("-1");
            }
        }
    }

    public static  <T> T[] copyArray (T [] arr){
        T[] Coppu = (T[]) new Object[arr.length];
        for (int i = 0; i < Coppu.length; i++) {
            Coppu[i] = arr[i];
            System.out.print(Coppu[i]);
        }
        return Coppu;
    }


    public static void main(String[] args) {

        zd(1);
        System.out.println(printElement("kirill"));
        System.out.println(printElement(10));

        zd(2);
        System.out.println(isEqual(10, 10));

        zd(3);
        Integer[] in = new Integer[]{10, 233, 343, 223};
        getFirstElement(in);

        zd(4);
        Pair<Integer, Integer> arr = new Pair();
        arr.setFirst(13);
        arr.setSecond(24);
        System.out.println(arr.getFirst());
        System.out.println(arr.getSecond());

        zd(5);
        Character[] carArrau = new Character[]{'E', 'k', 'a', 't', 'e', 'r', 'i', 'n', 'a'};
        Integer[] IntArr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        reversedArray(carArrau);
        reversedArray(IntArr);

        zd(6);
        compareElements(true,false);

        zd(7);
        Integer[] InArr = new Integer[]{10, 33, 343, 23};
        findIndex(InArr,33);

        zd(9);
        Integer[] IntArr2 = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        copyArray(IntArr2);
        System.out.println();

        zd(10);
        Triple triple = new Triple();
        triple.setValue1(22);
        System.out.println(triple.getValue1());
        triple.setValue2('K');
        System.out.println(triple.getValue2());
        triple.setValue3("Sorokin");
        System.out.println(triple.getValue3());

    }
}