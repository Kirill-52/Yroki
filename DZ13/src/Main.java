import java.lang.reflect.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static boolean Nahozdenia(char[] arr, char[] naiti, int start) {
        int i = 0;
        while (i < naiti.length) {
            if (arr[i + start] != naiti[i]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static int Koli4estvo(char[] arr, char[] naiti) {
        int coli4estvoVhozdeni = 0;
        int i = 0;
        while (i <= arr.length - naiti.length) {
            if (Nahozdenia(arr, naiti, i)) {
                coli4estvoVhozdeni++;
                i += naiti.length;
            }
            i++;
        }
        return coli4estvoVhozdeni;
    }

    public static int indexOF(char[] arr, char[] naiti, int start) {
        int i = start;
        while (i < arr.length - naiti.length) {

            if (Nahozdenia(arr, naiti, i)) {
                return i;
            }
            i++;
        }
        return -1;
    }

//    public static int proverka (char [] arr,char [] arr2,char [] arr3){
//        System.out.println(arr.length);
//        System.out.println(arr2.length);
//        System.out.println(arr3.length);
//        return 0;
//    }

    public static char[] replaceAll(char[] original, char[] oldStr, char[] newStr) {
        int countEnter = Koli4estvo(original, oldStr);
        if (countEnter == 0) {
            return original;
        }
        int novaStroka = original.length - (oldStr.length * countEnter) + (newStr.length * countEnter);

        char [] rezyltat = new char[novaStroka];

//        proverka(rezyltat,oldStr,newStr);

        int startIndex = 0;
        int finaInex= 0;
        int rezulIndex= 0;

        while ((finaInex = indexOF(original,oldStr,startIndex))!=-1){
//            System.out.println("Slovo na " + finaInex + " => ");
//            startIndex=finaInex;

            rezyltat = arrCopi(original,startIndex,rezyltat,rezulIndex,finaInex-startIndex);

            rezulIndex += finaInex - startIndex;

            rezyltat = arrCopi(newStr,0,rezyltat,rezulIndex,newStr.length);

            rezulIndex += newStr.length;

            startIndex = finaInex + oldStr.length;
        }

        rezyltat = arrCopi(original,startIndex,rezyltat,rezulIndex,original.length-startIndex);

        return rezyltat;
    }

    public static char[] arrCopi (char [] str,int strIndex , char [] dest,int destIndex,int leng){
        int i = 0;
        while (i < leng){

            dest[destIndex+i] = str[strIndex + i];
            i++;
        }
        return dest;
    }

    public static void main(String[] args) {

        char[] str = "Mena zovyt Kirill. I y4ys v akademii TOP. Mne 21 god".toCharArray();
        char[] Naiti = "Kirill".toCharArray();
        char[] Zameni = "Oleg".toCharArray();
        char [] rezyl = replaceAll(str, Naiti, Zameni);
        for (int i = 0; i < rezyl.length; i++) {
            System.out.print(rezyl[i]);
        }
    }
}