import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//enum TEST {
//    AAA("aaa"),BBB("bbb");
//    private final String KOMENT;
//    TEST (String koment){
//        this.KOMENT = koment;
//    }
//
//    public String getKOMENT() {
//        return KOMENT;
//    }
//}
class Node {
    String value;
    Node next;

    public Node(String value) {
        this.value = value;
    }

    public Node() {
    }
}

class MyLinkedList {
    Node head;

    public void addLast(String value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            Node next = new Node(value);
            tmp.next = next;
        }
    }

    public void addFerst(String velue) {
        Node tmp = head;
        Node ferst = new Node(velue);
        head = ferst;
        head.next = tmp;
    }

    public void print() {
        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.value + " ");
            tmp = tmp.next;
        }
    }
    //---------------------------------------------------------------------------
    //  +  public int size(); VERNI RAZMER (SKOLKO NODE)

    public int size() {
        int saiz = 0;
        Node tmp = head;
        while (tmp != null) {
            tmp = tmp.next;
            saiz++;
        }
        return saiz;
    }

    //  -  public boolean contains(String value); // ESLI EST VERNET TRUE ESLI NET FALSE
    public boolean contains(String value) {
        Node tmp = head;
        while (tmp != null) {
            if (tmp.value.equals(value)) {
                return true;
            }
            tmp = tmp.next;
        }
        return false;
    }

    //  +  public int indexOf(String value);  VOZVRAWAET INDEX DANNOQO ELEMENTA ELSI NETU -1
    public int indexOf(String value) {
        int saiz = 0;
        Node tmp = head;
        while (tmp != null) {
            if (tmp.value.equals(value)) {
                return saiz;
            }
            saiz++;
            tmp = tmp.next;
        }
        return -1;
    }

    //  -  public String get(int index); VOZVRAWAET SAM ELEMENT  ELSI NETU THROW NEW EXCEPTION(VI VISLI ZA RAZMER)
    public String get(int index) {
        if (index < 0 || index > size()) {
            return "-1";
        }
        int saiz = 0;
        Node tmp = head;
        while (tmp != null) {
            if (saiz == index) {
                return tmp.value;
            }
            saiz++;
            tmp = tmp.next;
        }
        return "-1";
    }

    //  +  public void add(int index , String value);// DOBAVIT NODE V UKAZANNIY INDEX
    public void add(int index, String value) {
        if (index < 0 || index > size()) {
            System.out.println("Index vihodit za ramki saize");
            return;
        }
        if (index == 0) {
            addFerst(value);
            return;
        } else if (index == size()) {
            addLast(value);
            return;
        }
        Node tmp = head;
        Node tmp2 = head.next;
        for (int i = 0; i < index - 1; i++) {
            tmp = tmp.next;
        }
        Node NewTMP = new Node(value);
        tmp.next = NewTMP;
        tmp = NewTMP;
        tmp.next = tmp2;
    }

//---------------------------------------------------------------------------

    //  -  public void clear();                        ocisaet linked list
    public void clear() {
        Node tmp = head;
        Node clear = head;
        while (tmp != null) {
            clear = tmp;
            clear = null;
            tmp = tmp.next;
        }
        head = null;
    }

    //  -  public boolean isEmpty();                   vozvrasaet true esli linked list pustoy inace false
    public boolean isEmpty() {
        if (head != null) {
            return true;
        } else {
            return false;
        }
    }

    //  -  public String removeFirst();                udalyayet perviy element i vozvrasaet eqo
    public String removeFirst() {
        if (head == null) {
            return null;
        } else if (head.next != null) {
            String remove = head.value;
            Node tmp = head;
            tmp = null;
            head = head.next;
            return "Удалил = " + remove;
        }
        return "-1";
    }

    //  +  public String removeLast();                 udalyayet posledniy element i vozvrasaet eqo
    public String removeLast() {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            String remove = head.value;
            head = null;
            return remove;
        }
        Node tmp = head;
        while (tmp.next.next != null) {
            tmp = tmp.next;
        }
        String removed = tmp.next.value;
        tmp.next = null;
        return "Удалил => " + removed;
    }

    //  -  public String getFirst();                   vernut perviy element
    public String getFirst() {
        if (head == null) {
            return null;
        } else {
            String remove = head.value;
            return remove;
        }
    }

    //  -  public String getLast();                    vernut posledniy element
    public String getLast() {
        if (head == null) {
            return "List pusti";
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            return tmp.value;
        }
    }

    //  -  public String remove(int index);            udalyayet po indeksu i vozvrasaet udalyayemiy obyekt
    public String remove(int index) {
        if (index < 0) {
            return removeFirst();
        }
        if (index > size()) {
            return removeLast();
        }
        Node tmp = head;
        for (int i = 0; i < index - 1; i++) {
            tmp = tmp.next;
        }
        Node tmp2 = tmp.next;
        tmp.next = tmp.next.next;
        return "Удалили => " + tmp2.value;
    }

    //  -  public String remove(String value);         udalyayet po znaceniyu i vozvrasaet udalyayemiy obyekt
    public String remove(String value) {
        Node tmp = head;
        if (head.value.equals(value)) {
            removeFirst();
            return "Удалили => " + tmp.value;
        }
        while (tmp.next != null) {
            if (tmp.value.equals(value)) {
                Node tmp2 = tmp.next;
                tmp.next = tmp.next.next;
                return "Удалили => " + tmp2.value;
            }
            tmp = tmp.next;
        }
        return "Takogo obekta net";
    }

    //  -  public void set(int index,String value);    zameni znacenie ukazannoqo index na value
    public void set(int index, String value) {
        if (index < 0 || index > size()) {
            System.out.println("Index vihodit za ramki saize");
            return;
        }
        if (index == 0) {
            head.value = value;
            return;
        }
        Node tmp = head;
        for (int i = 0; i < index - 1; i++) {
            tmp = tmp.next;
        }
        tmp.next.value = value;
    }

