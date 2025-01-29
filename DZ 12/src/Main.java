//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //    public static char mylTrim (char [] arr){
//        int probelSleva = 0;
//        for (int i = 0; i < arr.length-1; i++) {
//            if (arr[i] == ' '){
//                probelSleva++;
//            }else {
//                break;
//            }
//        }
//        char [] arr2 = new char[arr.length - probelSleva];
//        for (int i = 0; i < arr2.length; i++) {
//            arr2[i] = arr[i + probelSleva];
//            System.out.print(arr2[i]);
//        }
//        return 0;
//    }

//    public static char myRTrim (char [] arr){
//        int probelSprava = 0;
//        for (int i = arr.length-1; i > 0; i--) {
//            if (arr[i] == ' '){
//                probelSprava++;
//            }else {
//                break;
//            }
//        }
//        char [] arr2 = new char[arr.length - probelSprava];
//        for (int i = 0; i < arr2.length; i++) {
//            arr2[i] = arr[i];
//            System.out.print(arr2[i]);
//        }
//        return 0;
//    }

//    public static char myTrim (char [] arr){
//        int probelSprava = 0;
//        int probelSleva = 0;
//        for (int i = 0; i < arr.length-1; i++) {
//            if (arr[i] == ' '){
//                probelSleva++;
//            }else {
//                break;
//            }
//        }
//        for (int i = arr.length-1; i > 0; i--) {
//            if (arr[i] == ' '){
//                probelSprava++;
//            }else {
//                break;
//            }
//        }
//        char [] arr2 = new char[arr.length - probelSprava - probelSleva];
//        for (int i = 0; i < arr2.length; i++) {
//            arr2[i] = arr[i + probelSleva];
//            System.out.print(arr2[i]);
//        }
//        return 0;
//    }

