//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
//    public static int length(char[] arr){
//        int koli4estvo = 0;
//        for (int i = 0; i < arr.length; i++) {
//            koli4estvo++;
//        }
//        return koli4estvo;
//    }

//    public static char charAt(char [] arr,int index){
//        return arr[index];
//    }

//    public static int indexOf(char[] arr,char simvol){
//        for (int i = 0, j = 0; i < arr.length; i++, j++) {
//            if(arr[i] == simvol) {
//                System.out.println("Index = " + j);
//                break;
//            } else if (i == arr.length-1) {
//                System.out.println("-1");
//            }
//        }
//        return simvol;
//    }

//    public static int lastIndexOf(char [] arr , char simvol){
//        for (int i = arr.length-1, j = arr.length-1; j >= 0; i--, j--) {
//            if(arr[i] == simvol) {
//                System.out.println("Index = " + j);
//                break;
//            } else if (i == 0) {
//                System.out.println("-1");
//            }
//        }
//        return simvol;
//    }

//    public static char[] toUpperCase(char[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] >= 'a' && arr[i] <= 'z'){
//                arr[i] -= 32;
//                System.out.print(arr[i]);
//            }else {
//                System.out.print(arr[i]);
//            }
//        }
//        return arr;
//    }

//    public static char[] toLowerCase(char[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] >= 'A' && arr[i] <= 'Z'){
//                arr[i] += 32;
//                System.out.print(arr[i]);
//            }else {
//                System.out.print(arr[i]);
//            }
//        }
//        return arr;
//    }

    public static char[] trim(char[] arr ){
        int Na4alo = 0;
        int Konec = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' '){
                Na4alo++;
            }else {
                break;
            }
        }
        for (int i = arr.length-1; i >=0; i--) {
            if (arr[i] == ' '){
                Konec++;
            }else {
                break;
            }
        }
        char [] arr2 = new char[arr.length - Na4alo - Konec];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[i + Na4alo];
            System.out.print(arr2[i]);
        }
        return arr;
    }

    public static void main(String[] args) {
//       char []arr = {'K','i','r','i','l','l'};
//        System.out.println("Количество символов: " + length(arr));

//        char []arr = {'K','i','r','i','l','l'};
//        System.out.println(charAt(arr,3));

//        char []arr = {'K','i','r','i','l','l'};
//        indexOf(arr,'l');

//        char []arr = {'K','i','r','i','l','l'};
//        lastIndexOf(arr,'K');

//        char []arr = {'K','i','r','i','l','l','2','0','0','3'};
//        toUpperCase(arr);

//        char []arr = {'K','I','r','I','l','L','2','0','0','3'};
//        toLowerCase(arr);

        String arr = "      Kirill      2003     ";
        char[] arr1 = arr.toCharArray();
        char[] rezultat = trim(arr1);
    }
}