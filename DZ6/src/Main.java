//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        // Figyr 1
//
//        int x = 0;
//        int y = 0;
//        int i = 10;
//        while (x < 10) {
//            x++;
//            while (y < i) {
//                y++;
//                System.out.print(" ");
//            }
//            System.out.println("*" + y);
//            y = 0;
//            i--;
//        }
//
//        System.out.println("");
//
//
//        int p = 0;
//        int y1 = 0;
//        int i1 = 0;
//        while (p < 10) {
//            p++;
//            while (y1 <= i1) {
//                y1++;
//                System.out.print(" ");
//            }
//            System.out.println("*" + y1);
//            y1 = 0;
//            i1++;
//        }
//        System.out.println("");
//
//        //Figyr 2

//        int q = 0;
//        int w = 0;
//        while (q < 10) {
//            q++;
//            while (w < q) {
//                w++;
//                    System.out.print("*");
//                }
//                System.out.println(" ");
//                w = 0;
//        }
//
//        System.out.println("");

//        System.out.println("");
//
//        int q = 0;
//        int w = 0;
//        int e = 10;
//        while (q < 10) {
//            q++;
//            while (w < e) {
//                w++;
//                    System.out.print("*");
//                }
//                System.out.println(" " + w);
//                w = 0;
//                e--;
//        }
//
//        System.out.println("");
//
//        //Figyr 3
//
//        int r = 0;
//        int t = 0;
//        int u = 10;
//        int o = 0;
//        while (r < 11) {
//            while (t < u) {
//                t++;
//                System.out.print(" ");
//            }
//
//            while (o < r * 2) {
//                o++;
//                System.out.print("*");
//            }
//            o = 0;
//            System.out.println("*" +  r );
//            t = 0;
//            u--;
//            r++;
//        }
//
//        System.out.println("");
//
//        //Figyr 4
//
//        int a = 0;
//        int s = 0;
//        int d = 10;
//        int f = 0;
//        while (a < 11) {
//            while (s < d) {
//                s++;
//                System.out.print(" ");
//            }
//
//            while (f < a * 2) {
//                f++;
//                System.out.print("*");
//            }
//            f = 0;
//            System.out.println("*" +  a );
//            s = 0;
//            d--;
//            a++;
//        }
//        int a1 = 0;
//        int s1 = 0;
//        int f1 = 0;
//        int d1 = 10;
//        while (a1 < 11) {
//            while (s1 < a1) {
//                s1++;
//                System.out.print(" ");
//            }
//
//            while (f1 < d1 * 2) {
//                f1++;
//                System.out.print("*");
//            }
//            System.out.println("*"+ d1);
//            f1 = 0;
//            s1 = 0;
//            a1++;
//            d1--;
//        }

//        int x = 0;
//        int y = 0;
//        int i = 10;
//        do {
//            x++;
//            do {
//                System.out.print(" ");
//                i--;
//            }while (i > y);
//            System.out.println("*");
//            i=10;
//            y++;
//        }while (x < 10);

//        int x = 0;
//        int y = 1;
//        int i = 10;
//        do {
//            x++;
//            do {
//                System.out.print(" ");
//                i++;
//            }while (i < y);
//            System.out.println("*");
//            i=0;
//            y++;
//        }while (x < 10);

//        int x = 0;
//        int y = 0;
//        int i = 10;
//        do {
//            x++;
//            do {
//                System.out.print("*");
//                i--;
//            }while (i > y);
//            System.out.println("");
//            i=10;
//            y++;
//        }while (x < 10);

//        int x = 0;
//        int y = 1;
//        int i = 10;
//        do {
//            x++;
//            do {
//                System.out.print("*");
//                i++;
//            }while (i < y);
//            System.out.println("");
//            i=0;
//            y++;
//        }while (x < 10);

