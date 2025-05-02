
//Простые задания:
//1. Создание и использование enum для дней недели:
//Создайте перечисление Day с константами для всех дней недели.
//Напишите метод, который принимает Day в качестве аргумента и выводит сообщение: "Сегодня [день]".

import java.io.InputStream;
import java.util.Scanner;

enum Day{
    PONIDELNIK , VTORNIK , SREDA , CETVERK , PATNICA , SYBOTA , VOSKRESENIE
}

//Создание enum для времён года:
//2. Создайте перечисление Season с константами WINTER, SPRING, SUMMER, FALL.
//Напишите метод, который принимает сезон и возвращает логическое значение: true, если это лето.

enum Season {
    WINTER,SPRING,SUMMER,FALL
}

//Перечисление для уровней сложности:
//3. Создайте enum Difficulty с уровнями EASY, MEDIUM, HARD.
//Используйте цикл для перебора всех значений перечисления и выведите их на экран.

enum Difficulty {
    EASY, MEDIUM, HARD;
}

//Перечисление для направлений:
//4. Создайте enum Direction с константами NORTH, EAST, SOUTH, WEST.
//Напишите метод, который принимает направление и возвращает сообщение: "Вы движетесь на [направление]".

enum Direction {
    NORTH, EAST, SOUTH, WEST
}

//Использование метода valueOf:
//5. Создайте enum Status с константами START, PROCESSING, FINISHED.
//Напишите программу, которая принимает строку из консоли и преобразует её в значение перечисления с помощью valueOf.

enum Status {
    START, PROCESSING, FINISHED
}

//Работа с ordinal:
//6. Создайте enum Priority с уровнями LOW, MEDIUM, HIGH.
//Напишите метод, который возвращает номер каждого уровня, используя метод ordinal().

enum Priority{
    LOW, MEDIUM, HIGH
}

//Перебор значений с values:
//7. Создайте enum Months с названиями месяцев.
//Используйте метод values() для вывода всех месяцев на экран.

enum Months {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
}

//8. Добавление описания к временам года:
//Создайте enum Season с константами WINTER, SPRING, SUMMER, FALL.
//Добавьте поле description (строка) для каждого сезона (например, "Cold", "Warm").
//Напишите метод getDescription, который возвращает описание сезона.
//example: System.out.println(Season.WINTER.getDescription());

enum Season8 {
    WINTER("Holodno"), SPRING("Cvetenie"), SUMMER("Jara"), FALL("Opavhie lista");

    private final String Koment;

    Season8 (String koment){
        this.Koment = koment;
    }

    public String getDescription(){
        return this.Koment;
    }

}

//9. Добавление полей и методов для категорий товаров:
//Создайте enum ProductCategory с константами ELECTRONICS, FOOD, CLOTHING.
//Для каждой категории добавьте поле taxRate (процент налога).
//Напишите метод calculateTax, который принимает цену товара и возвращает налог на него.
//example: double tax = ProductCategory.ELECTRONICS.calculateTax(1000);
//System.out.println("Tax: " + tax);

enum ProductCategory{
    ELECTRONICS (0.3), FOOD (0.15), CLOTHING (0.09);

    private final double TaxRate;

    ProductCategory (double taxRate){
        this.TaxRate = taxRate;
    }

    public double calculateTax (double cina){
        return cina * this.TaxRate;
    }

}

//10. Определение рабочего времени по дням недели:
//Создайте enum Day с константами для всех дней недели.
//Добавьте поле isWorkingDay (логическое значение).
//Реализуйте метод isWorkingDay, который возвращает true для будних дней и false для выходных.
//example: System.out.println(Day.MONDAY.isWorkingDay()); // true
//System.out.println(Day.SUNDAY.isWorkingDay()); // false

enum Day10 {

    PONIDELNIK (true), VTORNIK (true),SREDA (true), CETVERK (true),
    PATNICA (true), SYBOTA (false), VOSKRESENIE (false);

    private final boolean IsWorkingDay;

    Day10 (boolean isWorkingDay){
        this.IsWorkingDay = isWorkingDay;
    }

    public boolean MyIsWorkingDay () {
        return this.IsWorkingDay;
    }

}

public class Main {
    public static <T> void zd (T Element){
        System.out.println("\nЗадание => " + Element);
    }

    public static void SegodnaDay (Day day){
        System.out.println("Сегодня : " + day);
    }

    public static boolean Poisk (Season season){
        if (season == Season.SUMMER){
            return true;
        }
        return false;
    }

    public static void PereborDifficulty (){
        Difficulty [] difficulties = new Difficulty[] {Difficulty.EASY, Difficulty.MEDIUM, Difficulty.HARD};
        for (int i = 0; i < difficulties.length; i++) {
            System.out.println(difficulties[i]);
        }
    }

    public static void Napravlenir (Direction direction){
        switch (direction){
            case EAST:
                System.out.println("Вы движетесь на EAST");
                break;
            case NORTH:
                System.out.println("Вы движетесь на NORTH");
                break;
            case SOUTH:
                System.out.println("Вы движетесь на SOUTH");
                break;
            case WEST:
                System.out.println("Вы движетесь на WEST");
                break;
        }
    }

    public static void MyValueOf (){
        Status [] statuses = new Status[] {Status.START,Status.FINISHED,Status.PROCESSING};
        Scanner scanner = new Scanner(System.in);
        String Pilzovatel = scanner.next();
        for (int i = 0; i < statuses.length; i++) {
            if (Status.valueOf(Pilzovatel) == statuses[i]){
                System.out.println(i);
            }
        }
    }

    public static void Myordinal(String priority){
        System.out.println(Priority.valueOf(priority).ordinal());
    }

    public static void MyValues (){
        for (int i = 0; i < Months.values().length; i++) {
            System.out.println(Months.values()[i]);
        }
    }

    public static void getDescription(){

    }

    public static void main(String[] args) {
        zd(1);
        SegodnaDay(Day.PONIDELNIK);

        zd(2);
        System.out.println(Poisk(Season.SUMMER));

        zd(3);
        PereborDifficulty();

        zd(4);
        Napravlenir(Direction.WEST);

//        zd(5);
//        MyValueOf();

        zd(6);
        Myordinal("LOW");

        zd(7);
        MyValues();

        zd(8);
        System.out.println(Season8.FALL.getDescription());

        zd(9);
        double tax = ProductCategory.CLOTHING.calculateTax(1000);
        System.out.println("Tax: " + tax);

        zd(10);
        System.out.println(Day10.PONIDELNIK.MyIsWorkingDay());
        System.out.println(Day10.VTORNIK.MyIsWorkingDay());
        System.out.println(Day10.PATNICA.MyIsWorkingDay());
        System.out.println(Day10.SYBOTA.MyIsWorkingDay());
        System.out.println(Day10.VOSKRESENIE.MyIsWorkingDay());

    }
}