//****  ---------------------------------------------------------------------------

    //  -  public void sort();                         sortiruet elementi po (vozrastaniyu / ubbivaniyu)
    public void sort(String Voz_Ybv) {
        Node tmp = head;
        Node copTmp = head;
        Node saiz = head;
        int a = size();
        int index0 = 0;
        if (Voz_Ybv == "Voz") {
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a - i; j++) {
                    String value = copTmp.value;
                    String lowerCase = value.toLowerCase();
                    char[] arr1 = lowerCase.toCharArray();
                    String value2 = tmp.value;
                    String lowerCase2 = value2.toLowerCase();
                    char[] arr2 = lowerCase2.toCharArray();
                    if ((arr2[index0] >= 48 && arr2[index0] <= 57) && (arr1[index0] >= 48 && arr1[index0] <= 57)) {
                        int namber1 = Integer.parseInt(value);
                        int namber2 = Integer.parseInt(value2);
                        if (namber1 > namber2) {
                            String copia = copTmp.value;
                            copTmp.value = tmp.value;
                            tmp.value = copia;
                        }
                    } else {
                        if (arr1[index0] > arr2[index0]) {
                            String copia = copTmp.value;
                            copTmp.value = tmp.value;
                            tmp.value = copia;
                        }
                    }
                    tmp = tmp.next;
                    if (j == (a - i - 1)) {
                        saiz = saiz.next;
                        tmp = saiz;
                    }
                }
                copTmp = copTmp.next;
            }
        } else if (Voz_Ybv == "Ybv") {
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a - i; j++) {
                    String value = copTmp.value;
                    String lowerCase = value.toLowerCase();
                    char[] arr1 = lowerCase.toCharArray();
                    String value2 = tmp.value;
                    String lowerCase2 = value2.toLowerCase();
                    char[] arr2 = lowerCase2.toCharArray();
                    if ((arr2[index0] >= 48 && arr2[index0] <= 57) && (arr1[index0] >= 48 && arr1[index0] <= 57)) {
                        int namber1 = Integer.parseInt(value);
                        int namber2 = Integer.parseInt(value2);
                        if (namber1 < namber2) {
                            String copia = copTmp.value;
                            copTmp.value = tmp.value;
                            tmp.value = copia;
                        }
                    } else {
                        if (arr1[index0] < arr2[index0]) {
                            String copia = copTmp.value;
                            copTmp.value = tmp.value;
                            tmp.value = copia;
                        }
                    }
                    tmp = tmp.next;
                    if (j == (a - i - 1)) {
                        saiz = saiz.next;
                        tmp = saiz;
                    }
                }
                copTmp = copTmp.next;
            }
        } else {
            System.out.println("Osibka. Vedite => Voz / Ybv");
        }
    }

    //  -  public void reverse();                      povoracivaet elementi naoborot
    public void reverse() {
        Node tmp = head;
        while (tmp != null) {
            String value = tmp.value;
            String lowerCase = value.toLowerCase();
            char[] arrString = lowerCase.toCharArray();
            if (arrString.length > 1){
                char[] arr = new char[arrString.length];
                for (int i = 0, j = arr.length-1; i < arr.length; i++, j--) {
                    arr[i] = arrString[j];
                }
                String valueCopia = String.valueOf(arr);
                tmp.value = valueCopia;
            }
            tmp = tmp.next;
        }
    }
//---------------------------------------------------------------------------
}

public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
//        myLinkedList.addLast("1");
//        myLinkedList.addLast("3");
//        myLinkedList.addLast("2");
//        myLinkedList.addLast("5");
        myLinkedList.addLast("Dima");
        myLinkedList.addLast("Vika");
        myLinkedList.addLast("Klava");
        myLinkedList.addLast("Danil");
        myLinkedList.addLast("1");
        myLinkedList.addLast("48");
        myLinkedList.addLast("47");
        myLinkedList.addLast("55");
        myLinkedList.addLast("22");
        //        myLinkedList.addFerst("Mani");
//        System.out.println(myLinkedList.removeLast());
//        System.out.println(myLinkedList.size());
//        System.out.println(myLinkedList.contains("Katya"));
//        System.out.println(myLinkedList.indexOf("11"));
//        System.out.println(myLinkedList.get(99));
//        myLinkedList.add(0,"2");
//        myLinkedList.clear();
//        System.out.println(myLinkedList.isEmpty());
//        System.out.println(myLinkedList.removeFirst());
//        System.out.println(myLinkedList.getFirst());
//        System.out.println(myLinkedList.getLast());
//        System.out.println(myLinkedList.remove(3));
//        System.out.println(myLinkedList.remove("1"));
//        myLinkedList.set(3,"2222");
//        myLinkedList.print();
//        System.out.println(myLinkedList.size());
//        myLinkedList.sort("Ybv");
        myLinkedList.reverse();
        myLinkedList.print();
//        System.out.println(myLinkedList.size());
    }
}