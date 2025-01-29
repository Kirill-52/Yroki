//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void ZD(int ZD) {
        System.out.println("Задание " + ZD);
    }

//    public static int faktorial(int cislo){
//        int b = cislo;
//        if (cislo == b){
//            int b = (cislo - 1) * cislo;
//        }
//        if (cislo ){
//            int g = (cislo-1) * rez;
//            faktorial(cislo);
//        }else {
//            System.out.println(rez);
//        }
//        return cislo;
//    }

//    public static int SredArf(int arr [] ,int cislo){
//        int x = arr[cislo] + arr[cislo - 1];
//        if (cislo > 1) {
//            arr[cislo - 1] = x;
//            cislo--;
//            SredArf(arr,cislo);
//        }else {
//            int rez = arr.length - 1;
//            System.out.println(x / rez);
//        }
//        return cislo;
//    }

//    public static int Summ(int arr [] ,int cislo){
//        int x = arr[cislo] + arr[cislo - 1];
//        if (cislo > 1) {
//            arr[cislo - 1] = x;
//            cislo--;
//            Summ(arr,cislo);
//        }else {
//            System.out.println(x);
//        }
//        return cislo;
//    }

//    public static int Proizv(int arr [] ,int cislo){
//        int x = arr[cislo] * arr[cislo - 1];
//        if (cislo > 1) {
//            arr[cislo - 1] = x;
//            cislo--;
//            Proizv(arr,cislo);
//        }else {
//            System.out.println(x);
//        }
//        return cislo;
//    }

//    public static int Maxcoslo (int arr[] , int cislo) {
//        int c = arr[0];
//        for (int i = 1; i <= cislo; i++) {
//            if (c < arr[i]) {
//                c = arr[i];
//            }
//        }
//        System.out.println(c);
//        return cislo;
//    }

//    public static int Mincislo(int arr[] ,int cislo){
//        int v = arr[0];
//        for (int i = 1; i < cislo; i++) {
//            if (v > arr[i]){
//                v = arr[i];
//            }
//        }
//        System.out.println(v);
//        return cislo;
//    }

//    public static int Raznica (int arr[] , int cislo) {
//        int max = arr[0];
//        int min = arr[0];
//        for (int i = 1; i <= cislo; i++) {
//            if (max < arr[i]) {
//                max = arr[i];
//            }
//            if (min > arr[i]){
//                min = arr[i];
//            }
//        }
//        int rez = min - max;
//        System.out.println(rez);
//        return cislo;
//    }

//        public static int Symkvadr(int arr[] ,int cislo){
//        int v = 0;
//        int rez = 0;
//        for (int i = 0; i < cislo; i++) {
//           int b = arr[i] * arr[i];
//           rez = v + b;
//           v = rez;
//        }
//        System.out.println(rez);
//        return cislo;
//    }

//    public static int Oblom(int h , int R){
//        int rez = h * R;
//        System.out.println(rez);
//        return h;
//    }

//    public static int Gipotenyza(int katet1 , int katet2){
//        int rez = (katet1 * katet1) + (katet2 * katet2);
//        for (int i = 1; i < rez; i++) {
//            int c = i * i;
//            if (c == rez){
//                System.out.println(i);
//            }
//        }
//        return katet1;
//    }

//    public static int Sum(int cislo){
//        int c = 0;
//        int b = cislo - (cislo-1);
//        c = b;
//    }

//    public static int Stepen(int cislo){
//        int c = 0;
//        for (int i = 1; i < cislo; i++) {
//             c = i * i;
//            if (c == cislo){
//                System.out.println("ivlaetsa");
//                break;
//            }
//        }
//        System.out.println("Ne ivlaetsi");
//        return cislo;
//    }

//    public static int Krat35(int ot, int do1){
//        int c = 0;
//        int rez = 0;
//        for (int i = ot; i <= do1; i++) {
//            if (i%3==0 || i%5==0){
//                rez = c + i;
//                c = rez;
//            }
//        }
//        System.out.println(rez);
//        return ot;
//    }

//    public static int Sum4isl(int cislo) {
//        int des = 0;
//        int sot = 0;
//        for (int i = 1; i <= cislo; i++) {
//            if (i%100 == 0) {
//                sot++;
//            }
//        }
//        for (int i = 0; i <= cislo; i++) {
//            if (i > (sot * 100) && i%10 == 0){
//                des++;
//            }
//        }
//        int ed = cislo - ((sot*100) + (des * 10));
//        int rez = ed + des + sot;
//        System.out.println(rez);
//        return cislo;
//    }

