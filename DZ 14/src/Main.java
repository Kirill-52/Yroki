//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int[] concat(int[] one , int[] two){
        int new4islo = one.length + two.length;
        int [] arr3 = new int [new4islo];
        boolean zna4enie1 = true;
        boolean zna4enie2 = true;
        for (int i = 0,o1 = 0, o2 = 0; i < arr3.length; i++) {
            if (one[o1] < two[o2] && zna4enie1 == true){

                arr3[i] = one[o1];
                o1++;
                if (o1 == one.length){
                    zna4enie1 = false;
                    o1--;
                }
            }else if(one[o1] == two[o2]){
                arr3[i] = one[o1];
                o1++;
            }
            else {
                arr3[i] = two[o2];
                o2++;
            }
        }
        return arr3;
    }

    public static void main(String[] args) {
        int[] arr1 = {-2,-1,0,4,7,10,12};
        int[] arr2 = {-10,1,1,1,2,3,6,7,10,100,1000};
        int[] arr3 = concat(arr1,arr2);
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}