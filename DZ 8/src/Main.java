//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        int[] arr ={20,-14,26,28,4,-8,-3,44,14,-22,10,2,-1};
//        int pol = 0;
//        int Nepol = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > 0) {
//                pol++;
//            }
//            else{
//                Nepol++;
//            }
//        }
//        System.out.println("Целые числа: " + pol);
//        System.out.println("Нецелые числа: " + Nepol);

//        int[] arr ={20,-14,26,28,4,-8,-3,44,14,-22,10,2,-1,0};
//        int nol = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 0) {
//                nol++;
//            }
//        }
//        System.out.println("Нули : " + nol);

//        int[] arr ={1,-14,26,28,4,-8,-3,44,14,-22,10,2,-1,0};
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == i) {
//                System.out.println("Число:" + arr[i] + " = Индекс:" + i);
//            }
//        }

//        int[] arr ={20,-14,26,28,4,-8,-3,44,14,-22,10,2,-1,0,-15};
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < 0) {
//                arr[i] = 0;
//            }
//            System.out.print(arr[i] + " ");
//        }

//        int[] arr ={20,-14,26,28,4,-8,-3,44,14,-22,10,2,-1,0,-15};
//        for (int i = 0; i < arr.length; i++) {
//            int z = arr[i] * 2;
//            System.out.print(z + " ");
//        }

//        int[] arr ={20,-14,22,26,28,4,-8,-3,44,14,-22,10,2,-1,0,-15};
//        int bol = 0;
//        for (int i = 1; i < arr.length; i++) {
//           if (arr[i - 1] < arr[i]) {
//               bol ++ ;
//               System.out.print(bol + " ");
//           }
//        }

//        int[] arr ={-1,2,5,0,-6,2,4,0,0,5,-4,3,2,2};
//        int x = 0;
//        int b = 0;
//        for (int i = 0; i < arr.length-1; i++) {
//            if (arr[i+1] != 0) {
//                if (i == 0) {
//                    x = arr[0];
//                }
//                b = x * arr[i + 1];
//                x = b;
//            }else {
//                    arr[i + 1] = 1;
//            }
//        }
//        System.out.println(x);
//
//        int[] arr = {-1, 2, 5, 0, -6, 2, 0, 3, 1, 5};
//        int x = 0;
//        int b = 0;
//        int x1 = 0;
//        int b1 = 0;
//        int g = 0;
//        for (int i = 0; i < arr.length-1; i++) {
//            if (i < 4) {
//                if (arr[i + 1] != 0) {
//                    if (i == 0) {
//                        x = arr[0];
//                    }
//                    b = x * arr[i + 1];
//                    x = b;
//                } else {
//                    arr[i + 1] = 1;
//                }
//            }
//            if (i > 4) {
//                if (arr[i + 1] != 0) {
//                    if (i == 5){
//                        x1 = arr[5];
//                    }
//                    b1 = x1 * arr[i + 1];
//                    x1 = b1;
//                } else {
//                    arr[i + 1] = 1;
//                    i--;
//                }
//            }
//        }
//        if (x < x1){
//            System.out.println(x1);
//        }else {
//            System.out.println(x);
//        }

//        int[] arr = {20, -14, 26, 28, 4, -8, -3, 44, 14, -22};
//        int cislo = 0;
//        int cislo2 = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (cislo >= arr[i]) {
//                cislo = arr[i];
//            }
//        }
//        for (int i = 0; i < arr.length-1; i++) {
//            if (cislo2 >= arr[i] && arr[i] > cislo){
//                cislo2 = arr[i];
//            }
//        }
//        System.out.println(cislo);
//        System.out.println(cislo2);

//        int[] arr = {1,2,3,4,5,6,7,8,9,10};
//        for (int i = 0; i < arr.length-1; i++) {
//            if (arr[i] < arr[i + 1]) {
//                if (i == arr.length-2){
//                    System.out.println("Yporado4");
//                }
//            }else {
//                System.out.println("NO yporado4");
//                break;
//            }
//        }

//        int[] arr = {10,9,8,7,7,5,4,3,2,1};
//        for (int i = 0; i < arr.length-1; i++) {
//            if (arr[i] > arr[i + 1]) {
//                if (i == arr.length-2){
//                    System.out.println("Yporado4");
//                }
//            }else {
//                System.out.println("NO yporado4");
//                break;
//            }
//        }
//        int[] arr = {20, -14, 26, 28, 4, -8, -3, 44, 14, -22};
//        for (int i = 0; i < arr.length; i++){
//            if (arr[i] > 0 ){
//                arr[i] = arr[i] * (-1);
//            }else {
//                arr[i] = arr[i] * (-1);
//            }
//            System.out.print(arr[i] + " ");
//        }

//        int[] arr ={1,-14,26,28,4,-8,-3,44,14,-22,10,2,-1,0};
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == i) {
//                System.out.print("Число: " + arr[i]);
//                arr[i] = arr[i] * arr[i];
//                System.out.println("  Квадрат числа:" + arr[i] + "  Индекс:" + i);
//            }
//        }
//
//        int[] arr ={1,1,26,28,4,-8,-3,44,8,-22,10,2,-1,0};
//        int rez = 0;
//        int x = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == i && i%2==0) {
//                rez = x + arr[i];
//                x = rez;
//            }
//        }
//        System.out.println(rez);

//        int[] arr ={1,-14,26,28,4,-8,-3,44,14,-22,10,2,-1,0};
//        int x = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (x > arr[i]) {
//                x = arr[i];
//            }
//        }for (int i = 0; i < arr.length; i++) {
//            if (x == arr[i]){
//                arr[i] = 100;
//            }
//            System.out.print(arr[i] + " ");
//        }

//        int[] arr ={1,2,7,4,9,1,7,3,8,4,5};
//        for (int i = 10; i > -1; i--) {
//            System.out.print(arr[i] + " ");
//        }

//        int[] arr ={1,1,26,28,4,-8,-3,44,14,-22,10,2,-1,0};
//        int x = 0;
//        for (int i = 0; i < arr.length; i++) {
//                x = i;
//                arr[i] = x;
//                System.out.println(arr[i]);
//        }

//        int[] arr ={1,1,2,-1,-4,-2,0};
//        int x = 0;
//        int rez= 0;
//        for (int i = 0; i < arr.length; i++) {
//                if (arr[i] > 0){
//                    rez = x + arr[i];
//                    x = rez;
//                }
//        }
//        System.out.println(rez);

//        int[] arr ={1,1,2,-1,-4,-2,3};
//        for (int i = arr.length-1; i > 0; i--) {
//                if (arr[i] < 0){
//                   arr[i] = 0;
//                   break;
//                }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

//        int [] arr={0,1,3,7,4,8,4,7,3,4,5,7,9};
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == i && i%2==1){
//                int x = arr[i] * 2;
//                System.out.println(x + " индкс: " + i);
//            }
//        }

//        int [] arr={-23,1,3,-7,4,8,466,7,3,4,5,7,9};
//        int max = 0;
//        int min = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//            if (arr[i] > max){
//                max = arr[i];
//            }
//        }
//        for (int j = 0; j < arr.length; j++) {
//            if (arr[j] == max){
//                arr[j] = min;
//            }
//            System.out.print(arr[j] + " ");
//        }

//        int [] arr={-23,1,3,-7,4,8,466,7,3,4,5,7,9};
//        int x = 100;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] %2==0 || arr[i]%3==0){
//                arr[i] = x;
//            }
//            System.out.print(arr[i] + " ");
//        }

//        int [] arr={-23,1,3,-7,4,8,6,7,3,4,5,7,9};
//        int x = 0;
//        int rez = 0;
//        int b = 0;
//        for (int i = 0; i < arr.length; i++) {
//            rez = x + arr[i];
//            x = rez;
//        }
//        b = rez / arr.length;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > b){
//                System.out.print(arr[i] + " ");
//            }
//        }

//        int [] arr={-23,1,3,-7,4,8,466,7,3,4,5,7,9};
//        int max = 0;
//        int ind = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max){
//                max = arr[i];
//                ind = i;
//            }
//            if (i == arr.length -1){
//                System.out.print(max + " " + ind);
//            }
//        }
    }
}
