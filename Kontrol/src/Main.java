import java.util.Random;
import java.util.Scanner;

public class Main {

//    public static void tablica (char [] tabl){
//        for (int i = 0; i < tabl.length; i++) {
//            System.out.print(tabl[i]);
//            if (i == 9 || i == 19){
//                System.out.println("\n---------");
//            }
//        }
//    }
//    public static void izmenenieOrig (int cislo, char [] newTabl, int Polzav){
//
//        if (cislo == 1){
//            cislo = '1';
//        }
//        if (cislo == 2){
//            cislo = '2';
//        }
//        if (cislo == 3){
//            cislo = '3';
//        }
//        if (cislo == 4){
//            cislo = '4';
//        }
//        if (cislo == 5){
//            cislo = '5';
//        }
//        if (cislo == 6){
//            cislo = '6';
//        }
//        if (cislo == 7){
//            cislo = '7';
//        }
//        if (cislo == 8){
//            cislo = '8';
//        }
//        if (cislo == 9){
//            cislo = '9';
//        }
//        for (int i = 0; i < newTabl.length; i++) {
//            if (cislo == newTabl[i]){
//                if (Polzav == 1) {
//                    newTabl[i] = 'X';
//                }
//                if (Polzav == 2){
//                    newTabl[i] = 'O';
//                }
//            }
//            System.out.print(newTabl[i]);
//            if (i == 9 || i == 19){
//                System.out.println("\n---------");
//            }
//            pobeda(newTabl,Polzav);
//        }
//    }
//
//    public static void Polzovatel1 (char [] arr1){
//        System.out.println("\n");
//        System.out.print("Igrik №1 (X) \nVibitete nomer => ");
//        Scanner sc = new Scanner(System.in);
//        int cislo1 = sc.nextInt();
//        if (cislo1 > 0 && cislo1 <= 19){
//            izmenenieOrig(cislo1,arr1,1);
//        }else {
//            Polzovatel1(arr1);
//        }
//        System.out.println();
//    }
//
//    public static void Polzovatel2 (char [] arr2){
//        System.out.println("\n");
//        System.out.print("Igrik №2 (O) \nVibitete nomer => ");
//        Scanner sc = new Scanner(System.in);
//        int cislo1 = sc.nextInt();
//        if (cislo1 > 0 && cislo1 <= 19){
//            izmenenieOrig(cislo1,arr2,2);
//        }else {
//            Polzovatel2(arr2);
//        }
//    }
//
//    public static void pobeda (char [] arr,int Polzav){
//        for (int i = 0; i <= 0; i++) {
//            if ((arr[i] == 'X' && arr[i+4] == 'X' && arr[i+8] == 'X') || (arr[i] == 'O' && arr[i+4] == 'O' && arr[i+8] == 'O')){
//                if (Polzav == 1){
//                    System.out.println();
//                    System.out.println("Pobedil Igrok № 1");
//                    break;
//                }else {
//                    System.out.println();
//                    System.out.println("Pobedil Igrok № 2");
//                    break;
//                }
//            }
//            if ((arr[i+10] == 'X' && arr[i+14] == 'X' && arr[i+18] == 'X') || (arr[i+10] == 'O' && arr[i+14] == 'O' && arr[i+18] == 'O')){
//                if (Polzav == 1){
//                    System.out.println();
//                    System.out.println("Pobedil Igrok № 1");
//                    break;
//                }else {
//                    System.out.println();
//                    System.out.println("Pobedil Igrok № 2");
//                    break;
//                }
//            }
//            if ((arr[i+20] == 'X' && arr[i+24] == 'X' && arr[i+28] == 'X') || (arr[i+20] == 'O' && arr[i+24] == 'O' && arr[i+28] == 'O')){
//                if (Polzav == 1){
//                    System.out.println();
//                    System.out.println("Pobedil Igrok № 1");
//                    break;
//                }else {
//                    System.out.println();
//                    System.out.println("Pobedil Igrok № 2");
//                    break;
//                }
//            }
//            if ((arr[i] == 'X' && arr[i+10] == 'X' && arr[i+20] == 'X') || (arr[i] == 'O' && arr[i+10] == 'O' && arr[i+20] == 'O')){
//                if (Polzav == 1){
//                    System.out.println();
//                    System.out.println("Pobedil Igrok № 1");
//                    break;
//                }else {
//                    System.out.println();
//                    System.out.println("Pobedil Igrok № 2");
//                    break;
//                }
//            }
//            if ((arr[i+4] == 'X' && arr[i+14] == 'X' && arr[i+24] == 'X') || (arr[i+4] == 'O' && arr[i+14] == 'O' && arr[i+24] == 'O')){
//                if (Polzav == 1){
//                    System.out.println();
//                    System.out.println("Pobedil Igrok № 1");
//                    break;
//                }else {
//                    System.out.println();
//                    System.out.println("Pobedil Igrok № 2");
//                    break;
//                }
//            }
//            if ((arr[i+8] == 'X' && arr[i+18] == 'X' && arr[i+28] == 'X') || (arr[i+8] == 'O' && arr[i+18] == 'O' && arr[i+28] == 'O')){
//                if (Polzav == 1){
//                    System.out.println();
//                    System.out.println("Pobedil Igrok № 1");
//                    break;
//                }else {
//                    System.out.println();
//                    System.out.println("Pobedil Igrok № 2");
//                    break;
//                }
//            }
//            if ((arr[i] == 'X' && arr[i+14] == 'X' && arr[i+28] == 'X') || (arr[i] == 'O' && arr[i+14] == 'O' && arr[i+28] == 'O')){
//                if (Polzav == 1){
//                    System.out.println();
//                    System.out.println("Pobedil Igrok № 1");
//                    break;
//                }else {
//                    System.out.println();
//                    System.out.println("Pobedil Igrok № 2");
//                    break;
//                }
//            }
//            if ((arr[i+8] == 'X' && arr[i+14] == 'X' && arr[i+20] == 'X') || (arr[i+8] == 'O' && arr[i+14] == 'O' && arr[i+20] == 'O')){
//                if (Polzav == 1){
//                    System.out.println();
//                    System.out.println("Pobedil Igrok № 1");
//                    break;
//                }else {
//                    System.out.println();
//                    System.out.println("Pobedil Igrok № 2");
//                    break;
//                }
//            }
//        }
//    }
//
//    public static void Start (){
//        char [] tabl = "1 | 2 | 3 4 | 5 | 6 7 | 8 | 9 ".toCharArray();
//        tablica(tabl);
//        System.out.println("\n");
//        for (int i = 0; i < 9; i++) {
//            Polzovatel1(tabl);
//            Polzovatel2(tabl);
//        }
//    }
//
//    public static void main(String[] args) {
//        Start();

//    public static void tablica (char [] tabl){
//        for (int i = 0; i < tabl.length; i++) {
//            System.out.print(tabl[i]);
//            if (i == 9 || i == 19){
//                System.out.println("\n---------");
//            }
//        }
//    }
//    public static void izmenenieOrig (int cislo, char [] newTabl, int Polzav){
//
//        if (cislo == 1){
//            cislo = '1';
//        }
//        if (cislo == 2){
//            cislo = '2';
//        }
//        if (cislo == 3){
//            cislo = '3';
//        }
//        if (cislo == 4){
//            cislo = '4';
//        }
//        if (cislo == 5){
//            cislo = '5';
//        }
//        if (cislo == 6){
//            cislo = '6';
//        }
//        if (cislo == 7){
//            cislo = '7';
//        }
//        if (cislo == 8){
//            cislo = '8';
//        }
//        if (cislo == 9){
//            cislo = '9';
//        }
//        for (int i = 0; i < newTabl.length; i++) {
//            if (cislo == newTabl[i]){
//                if (Polzav == 1) {
//                    newTabl[i] = 'X';
//                }
//                if (Polzav == 2){
//                    newTabl[i] = 'O';
//                }
//            }
//            System.out.print(newTabl[i]);
//            if (i == 9 || i == 19){
//                System.out.println("\n---------");
//            }
//            pobeda(newTabl,Polzav);
//        }
//    }
//
//    public static void Polzovatel1 (char [] arr1){
//        System.out.println("\n");
//        System.out.print("Igrik №1 (X) \nVibitete nomer => ");
//        Scanner sc = new Scanner(System.in);
//        int cislo1 = sc.nextInt();
//        if (cislo1 > 0 && cislo1 <= 19){
//            izmenenieOrig(cislo1,arr1,1);
//        }else {
//            Polzovatel1(arr1);
//        }
//        System.out.println();
//    }
//
//    public static void Polzovatel2 (char [] arr2){
//        System.out.println("\n");
//        System.out.print("Igrik №2 (O) \nVibitete nomer => ");
//        Scanner sc = new Scanner(System.in);
//        int cislo1 = sc.nextInt();
//        if (cislo1 > 0 && cislo1 <= 19){
//            izmenenieOrig(cislo1,arr2,2);
//        }else {
//            Polzovatel2(arr2);
//        }
//    }
//
//    public static void pobeda (char [] arr,int Polzav){
//        for (int i = 0; i <= 0; i++) {
//            if ((arr[i] == 'X' && arr[i+4] == 'X' && arr[i+8] == 'X') || (arr[i] == 'O' && arr[i+4] == 'O' && arr[i+8] == 'O')){
//                if (Polzav == 1){
//                    System.out.println();
//                    System.out.println("Pobedil Igrok № 1");
//                    break;
//                }else {
//                    System.out.println();
//                    System.out.println("Pobedil Igrok № 2");
//                    break;
//                }
//            }
//            if ((arr[i+10] == 'X' && arr[i+14] == 'X' && arr[i+18] == 'X') || (arr[i+10] == 'O' && arr[i+14] == 'O' && arr[i+18] == 'O')){
//                if (Polzav == 1){
//                    System.out.println();
//                    System.out.println("Pobedil Igrok № 1");
//                    break;
//                }else {
//                    System.out.println();
//                    System.out.println("Pobedil Igrok № 2");
//                    break;
//                }
//            }
//            if ((arr[i+20] == 'X' && arr[i+24] == 'X' && arr[i+28] == 'X') || (arr[i+20] == 'O' && arr[i+24] == 'O' && arr[i+28] == 'O')){
//                if (Polzav == 1){
//                    System.out.println();
//                    System.out.println("Pobedil Igrok № 1");
//                    break;
//                }else {
//                    System.out.println();
//                    System.out.println("Pobedil Igrok № 2");
//                    break;
//                }
//            }
//            if ((arr[i] == 'X' && arr[i+10] == 'X' && arr[i+20] == 'X') || (arr[i] == 'O' && arr[i+10] == 'O' && arr[i+20] == 'O')){
//                if (Polzav == 1){
//                    System.out.println();
//                    System.out.println("Pobedil Igrok № 1");
//                    break;
//                }else {
//                    System.out.println();
//                    System.out.println("Pobedil Igrok № 2");
//                    break;
//                }
//            }
//            if ((arr[i+4] == 'X' && arr[i+14] == 'X' && arr[i+24] == 'X') || (arr[i+4] == 'O' && arr[i+14] == 'O' && arr[i+24] == 'O')){
//                if (Polzav == 1){
//                    System.out.println();
//                    System.out.println("Pobedil Igrok № 1");
//                    break;
//                }else {
//                    System.out.println();
//                    System.out.println("Pobedil Igrok № 2");
//                    break;
//                }
//            }
//            if ((arr[i+8] == 'X' && arr[i+18] == 'X' && arr[i+28] == 'X') || (arr[i+8] == 'O' && arr[i+18] == 'O' && arr[i+28] == 'O')){
//                if (Polzav == 1){
//                    System.out.println();
//                    System.out.println("Pobedil Igrok № 1");
//                    break;
//                }else {
//                    System.out.println();
//                    System.out.println("Pobedil Igrok № 2");
//                    break;
//                }
//            }
//            if ((arr[i] == 'X' && arr[i+14] == 'X' && arr[i+28] == 'X') || (arr[i] == 'O' && arr[i+14] == 'O' && arr[i+28] == 'O')){
//                if (Polzav == 1){
//                    System.out.println();
//                    System.out.println("Pobedil Igrok № 1");
//                    break;
//                }else {
//                    System.out.println();
//                    System.out.println("Pobedil Igrok № 2");
//                    break;
//                }
//            }
//            if ((arr[i+8] == 'X' && arr[i+14] == 'X' && arr[i+20] == 'X') || (arr[i+8] == 'O' && arr[i+14] == 'O' && arr[i+20] == 'O')){
//                if (Polzav == 1){
//                    System.out.println();
//                    System.out.println("Pobedil Igrok № 1");
//                    break;
//                }else {
//                    System.out.println();
//                    System.out.println("Pobedil Igrok № 2");
//                    break;
//                }
//            }
//        }
//    }
//
//    public static void Start (){
//        char [] tabl = "1 | 2 | 3 4 | 5 | 6 7 | 8 | 9 ".toCharArray();
//        tablica(tabl);
//        System.out.println("\n");
//        for (int i = 0; i < 9; i++) {
//            Polzovatel1(tabl);
//            Polzovatel2(tabl);
//        }
//    }
//
//    public static void main(String[] args) {
//        Start();


