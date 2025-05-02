
class MyList {
    String [] arr = new String[0];
//    public MyList() {
//        arr = new String[0];
//    }
    // +  1 add(T value)
    public void add (String value){
        String [] tmp = new String [arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }
        tmp[arr.length] = value;
        arr = tmp;
    }
    public void print(){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    // -  2 add(int index , T value)
    public void add1 (int index , String value){
        if (index < arr.length){
            for (int i = 0; i < arr.length; i++) {
                if (i == index){
                    arr[i] = null;
                    arr[i] = value;
                }
            }
        }else {
            System.out.println("-1");
        }

    }

// -  3 size()
    public int Mysize(){
        int razmer = -1;
        for (int i = 0; i < arr.length; i++) {
            razmer++;
        }
        return razmer;
    }

// -  4 get(int index)
    public String Myget(int index){
        if (index < arr.length){
            for (int i = 0; i < arr.length; i++) {
                if (i == index){
                    return arr[i];
                }
            }
        }
        return "-1";
    }

// -  5 clear()
    public void Myclear(){
        int colicestvo = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = null;
            colicestvo++;
//            arr[i] = "0";
        }
        String [] tmp = new String [arr.length-colicestvo];
        arr = tmp;
    }

// +  6 remove(T value)
    public void Myremove(int value){
        String [] tmp = new String[arr.length-1];
        if (value < arr.length) {
            for (int i = 0; i < tmp.length; i++) {
                tmp[i] = arr[i];
                if (i >= value) {
                    tmp[i] = arr[i + 1];
                }
            }
            arr = tmp;
        } else {
            System.out.println("-1");
        }
    }

    // -  7 remove(int index)
    // специально перегрузил метод Myremove
    public void Myremove(String value){
        boolean proverka = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value){
                proverka = true;
            }
        }
        if (proverka == true) {
            String[] tmp = new String[arr.length - 1];
            for (int i = 0; i < tmp.length; i++) {
                tmp[i] = arr[i];
                if (arr[i] == value) {
                    for (int j = i; j < tmp.length; j++) {
                        tmp[j] = arr[j + 1];
                    }
                    arr = tmp;
                    break;
                }
            }
        }else {
            System.out.println("-1");
        }
    }

    public static  <T> void zd (T cislo){
        System.out.println("\nZD " + cislo);
    }
}


public class Main {
    public static void main(String[] args) {
        MyList myList = new MyList();
        //ZD1
        myList.add("1");
        myList.add("2");
        myList.add("3");
        myList.add("4");
        myList.add("5");

        MyList.zd(2);
        myList.add1(3,"111111");
        myList.print();
        System.out.println();

        MyList.zd(3);
        System.out.println(myList.Mysize());

        MyList.zd(4);
        System.out.println(myList.Myget(4));

//        MyList.zd(5);
//        myList.Myclear();
//        myList.print();

        MyList.zd(6);
//        myList.Myremove(2);
//        myList.print();
//        System.out.println(myList.Mysize());
        
        MyList.zd(7);
        myList.Myremove("2");
        myList.print();
        System.out.println(myList.Mysize());

    }
}