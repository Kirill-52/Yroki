import java.util.Scanner;

public class Main {

//    public static double ZD1 (int a , int b) throws Exception{
//        if (a == 0 || b == 0){
//            throw new Exception("Nelza delit na 0");
//        }
//        return a/b;
//    }


//    public static void ZD3 (int a, int [] arr) throws Exception{
//        if (a < 0 || a > 5){
//            throw new Exception("Oshibka!");
//        }else {
//            for (int i = 0; i < arr.length; i++) {
//                if (a == i) {
//                    System.out.println(arr[i]);
//                }
//            }
//        }
//    }

//    public static String ZD5 (String stroka) throws Exception{
//        int koli4estvo = stroka.length();
//        if (koli4estvo > 11){
//            throw new Exception("Oshibka!");
//        }
//       return stroka;
//    }

//    public static String ZD6 (String stroka1 , String stroka2) throws Exception{
//        if (stroka1.contains(stroka2)) {
//            return "Soderzit";
//        }else {
//            throw new Exception("Oshibka!");
//        }
//    }

//    public static int ZD7 (int cislo) throws Exception{
//        if (cislo > 0 && cislo < 101) {
//            return cislo;
//        }else {
//            throw new Exception("Oshibka!");
//        }
//    }

//    public static String ZD8 (String stroka1) throws Exception{
//        char [] arr = stroka1.toCharArray();
//        int colicestvo = 0;
//        for (int i = 0; i <= arr.length; i++) {
//            if (arr[i] == ' '){
//                System.out.println(colicestvo);
//                colicestvo = 0;
//            }else {
//                colicestvo++;
//            }
//        }
//        return "";
//    }

//    public static int ZD9 (int a , int b) throws Exception{
//        if (a < b){
//            throw new Exception("Oshibka!");
//        }
//        return a/b;
//    }

//    public static int[] ZD10 (int index , int [] arr, int cislo) throws Exception{
//        if (index <= -1 || index >= 10){
//            throw new Exception("Oshibka!");
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (i == index){
//                arr[i] = cislo;
//            }
//            System.out.print(arr[i]);
//            System.out.print(" ");
//        }
//        return null;
//    }

    public static void main(String[] args) {

//        try {
//            Scanner sc1 = new Scanner(System.in);
//            int cislo1 = sc1.nextInt();
//            Scanner sc2 = new Scanner(System.in);
//            int cislo2 = sc1.nextInt();
//            System.out.println(ZD1(cislo1, cislo2));
//        }catch (Exception ex){
//            System.out.println(ex.getMessage());
//        }

//        try {
//            System.out.println("Vvedite 4islo");
//            Scanner sc1 = new Scanner(System.in);
//            int cislo1 = sc1.nextInt();
//        }catch (Exception ex){
//            System.out.println("Osibka");
//        }

//        try {
//            int [] arr = {143, 23, 3456, 46554, 53};
//            System.out.println("Vvedite idex");
//            Scanner sc1 = new Scanner(System.in);
//            int cislo1 = sc1.nextInt();
//            ZD3(cislo1,arr);
//        }catch (Exception ex){
//            System.out.println(ex.getMessage());
//        }

//        try {
//            for (int i = 1; i < 6; i++) {
//                System.out.println(" Vvedite 4islo " + i);
//                Scanner sc1 = new Scanner(System.in);
//                int cislo1 = sc1.nextInt();
//                System.out.println(cislo1);
//            }
//        }catch (Exception ex){
//            System.out.println("Error!!!!");
//        }

//        try {
//            Scanner sc1 = new Scanner(System.in);
//            String stroka = sc1.next();
//            System.out.println(ZD5(stroka));
//        }catch (Exception ex){
//            System.out.println(ex.getMessage());
//        }

//        try {
//            System.out.println(" Vvedite 4islo ");
//            Scanner sc1 = new Scanner(System.in);
//            String stroka1 = sc1.next();
//            Scanner sc2 = new Scanner(System.in);
//            String stroka2 = sc1.next();
//            System.out.println(ZD6(stroka1,stroka2));
//        }catch (Exception ex){
//            System.out.println(ex.getMessage());
//        }

//        try {
//            for (int i = 1; i < 6; i++) {
//                Scanner sc1 = new Scanner(System.in);
//                int cislo1 = sc1.nextInt();
//                System.out.println(ZD7(cislo1));
//            }
//        }catch (Exception ex){
//            System.out.println(ex.getMessage());
//        }

//        try {
//            Scanner sc1 = new Scanner(System.in);
//            String stroka1 = sc1.next();
//            System.out.println(ZD8(stroka1));
//        }catch (Exception ex){
//            System.out.println(ex.getMessage());
//        }

//        try {
//            Scanner sc1 = new Scanner(System.in);
//            int cislo1 = sc1.nextInt();
//            Scanner sc2 = new Scanner(System.in);
//            int cislo2 = sc2.nextInt();
//            System.out.println(ZD9(cislo1,cislo2));
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }

//        try {
//            int [] tabl = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//            for (int i = 0; i < 10; i++) {
//                System.out.println("Vedite idex");
//                Scanner sc1 = new Scanner(System.in);
//                int cislo1 = sc1.nextInt();
//                System.out.println("Vedite znacenie");
//                Scanner sc2 = new Scanner(System.in);
//                int cislo2 = sc1.nextInt();
//                System.out.println(ZD10(cislo1,tabl,cislo2));
//            }
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
    }
}