//        int x = 0;
//        int y = 0;
//        int i = 10;
//        int z = 0;
//        do {
//            x++;
//            do {
//                System.out.print(" ");
//                i--;
//            }while (i > y);
//            do{
//                z++;
//                System.out.print("*");
//            }while (z < y * 2);
//            if (x > 1){System.out.println("*");}
//            else {System.out.println("");}
//            i=10;
//            y++;
//            z=0;
//        }while (x < 10);
//
//        int x = 0;
//        int y = 0;
//        int i = 10;
//        int z = 0;
//        do {
//            x++;
//            do {
//                System.out.print(" ");
//                i--;
//            }while (i > y);
//            do{
//                z++;
//                System.out.print("*");
//            }while (z < y * 2);
//            if (x > 1 && x <11){System.out.println("*");}
//            else {System.out.println("");}
//            i=10;
//            y++;
//            z=0;
//        }while (x < 10);
//        int x1 = 0;
//        int y1 = 0;
//        int i1 = 0;
//        int z1 = 0;
//        int c1 = 10;
//        do {
//            x1++;
//            if (x1 >2) {
//                do {
//                System.out.print(" ");
//                i1++;
//            }while (i1 < y1);}
//            if (x1 >1) {
//            do{
//                z1++;
//                System.out.print("*");
//            }while (z1 < c1 * 2);}
//            if (x1 > 1 && x1 <11) {System.out.println("*");}
//            else {System.out.print(" ");}
//            i1=0;
//            y1++;
//            z1=0;
//            c1--;
//        }while (x1 < 11);

//        int q1 = 0;
//        int w1 = 0;
//        int e1 = 1;
//        while (q1 < 10) {
//            q1++;
//            while (w1 < q1) {
//                System.out.print("*");
//                w1++;
//                if (q1 == 9) {
//                    w1 =2; q1++;
//                }
//            }
//            if (q1 < 10) {
//                while (e1 <q1) {
//                    e1++;
//                    System.out.print(" ");
//                }
//            }
//            System.out.println("*");
//            e1 = 1;
//        }

//        int q1 = 0;
//        int w1 = 0;
//        int e1 = 1;
//        int c1 = 10;
//        while (q1 < 10) {
//            q1++;
//            while (w1 < c1) {
//                if (q1 == 1) {
//                    w1++;
//                    System.out.print("*");
//
//                } else {
//                    w1++;
//                    System.out.print("*");
//                }
//            }
//            if (q1 > 1) {
//                while (e1 < c1) {
//                    e1++;
//                    System.out.print(" ");
//                }
//            }
//            c1--;
//            System.out.println("*");
//            e1 = 1;
//            w1=c1;
//            w1--;
//        }

//        int q1 = 0;
//        int e1 = 1;
//        int c1 = 10;
//        int w1 = 0;
//        while (q1 < 10) {
//            while (e1 < c1) {
//                e1++;
//                System.out.print(" ");
//            }
//            if (q1 > 0) {
//                System.out.print("*");
//            }
//            while (w1 < q1 * 2){
//                if (q1 < 9) {
//                    w1++;
//                    System.out.print(" ");
//                }
//                else {
//                    w1++;
//                    System.out.print("*");
//                }
//            }
//            w1=1;
//            c1--;
//            q1++;
//            System.out.println("*");
//            e1 = 1;
//        }

        int q1 = 0;
        int e1 = 1;
        int c1 = 10;
        int w1 = 0;
        while (q1 < 10) {
            while (e1 < c1) {
                e1++;
                System.out.print(" ");
            }
            if (q1 > 0) {
                System.out.print("*");
            }
            while (w1 < q1 * 2) {
                w1++;
                System.out.print(" ");
            }

            w1=1;
            c1--;
            q1++;
            System.out.println("*");
            e1 = 1;
        }

        int q = 1;
        int e = 0;
        int c = 8;
        int w = 1;
        while (q < 10) {

            while (e < q) {
                e++;
                System.out.print(" ");
            } if (q < 9) {
                System.out.print("*");
            }
            if (q > 0) {
            }
            while (w < c * 2){
                    w++;
                    System.out.print(" ");
            }
            w=1;
            c--;
            q++;
            System.out.println("*");
            e = 0;
        }
    }
}