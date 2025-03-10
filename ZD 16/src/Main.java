//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        Circle circle = new Circle(10);
        System.out.println(circle.calculateArea());

        Rectangle Rectangle = new Rectangle(15,22);
        System.out.println(Rectangle.calculatePerimeter());

        Student student = new Student("Kirill" , 21);
        student.displayInfo();

        Car car = new Car("BMW",15);
        car.accelerate(70);

        Book book = new Book("Pisma Neznakomke", "Andre Morua");
        System.out.println(book.getBookInfo());

        Point point = new Point(-3,5);
        point.move(3,2);

        Person person = new Person("Kirill","Sorokin");
        System.out.println(person.getFullName());

        Temperature temperature = new Temperature(27);
        System.out.println(temperature.toFahrenheit());
        System.out.println(temperature.toKelvin());

        Counter counter = new Counter();
        counter.increment();
        counter.increment();
        counter.decrement();
        counter.getCount();

        Time time = new Time(12,44);
        time.addMinutes(160);

    }
}

class Circle {
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public double calculateArea(){
        return 3.14 * radius * radius;
    }
}

class Rectangle{

    double length;

    double width;

    public Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Student {

    String name;

    int age;

    public Student (String a , int b){
        this.name=a;
        this.age=b;
    }
    public void displayInfo(){
        System.out.println(name + " " + age);
    }
}

class Car {

    String Brand;

    int speed;

    public Car (String Brand, int speed){
        this.Brand = Brand;
        this.speed = speed;
    }
    public void accelerate(int increment){
        int Nowspeed = speed + increment;
        System.out.println(Brand + " \nNacalnai speed " + speed + " \nNowspeed " + Nowspeed);
    }
}

class Book {

    String title;

    String author;

    public Book (String title,String author){
        this.title = title;
        this.author = author;
    }
    public String getBookInfo(){
        return title + " " + author;
    }
}

class Point {

    int x;

    int y;

    public Point (int x, int y){
        this.x=x;
        this.y=y;
    }
    public void move (int dx, int dy){
        x=dx;
        y=dy;
        System.out.println("dx = " + dx + " dy = " + dy);
    }
}

class Person{

    String firstName;

    String lastName;

    public Person (String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFullName(){
        return firstName + " " + lastName;
    }
}

class Temperature{

    double celsius;

    public Temperature (double celsius){
        this.celsius = celsius;
    }
    public double toFahrenheit(){
        System.out.print("Farengeit = ");
        return (celsius * 1.8) + 32;
    }
    public double toKelvin(){
        System.out.print("Kelvin = ");
        return celsius + 273.15;
    }
}

class Counter{

    int count = 0;

    public void increment(){
        count++;
    }
    public void decrement(){
        count--;
    }
    public void getCount(){
        System.out.println("Rezultat = " + count);
    }
}

class Time{

    int hours;

    int minutes;

    public Time (int hours , int minutes){
        this.hours = hours;
        this.minutes = minutes;
    }
    public void addMinutes(int mint){
        int Cas = 0;
        while (mint >= 60){
            Cas++;
            mint-=60;
        }
        int Minyt = minutes + mint;
        if (Minyt >= 60){
            Minyt-=60;
            Cas++;
        }
        int Casi = hours + Cas;
        System.out.println(Casi + " " + Minyt);
    }
}