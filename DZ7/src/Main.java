import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // ZD 1
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n");

        //ZD 2
        int[] ZZ = new int[5];
        for (int i = 0; i < ZZ.length; i++) {
            ZZ[i] = i + 1;
        }
        System.out.print(ZZ[0] + ZZ[1] + ZZ[2] + ZZ[3] + ZZ[4]);

        System.out.println("\n");

        //ZD 3
        int[] x = new int[10];
        for (int i = 0; i < x.length; i++) {
            x[i] = i + 1;
        }
        int lastindex = x.length - 1;
        System.out.println(x[lastindex]);

        System.out.println("");

        //ZD 4
        int[] v = new int[10];
        for (int i = 0; i < v.length; i++) {
            v[i] = i + 1;
        }
        int Posled = 0;
        System.out.println(v[Posled]);

        System.out.println("");

        //DZ 5
        int [] b = new int [10];
        int celoe = 0;
        for (int i = 0; i < b.length; i++) {
            b[i]= i + 1;
        }
        for (int i = 0; i < b.length; i++) {
            if (b[i]%2==0){
                celoe++;
            }
        }
        System.out.println(celoe);

        System.out.println("");

        //DZ 6
        int [] n = new int [10];
        int neceloe = 0;
        for (int i = 0; i < n.length; i++) {
            n[i]= i + 1;
        }
        for (int i = 0; i < n.length; i++) {
            if (n[i]%2==1){
                neceloe++;
            }
        }
        System.out.println(neceloe);

        System.out.println("");

        //DZ7
        int[] d7 = new int[10];
        int sam = 0;
        for (int i = 0; i < d7.length; i++) {
            d7[i] = i + 1;
            sam = sam + d7[i];
        }
        int vsecisla = d7.length-1;
        System.out.println(sam/d7[vsecisla]);

        System.out.println("");

        //DZ8
        int[] b8 = new int[10];
        for (int i = 0,j=11; i < b8.length; i++,j--) {
            b8[i] = j - 1;
        }
        for (int i = 0; i < b8.length; i++) {
            System.out.print(b8[i] + " ");
        }

        System.out.println("");

        //DZ9
//        int[] d9 = new int[101];
//        Random ran = new Random(101);
//        for (int i = 0; i < d9.length; i++) {
//            d9[i]= ran;
//        }
//        System.out.println("");

        //DZ10
        int[] d10 = new int[10];
        for (int i = 0; i < d10.length; i++) {
            d10[i] = i + 1;
        }
        int X = d10.length;
        int V = d10.length - 9;
        for (int i = 0; i < d10.length; i++) {
            if (i == 0) {
                System.out.print(X+" ");
            }else if(i == 9){
                System.out.print(V);
            }else {
                System.out.print(d10[i] + " ");
            }
        }

        System.out.println("\n");

        //DZ11

        int[] d11 = new int[10];
        for (int i = 0; i < d11.length; i++) {
            d11[i] = i + 1;
        }
        int X1 = d11.length;
        int V1 = d11.length - 9;
        System.out.print(X1 - V1);

        System.out.println("\n");

        //DZ12
        int[] d12 = new int[10];
        int sam12 = 0;
        for (int i = 0; i < d12.length; i++) {
            d12[i] = i + 1;
            sam12 = sam12 + d12[i];
        }
        int Cislo = 0;
        int vsecisla1 = d12.length-1;
        System.out.println("Средне арефметичсекое " + (sam12/d12[vsecisla1]));
        for (int i = 0; i <= d12.length; i++) {
            if (i > sam12/d12[vsecisla1]){
            Cislo++;
            }
        }
        System.out.println(Cislo);

        System.out.println("\n");

        //DZ13
        int[] d13 = new int[10];
        for (int i = 0; i < d13.length; i++) {
            d13[i] = i + 1;
        }
        for (int i = 0; i < d13.length; i++) {
            System.out.print(d13[i] * d13[i] + " ");
        }


    }
}
