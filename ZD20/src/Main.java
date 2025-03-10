//1. Базовое задание: Абстрактный класс
//Создайте абстрактный класс Shape с методом calculateArea(). Реализуйте два наследника: Circle и Rectangle. В классе
//Circle метод должен вычислять площадь круга, а в Rectangle — площадь прямоугольника.
abstract class Shape {
    abstract void calculateArea();
}

class Circle extends Shape {
    int r;

    @Override
    void calculateArea() {
        int rkvad = r * r;
        System.out.println(rkvad * 3.14);
    }
}

class Rectangle extends Shape {
    int dlina;
    int shirina;

    @Override
    void calculateArea() {
        System.out.println(dlina * shirina);
    }
}

//2. Интерфейс для животных
//Создайте интерфейс Animal с методами:
//makeSound()
//move()
//Создайте классы Dog и Bird, которые реализуют этот интерфейс.
//Реализуйте методы так, чтобы собака лаяла, а птица пела.

interface Animal {
    void makeSound();

    void move();
}

class Dog implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Dog => \nGav Gav");
    }

    @Override
    public void move() {
        System.out.println("Idet");
    }
}

class Bird implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Bird => \nCik Cirik");
    }

    @Override
    public void move() {
        System.out.println("Letit");
    }
}

//3. Абстрактный класс + интерфейс
//Создайте абстрактный класс Vehicle с методом startEngine().
//Добавьте интерфейс Flyable с методом fly(). Реализуйте два класса:
//Car (наследует Vehicle)
//Plane (наследует Vehicle и реализует Flyable).
abstract class Vehicle {
    void startEngine() {

    }
}

interface Flyable {
    void fly();
}

class Car extends Vehicle {
}

class Plane extends Vehicle implements Flyable {
    @Override
    public void fly() {
    }
}


//4. Список сотрудников
//Создайте абстрактный класс Employee с методами getSalary() и getRole().
//Реализуйте два класса:
//Manager
//Developer
//Каждый класс должен возвращать свою зарплату и роль.
abstract class Employee {
    abstract int getSalary(int Zarplata);

    abstract String getRole(String Role);
}

class Manager extends Employee {
    @Override
    int getSalary(int ZP) {
        return ZP;
    }

    @Override
    String getRole(String Rol) {
        return Rol;
    }
}

class Developer extends Employee {
    @Override
    int getSalary(int ZP) {
        return ZP;
    }

    @Override
    String getRole(String Rol) {
        return Rol;
    }
}

//5. Управление устройствами
//Создайте интерфейс Switchable с методами turnOn() и turnOff().
//Реализуйте классы:
//LightBulb
//Fan
//Каждый класс должен менять свое состояние (включено/выключено).
interface Switchable {
    void turnOn();

    void turnOff();
}

class LightBulb implements Switchable {

    int rezim = 0;

    @Override
    public void turnOn() {
        System.out.println("LightBulb = ON");
        rezim = 1;
    }

    @Override
    public void turnOff() {
        System.out.println("LightBulb = OFF");
        rezim = 0;
    }
}

class Fan implements Switchable {

    int rezim = 0;

    @Override
    public void turnOn() {
        System.out.println("Fan = ON");
        rezim = 1;
    }

    @Override
    public void turnOff() {
        System.out.println("Fan = OFF");
        rezim = 0;
    }
}

//6. Геометрические фигуры
//Создайте интерфейс Drawable с методом draw().
//Реализуйте классы:
//Circle1
//Square
//Метод draw() должен выводить текстовое описание фигуры (например, "Рисуем круг").
interface Drawable {
    void draw();
}

class Circle1 implements Drawable {
    @Override
    public void draw() {
        System.out.println("Рисуем круг");
    }
}

class Square implements Drawable {
    @Override
    public void draw() {
        System.out.println("Рисуем квадрат");
    }
}

//7. Работа с базой данных
//Создайте интерфейс Database с методами:
//connect()
//disconnect()
//Реализуйте классы:
//MySQLDatabase
//PostgreSQLDatabase
//Каждый класс должен выводить сообщения о подключении и отключении.
interface Database {
    void connect();

    void disconnect();
}

class MySQLDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("SQLDatabase Podkluceno");
    }

    @Override
    public void disconnect() {
        System.out.println("SQLDatabase Otklucenie");
    }
}

class PostgreSQLDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("SQLDatabase Podkluceno");
    }

    @Override
    public void disconnect() {
        System.out.println("SQLDatabase Otklucenie");
    }
}

//8. Спортивные соревнования
//Создайте интерфейс Athlete с методами:
//run()
//jump()
//Реализуйте классы:
//Runner
//Jumper
//Каждый класс должен реализовать соответствующие методы.
interface Athlete {
    void run();