    public static void tablica(char[] tabl) {
        System.out.println("");
        for (int i = 0; i < tabl.length; i++) {
            System.out.print(tabl[i]);
            if (i == 9 || i == 19) {
                System.out.println("\n---------");
            }
            if (i == tabl.length - 1) {
                System.out.println("\n");
            }
        }
    }

    public static void izmenenieOrig(int cislo, char[] newTabl, int Polzav) {

        if (cislo == 1) {
            cislo = '1';
        }
        if (cislo == 2) {
            cislo = '2';
        }
        if (cislo == 3) {
            cislo = '3';
        }
        if (cislo == 4) {
            cislo = '4';
        }
        if (cislo == 5) {
            cislo = '5';
        }
        if (cislo == 6) {
            cislo = '6';
        }
        if (cislo == 7) {
            cislo = '7';
        }
        if (cislo == 8) {
            cislo = '8';
        }
        if (cislo == 9) {
            cislo = '9';
        }
        for (int i = 0; i < newTabl.length; i++) {
            if (Polzav == 1) {
                if (cislo == newTabl[i]) {
                    newTabl[i] = 'X';
                    Pecati(newTabl, 1);
                    break;
                }
                if (i == newTabl.length - 1) {
                    Pecati(newTabl, Polzav);
                    System.out.print("Eto pole zanato ! \n");
                    System.out.println("");
                    Polzovatel1(newTabl);
                    break;
                }
            }
            if (Polzav == 2) {
                if (cislo == newTabl[i]) {
                    newTabl[i] = 'O';
                    Pecati(newTabl, 2);
                    break;
                }
                if (i == newTabl.length - 1) {
                    System.out.println("");
                    Komputer(newTabl);
                    break;
                }
            }
        }
    }

