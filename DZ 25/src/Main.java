
class Node {

    String ima;
    Node next;

    public Node(String imy) {
        this.ima = imy;
    }
}

class MyLinkedList {
    Node Nacalo;

    public void addFerst(String ima) {
        Node NewNode = new Node(ima);
        NewNode.next = Nacalo;
        Nacalo = NewNode;
    }

    public void addLast(String ima) {

        if (Nacalo == null) {
            Nacalo = new Node(ima);
        } else {
            Node tmp = Nacalo;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            Node Newnode = new Node(ima);
            tmp.next = Newnode;
        }
    }

    public void Secik() {
        Node tmp = Nacalo;
        while (tmp != null) {
            System.out.println(tmp.ima);
            tmp = tmp.next;
        }
    }

    public void Print() {
        Node tmp = Nacalo;
        while (tmp != null) {
            System.out.println(tmp.ima);
            tmp = tmp.next;
        }
    }

    //  +  public int size(); VERNI RAZMER (SKOLKO NODE)
    public int size() {
        int Colicestvo = 0;
        Node tmp = Nacalo;
        while (tmp != null) {
            Colicestvo++;
            tmp = tmp.next;
        }
        return Colicestvo;
    }

    //  -  public boolean contains(String value); // ESLI EST VERNET TRUE ESLI NET FALSE
    public boolean scontains(String value) {
        Node tmp = Nacalo;
        while (tmp != null) {
            if (value == tmp.ima) {
                return true;
            }
            tmp = tmp.next;
        }
        return false;
    }

    //  -  public int indexOf(String value);  VOZVRAWAET INDEX DANNOQO ELEMENTA ELSI NETU -1
    public int indexOf(String value) {
        int index = 0;
        Node tmp = Nacalo;
        while (tmp != null) {
            if (value == tmp.ima) {
                return index;
            }
            index++;
            tmp = tmp.next;
        }
        return -1;
    }

    //  -  public String get(int index); VOZVRAWAET SAM ELEMENT  ELSI NETU THROW NEW EXCEPTION(VI VISLI ZA RAZMER)
    public String get(int index) {
        int MYindex = 0;
        Node tmp = Nacalo;
        while (tmp != null) {
            if (MYindex == index) {
                return tmp.ima;
            }
            MYindex++;
            tmp = tmp.next;
        }
        return "VI VISLI ZA RAZMER";
    }

    //  -  public void add(int index , String value);// DOBAVIT NODE V UKAZANNIY INDEX
    public void add(int index, String value) {
        int MYindex = 0;
        Node tmp = Nacalo;
        while (tmp != null) {
            if (MYindex == index) {
                tmp.ima = value;
            }
            MYindex++;
            tmp = tmp.next;
        }
    }
}


public class Main {
    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.addLast("Kirill");
        myLinkedList.addLast("Farid");
        myLinkedList.addLast("Katya");
        myLinkedList.addLast("Andrei");
        myLinkedList.addFerst("111");
        myLinkedList.addFerst("222");
        myLinkedList.add(0 ,"Vrode tak");
        myLinkedList.Print();
        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.scontains("Andrei"));
        System.out.println(myLinkedList.indexOf("Katya"));
        System.out.println(myLinkedList.get(3));


    }
}