    void jump();
}

class Runner implements Athlete {
    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public void jump() {
    }
}

class Jumper implements Athlete {
    @Override
    public void run() {
    }

    @Override
    public void jump() {
        System.out.println("jump");
    }
}

//9. Магазин
//Создайте абстрактный класс Product с методами:
//getPrice()
//getName()
//Создайте классы Electronics и Clothing, которые наследуют Product и реализуют методы.
abstract class Product {
    abstract void getPrice();

    abstract void getName();
}

class Electronics extends Product {

    @Override
    void getPrice() {
        System.out.println("\nTelefon");
    }

    @Override
    void getName() {
        System.out.println("Stoit = 14.999 RU");
    }
}

class Clothing extends Product {
    @Override
    void getPrice() {
        System.out.println("\nKyrtka");
    }

    @Override
    void getName() {
        System.out.println("Stoit = 4.999 RU");

    }
}

// 10. Зоопарк
//Создайте абстрактный класс Animal с методами:
//eat()
//sleep()
//Добавьте интерфейс SoundMaker с методом makeSound(). Реализуйте классы:
//Lion
// Elephant
//Каждое животное должно реализовать свои звуки, приемы пищи и сон.
abstract class Animal10 {
    abstract void eat();

    abstract void sleep();
}

interface SoundMaker {
    void makeSound();
}

class Lion extends Animal10 implements SoundMaker {

    @Override
    void eat() {
        System.out.println("\nLion est maso");
    }

    @Override
    void sleep() {
        System.out.println("Lion spit s 22-23:00 , vstaet 8-9:00");
    }

    @Override
    public void makeSound() {
        System.out.println("Lev givirit => RRRR-RRRR-RRRR");
    }
}

class Elephant extends Animal10 implements SoundMaker {

    @Override
    void eat() {
        System.out.println("\nElephant est listia");
    }

    @Override
    void sleep() {
        System.out.println("Elephant spit s 21-22:00 , vstaet 6-7:00");
    }

    @Override
    public void makeSound() {
        System.out.println("Elephant givirit => FFFFR - TOOOOO");
    }
}

public class Main {
    public static <T> void zd(T element) {
        System.out.println("\nZADANIE => " + element);
    }
    public static void main(String[] args) {

        zd(1);
        Circle circle = new Circle();
        circle.r = 10;
        circle.calculateArea();

        zd(2);
        Dog dog = new Dog();
        Bird bird = new Bird();
        Animal[] animal = new Animal[]{dog, bird};
        for (int i = 0; i < animal.length; i++) {
            animal[i].makeSound();
            animal[i].move();
        }

        zd(4);
        Manager manager = new Manager();
        System.out.println(manager.getRole("\nManadjer\n") + "Zarplata = " + manager.getSalary(15000));
        Developer developer = new Developer();
        System.out.println(developer.getRole("\nDeveloper\n") + "Zarplata = " + developer.getSalary(10000));

        zd(5);
        // 0 - off            1 - on
        LightBulb lightBulb = new LightBulb();
        System.out.println("lightBulb nacal");
        System.out.println(lightBulb.rezim);
        lightBulb.turnOn();
        System.out.println(lightBulb.rezim);
        lightBulb.turnOff();
        System.out.println(lightBulb.rezim);

        Fan fan = new Fan();
        System.out.println("\nFan nacal");
        System.out.println(fan.rezim);
        fan.turnOn();
        System.out.println(fan.rezim);
        fan.turnOff();
        System.out.println(fan.rezim);

        zd(6);
        Circle1 circle1 = new Circle1();
        circle1.draw();
        Square square = new Square();
        square.draw();

        zd(7);
        MySQLDatabase mySQLDatabase = new MySQLDatabase();
        mySQLDatabase.connect();
        mySQLDatabase.disconnect();
        PostgreSQLDatabase postgreSQLDatabase = new PostgreSQLDatabase();
        postgreSQLDatabase.connect();
        postgreSQLDatabase.disconnect();

        zd(8);
        Runner runner = new Runner();
        runner.run();
        Jumper jumper = new Jumper();
        jumper.jump();

        zd(9);
        Electronics electronics = new Electronics();
        electronics.getPrice();
        electronics.getName();
        Clothing clothing = new Clothing();
        clothing.getPrice();
        clothing.getName();

        zd(10);
        Lion lion = new Lion();
        lion.eat();
        lion.sleep();
        lion.makeSound();
        Elephant elephant = new Elephant();
        elephant.eat();
        elephant.sleep();
        elephant.makeSound();
    }
}