    public static void Pecati(char[] arr1, int Polzav) {
        System.out.println("");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
            if (i == 9 || i == 19) {
                System.out.println("\n---------");
            }
            if (i == arr1.length - 1) {
                System.out.println("\n");
            }
        }
        pobeda(arr1, Polzav);
    }

    public static void Polzovatel1(char[] arr1) {
        System.out.print("Igrik №1 (X) \nVibitete nomer => ");
        Scanner sc = new Scanner(System.in);
        int cislo1 = sc.nextInt();
        if (cislo1 > 0 && cislo1 <= 9) {
            izmenenieOrig(cislo1, arr1, 1);
        } else {
            Polzovatel1(arr1);
        }
    }

    public static void Komputer(char[] arr2) {
        Random random = new Random();
        int cislo1 = random.nextInt(10);
        if (cislo1 > 0 && cislo1 <= 9) {
            izmenenieOrig(cislo1, arr2, 2);
        } else {
            Komputer(arr2);
        }
    }

    public static void pobeda(char[] arr, int Polzav) {
        for (int i = 0; i <= 0; i++) {
            if (arr[i] == 'X' && arr[i + 4] == 'X' && arr[i + 8] == 'X') {
                System.out.println();
                System.out.println("Pobedil Igrok");
                break;
            }
            if (arr[i] == 'O' && arr[i + 4] == 'O' && arr[i + 8] == 'O') {

                System.out.println();
                System.out.println("Pobedil Komputer");
                break;
            }
            if (arr[i + 10] == 'X' && arr[i + 14] == 'X' && arr[i + 18] == 'X') {
                System.out.println();
                System.out.println("Pobedil Igrok");
                break;
            }
            if (arr[i + 10] == 'O' && arr[i + 14] == 'O' && arr[i + 18] == 'O') {

                System.out.println();
                System.out.println("Pobedil Komputer");
                break;
            }
            if (arr[i + 20] == 'X' && arr[i + 24] == 'X' && arr[i + 28] == 'X') {

                System.out.println();
                System.out.println("Pobedil Igrok");
                break;
            }
            if (arr[i + 20] == 'O' && arr[i + 24] == 'O' && arr[i + 28] == 'O') {

                System.out.println();
                System.out.println("Pobedil Komputer");
                break;
            }
            if (arr[i] == 'X' && arr[i + 10] == 'X' && arr[i + 20] == 'X') {
                System.out.println();
                System.out.println("Pobedil Igrok");
                break;
            }
            if (arr[i] == 'O' && arr[i + 10] == 'O' && arr[i + 20] == 'O') {

                System.out.println();
                System.out.println("Pobedil Komputer");
                break;
            }
            if (arr[i + 4] == 'X' && arr[i + 14] == 'X' && arr[i + 24] == 'X') {
                System.out.println();
                System.out.println("Pobedil Igrok");
                break;
            }
            if (arr[i + 4] == 'O' && arr[i + 14] == 'O' && arr[i + 24] == 'O') {
                System.out.println();
                System.out.println("Pobedil Komputer");
                break;
            }
            if (arr[i + 8] == 'X' && arr[i + 18] == 'X' && arr[i + 28] == 'X') {
                System.out.println();
                System.out.println("Pobedil Igrok");
                break;
            }
            if (arr[i + 8] == 'O' && arr[i + 18] == 'O' && arr[i + 28] == 'O') {
                System.out.println();
                System.out.println("Pobedil Komputer");
                break;
            }
            if (arr[i] == 'X' && arr[i + 14] == 'X' && arr[i + 28] == 'X') {
                System.out.println();
                System.out.println("Pobedil Igrok");
                break;
            }
            if (arr[i] == 'O' && arr[i + 14] == 'O' && arr[i + 28] == 'O') {
                System.out.println();
                System.out.println("Pobedil Komputer");
                break;
            }

            if (arr[i + 8] == 'X' && arr[i + 14] == 'X' && arr[i + 20] == 'X') {
                System.out.println();
                System.out.println("Pobedil Igrok");
                break;
            }
            if (arr[i + 8] == 'O' && arr[i + 14] == 'O' && arr[i + 20] == 'O') {
                System.out.println();
                System.out.println("Pobedil Komputer");
                break;
            }
        }
    }

    public static void Start() {
        char[] tabl = "1 | 2 | 3 4 | 5 | 6 7 | 8 | 9 ".toCharArray();
        tablica(tabl);
        System.out.println("\n");
        for (int i = 0; i <= 10; i++) {
            Polzovatel1(tabl);
            Komputer(tabl);
            if (i == 7) {
                System.out.println("Nica !");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Start();
    }
}
