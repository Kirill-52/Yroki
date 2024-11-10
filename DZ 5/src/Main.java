//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //ЗАДАНИЕ 1

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("  *");
            }
            System.out.println(" ");
        }
        System.out.println(); // что бы не сливались фигуры

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        System.out.println(); // что бы не сливались фигуры

        for (int i = 0; i < 8; i++) {
            for (int j = 8; j > i; j--) {
                System.out.print(" ");
            }
            System.out.println("*");
        }


        System.out.println(); // что бы не сливались фигуры

        //ЗАДАНИЕ 2

        for (int i = 0; i < 8; i++) {
            for (int j = 8; j > i; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        System.out.println(); // что бы не сливались фигуры

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        System.out.println(); // что бы не сливались фигуры

        //ЗАДАНИЕ 3

        for (int i = 0; i < 10; i++) {
            for (int j = 9; j > i; j--) {
                System.out.print(" ");
            }
            for (int x = -1; x < i * 2; x++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }
        System.out.println(); // что бы не сливались фигуры

        //ЗАДАНИЕ 4

        for (int v = 0; v < 10; v++) {
            for (int c = 9; c > v; c--) {
                System.out.print(" ");
            }
            for (int b = -1; b < v * 2; b++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int k = 0; k < 10; k++) {
            for (int h = 0; h < k; h++) {
                System.out.print(" ");
            }
            for (int j = 18; j > k * 2; j--) {
                System.out.print("*");
            }
            System.out.println("*");
        }


    }}