//    public static char myequals (char [] arr,char [] arr2){
//        if (arr.length == arr2.length){
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] == arr2[i]){
//                    if (i == arr.length-1){
//                        for (int k = 0; k < arr.length; k++) {
//                            System.out.print(arr[k]);
//                        }
//                    }
//                }else{
//                    System.out.println("-1");
//                    break;
//                }
//            }
//        }else {
//            System.out.println("-1");
//        }
//        return 0;
//    }

//    public static char MYstartsWith (char [] arr, char [] arr2){
//        for (int i = 0,j=0; i < arr.length; i++,j++) {
//            if (arr[i] == arr2[j]){
//                if (i == arr2.length-1){
//                    System.out.println("RAVEN");
//                    break;
//                }
//            }else{
//                System.out.println("-1");
//                break;
//            }
//        }
//        return 0;
//    }

//public static char MYequalsIgnoreCase(char[] arr, char[] arr2) {
//    if (arr.length == arr2.length) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] >= 'A' && arr[i] <= 'Z') {
//                arr[i] += 32;
//            }
//            if (arr2[i] >= 'A' && arr[i] <= 'Z') {
//                arr2[i] += 32;
//            }
//            if (arr[i] == arr2[i]) {
//                if (i == arr.length - 1) {
//                    System.out.print("Ravni");
//                }
//            } else {
//                System.out.println("-1");
//                break;
//            }
//        }
//    }else{
//        System.out.println("-1");
//    }
//    return 0;
//}

//    public static char MYconcat (char [] arr, char [] arr2){
//        char [] rez = new char[arr.length + arr.length];
//        for (int i = 0,j=-1; i < rez.length;i++) {
//            if (i < arr.length){
//                rez[i] = arr[i];
//                System.out.print(rez[i]);
//            }else{
//                j++;
//                rez[i] = arr2[j];
//                System.out.print(rez[i]);
//            }
//        }
//        return 0;
//    }

//    public static char MYendsWith (char [] arr , char [] arr2){
//        int rez = arr.length-arr2.length;
//        for (int i = 0,j = 0; i < arr.length; i++,j++) {
//            if (arr[i+rez] == arr2[j]){
//                if (i == arr2.length-1){
//                    System.out.println("Zakan4ivaetsa");
//                    break;
//                }
//            }else {
//                System.out.print("-1");
//                break;
//            }
//        }
//        return 0;
//    }

//    public static char MYsubstring (char [] arr, char [] arr2){
//        int coli4estvo = 0;
//        for (int i = 0,j=0; i < arr.length; i++) {
//            if (arr[i] == arr2[j]){
//                j++;
//                coli4estvo++;
//                if (j == arr2.length){
//                    break;
//                }
//            }
//        }
//        for (int k = 0; k < coli4estvo; k++) {
//            System.out.print(arr2[k]);
//        }
//        return 0;
//    }

//    public static char MYindexOf (char [] arr ,char a){
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == a){
//                System.out.println(i);
//                break;
//            }
//        }
//        return 0;
//    }

//    public static char MYindexOf( char [] arr, char [] arr2 , int fromIndex){
//        int indexSlova = 0;
//        int ShirinaSlova = 0;
//        for (int i = fromIndex, j = 0; i < arr.length; i++) {
//            if (arr[i] == arr2[j]){
//                ShirinaSlova++;
//                if (j == 0) {
//                    indexSlova = i;
//                }
//                j++;
//                if (j == arr2.length){
//                    break;
//                }
//            }
//        }
//        if (ShirinaSlova != arr2.length){
//            System.out.println("-1");
//        }else {
//            System.out.print("Index slova =>" + indexSlova + " Slovo =>");
//            for (int i = 0; i < arr2.length; i++) {
//                System.out.print(arr2[i]);
//            }
//        }
//        return 0;
//    }
//    public static char MYlastIndexOf (char [] arr , char a){
//        boolean sovpadenie = false;
//        for (int i = arr.length-1; i >= 0; i--) {
//            if(arr[i] == a){
//                System.out.println(i);
//                sovpadenie = true;
//                break;
//            }
//        }
//        if (sovpadenie == false){
//            System.out.println("-1");
//        }
//        return 0;
//    }

//    public static char MYlastIndexOf (char [] arr , char [] slovo ,  int index){
//        boolean naidenoeSlovo = false;
//        int indexSlova = 0;
//        for (int i = index,j= slovo.length-1; i >= 0; i--) {
//            if (arr[i] == slovo[j]){
//                j--;
//                if (j == -1){
//                    indexSlova = i;
//                    naidenoeSlovo = true;
//                    j=slovo.length-1;
//                    break;
//                }
//            }
//        }
//        if (naidenoeSlovo == true){
//            System.out.print("Index slova =>" + indexSlova + " Slovo =>");
//            for (int i = 0; i < slovo.length; i++) {
//                System.out.print(slovo[i]);
//            }
//        }else {
//            System.out.println("-1");
//        }
//        return 0;
//    }

//    public static char MYlastIndexOf(char[] arr , char simvol , int inex){
//        boolean proverka = false;
//        int indexSimvola = 0;
//        for (int i = inex; i >= 0; i--) {
//            if (arr[i] == simvol){
//                proverka = true;
//                indexSimvola = i;
//                break;
//            }
//        }
//        if (proverka == true){
//            System.out.println(indexSimvola);
//        }else {
//            System.out.println("-1");
//        }
//        return 0;
//    }

//    public static char MYcontains(char[] arr , char [] arr2){
//        boolean poverka = false;
//        for (int i = 0,j=0; i < arr.length; i++) {
//            if (arr[i] == arr2[j]){
//                j++;
//                if (j == arr2.length){
//                    poverka = true;
//                    break;
//                }
//            }
//        }
//        if (poverka == true){
//            System.out.print("sootvetstvuet");
//        }else {
//            System.out.println("-1");
//        }
//        return 0;
//    }

//    public static char MYsplit(char[] arr, char simvol){
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == simvol){
//                arr[i] = '\n';
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//        }
//        return 0;
//    }

 public static void main(String[] args) {
//        String str = "     Meni zovyt KIRILL       ";
//        char [] arr = str.toCharArray();
//        mylTrim(arr);
//
//        String str = "     Meni zovyt KIRILL       ";
//        char [] arr = str.toCharArray();
//        myRTrim(arr);
//
//        String str = "     Meni zovyt KIRILL       ";
//        char [] arr = str.toCharArray();
//        myTrim(arr);


//        String str = "kirill 2003";
//        String str2 = "kirill 2003";
//        char [] pervoezna4enie = str.toCharArray();
//        char [] vtoroezna4enie = str2.toCharArray();
//        myequals (pervoezna4enie,vtoroezna4enie);

//        String str = "Kirill2003";
//        String str2 = "Kiroll2003";
//        char [] pervoezna4enie = str.toCharArray();
//        char [] na4alo = str2.toCharArray();
//        MYstartsWith (pervoezna4enie,na4alo);

//     String str = "KiriLl2003";
//     String str2 = "kirill2003";
//     char[] pervoezna4enie = str.toCharArray();
//     char[] vtoroezna4enie = str2.toCharArray();
//     MYequalsIgnoreCase(pervoezna4enie, vtoroezna4enie);

//     String str = "KiriLl2003";
//     String str2 = "kirill2003";
//     char[] pervoezna4enie = str.toCharArray();
//     char[] vtoroezna4enie = str2.toCharArray();
//     MYconcat(pervoezna4enie, vtoroezna4enie);

//     String str = "KiriLl2003";
//     String str2 = "3";
//     char[] pervoezna4enie = str.toCharArray();
//     char[] vtoroezna4enie = str2.toCharArray();
//     MYendsWith(pervoezna4enie, vtoroezna4enie);

//     String str = "KiriLL";
//     String str2 = "riLL";
//     char[] pervoezna4enie = str.toCharArray();
//     char[] vtoroezna4enie = str2.toCharArray();
//     MYsubstring(pervoezna4enie, vtoroezna4enie);

//     String str = "KiriLL 2003 goda rozdenia";
//     char slovo = 'i';
//     char[] pervoezna4enie = str.toCharArray();
//     MYindexOf(pervoezna4enie, slovo);
//
//     String str = "KiriLL 2003 goda rozdenia";
//     String slovo = "goda";
//     char[] peremei2 = slovo.toCharArray();
//     int fromIndex = 8;
//     char[] pervoezna4enie = str.toCharArray();
//     MYindexOf(pervoezna4enie ,peremei2,fromIndex);

//       String str = "KiriLL 2003 goda rozdenia";
//       char slovo = '7';
//       char[] pervoezna4enie = str.toCharArray();
//       MYlastIndexOf(pervoezna4enie, slovo);

//     String str = "KiriLL goda 2003 oda rozdenia";
//     String slovo = "goda";
//     char[] peremei2 = slovo.toCharArray();
//     int fromIndex = 17;
//     char[] pervoezna4enie = str.toCharArray();
//     MYlastIndexOf(pervoezna4enie ,peremei2,fromIndex);

//     String str = "KiriLL 2003 goda rozdenia";
//     char simvol = '9';
//     int fromIndex = 13;
//     char[] pervoezna4enie = str.toCharArray();
//     MYlastIndexOf(pervoezna4enie ,simvol,fromIndex);

//     String str = "KiriLL goda 2003 oda rozdenia";
//     String slovo = "KiriLL goda 2003";
//     char[] peremei2 = slovo.toCharArray();
//     char[] pervoezna4enie = str.toCharArray();
//     MYcontains(pervoezna4enie ,peremei2);

//     String str = "KiriLL 2003 goda rozdenia";
//     char simvol = ' ';
//     char[] pervoezna4enie = str.toCharArray();
//     MYsplit(pervoezna4enie ,simvol);
 }
}