//    public static int Proiz4isl(int cislo) {
//        int des = 0;
//        int sot = 0;
//        for (int i = 1; i <= cislo; i++) {
//            if (i%100 == 0) {
//                sot++;
//            }
//        }
//        for (int i = 0; i <= cislo; i++) {
//            if (i > (sot * 100) && i%10 == 0){
//                des++;
//            }
//        }
//        int ed = cislo - ((sot*100) + (des * 10));
//        int rez = ed * des * sot;
//        System.out.println(rez);
//        return cislo;
//    }

//    public static int Koli4estvo(int cislo) {
//        int des = 0;
//        int sot = 0;
//        for (int i = 1; i <= cislo; i++) {
//            if (i%100 == 0) {
//                sot=1;
//            }
//        }
//        for (int i = 0; i <= cislo; i++) {
//            if (i > (sot * 100) && i%10 == 0){
//                des=1;
//            }
//        }
//        int ed = 1;
//        int rez = ed + des + sot;
//        System.out.println(rez);
//        return cislo;
//    }


//    public static int Revers4isla(int cislo) {
//        int des = 0;
//        int sot = 0;
//        for (int i = 1; i <= cislo; i++) {
//            if (i%100 == 0) {
//                sot++;
//            }
//        }
//        for (int i = 0; i <= cislo; i++) {
//            if (i > (sot * 100) && i%10 == 0){
//                des++;
//            }
//        }
//        int ed = cislo - ((sot*100) + (des * 10));
//        System.out.println(ed + "" + des + "" + sot);
//        return cislo;
//    }
///////////////////////////////////////////////
//    public static int Fabona4i(int cislo) {
//        int rez2 = 0;
//        int c = 0;
//        int c2 = 1;
//        for (int i=0; i < cislo;i++) {
//            rez2 = c + c2;
//            c = rez2;
//            System.out.println(rez2);
//            rez2 = c + c2;
//            c2 = rez2;
//            System.out.println(rez2);
//        }
//        return cislo;
//    }
/////////////////////////////////////////////////////////

//    public static int Radius(int cislo) {
//        int diametr = cislo * 2;
//        float Pi = 3.14f;
//        float okr = Pi * diametr;
//        System.out.println(okr);
//        return cislo;
//    }

    public static int Proverka(int katet1, int katet2,int Gipotenuza) {
        int GipotenyzaKvadr = Gipotenuza * Gipotenuza;
        int katet1Kvadr = katet1 * katet1;
        int katet2Kvadr = katet2 * katet2;
        if (GipotenyzaKvadr == katet1Kvadr + katet2Kvadr){
            System.out.println("Prymaygoln");
        }else {
            System.out.println("NE prymaygoln");
        }
        return katet1;
    }

    public static void main(String[] args) {

//        ZD(1);
//        faktorial(6);

//        ZD(2);
//        int[] arr = {2,3,5,6,3,5,3,1,4};
//        SredArf(arr,arr.length-1);

//        ZD(3);
//        int[] arr = {2,3,5,6,3,5,3,1,4};
//        Summ(arr,arr.length-1);

//        ZD(4);
//        int[] arr = {2,3,5,6,3,5,3,1,4};
//        Proizv(arr,arr.length-1);

//        ZD(5);
//        int[] arr = {2,6,3,6,54,6,66,4,3334,4,44,8};
//        Maxcoslo(arr,arr.length-1);

//        ZD(6);
//        int[] arr = {2,6,3,6,-54,6,66,4,3334,4,44,8};
//        Mincislo(arr,arr.length-1);

//        ZD(7);
//        int[] arr = {2,6,3,6,-54,6,66,4,334,4,44,8};
//        Raznica(arr,arr.length-1);

//        ZD(8);
//        int[] arr = {2,6,3,6,-54,6,66,4,334,4,44,8};
//        Symkvadr(arr,arr.length-1);

//        ZD(9);
//        Oblom(15,23);

//        ZD(10);
//        Gipotenyza(3,4);

//        ZD(11);
//        Sum(5);

//        ZD(12);
//        Stepen(5);

//        ZD(13);
//        Krat35(25,100);

//        ZD(14);
//        Sum4isl(555);

//        ZD(15);
//        Proiz4isl(555);

//        ZD(16);
//        Koli4estvo(22);

//        ZD(17);
//        Revers4isla(438);

//        ZD(18);
//        Fabona4i(4);

//        ZD(19);
//        Radius(3);

        ZD(20);
        Proverka(3,4,5);
    }
}