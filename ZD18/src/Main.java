
//class Animal {
//    private String name;
//
//    public Animal(String name) {
//        this.name = name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return this.name;
//    }
//}
//
//class Dog extends Animal {
//
//    public Dog(String name) {
//        super(name);
//    }
//
//    public String toString() {
//        return getName();
//    }
//}
//
////2. Добавление нового атрибута
////Создайте класс Vehicle с атрибутом brand. Создайте класс Car, который наследует Vehicle, и добавьте атрибут model.
//// Создайте объект Car и установите оба атрибута.
//
//class Vehicle {
//
//    private String brand;
//
//    public Vehicle(String brand) {
//        this.brand = brand;
//    }
//
//    public void setBrand(String brand) {
//        this.brand = brand;
//    }
//
//    public String getBrand() {
//        return this.brand;
//    }
//}
//
//class Car extends Vehicle {
//
//    private String model;
//
//    public Car(String brand , String model) {
//        super(brand);
//        this.model = model;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    public String getModel() {
//        return this.model;
//    }
//
//    public String Car1 (){
//        return getBrand() + " " + getModel();
//    }
//}
//
////3. Наследование с использованием метода базового класса
////Создайте класс Person с методом introduce(), который выводит строку "I am a person". Создайте класс Student, который наследует Person,
//// и создайте объект Student. Вызовите метод introduce().
//
//class Person {
//
//    public void introduce(){
//        System.out.println("I am a person");
//    }
//}
//class Student extends Person {
//
//    public String Student;
//
//    public void setStudent(String student) {
//        Student = student;
//    }
//
//    public String getStudent() {
//        return this.Student;
//    }
//}
//
////4. Добавление метода в дочерний класс
////Создайте класс Bird с атрибутом species. Создайте класс Penguin, который наследует Bird, и добавьте метод swim(), который выводит "I can swim".
//
//class Bird {
//
//    private String species;
//
//    public void setSpecies(String species) {
//        this.species = species;
//    }
//
//    public String getSpecies() {
//        return this.species;
//    }
//}
//class Penguin extends Bird{
//
//    public void swim() {
//        System.out.println("I can swim");
//    }
//
//}
//
////5. Наследование с использованием конструктора
////Создайте класс Shape с атрибутом color, который задается через конструктор. Создайте класс Rectangle, который наследует Shape,
//// и создайте объект Rectangle с указанием цвета.
//
//class Shape{
//
//    private String color;
//
//    public Shape(String color) {
//        this.color = color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public String getColor() {
//        return this.color;
//    }
//}
//class Rectangle extends Shape{
//
//    public Rectangle(String color) {
//        super(color);
//    }
//
//    public String Rectangle(){
//        return getColor();
//    }
//
//}
//
////6. Создание нескольких дочерних классов
////Создайте класс Animal. Затем создайте два дочерних класса: Dog и Cat.
//// В каждом из них добавьте уникальный атрибут, например, breed для собак и color для кошек.
//
//class Animal {
//
//}
//class Dog extends Animal{
//
//    private String breed;
//
//    public void setBreed(String breed) {
//        this.breed = breed;
//    }
//
//    public String getBreed() {
//        return this.breed;
//    }
//}
//class Cat extends Animal{
//
//    private String color;
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public String getColor() {
//        return this.color;
//    }
//}
//
////7. Наследование с передачей значений в конструктор
////Создайте класс Appliance с атрибутом brand.
//// Создайте класс WashingMachine, который наследует Appliance, и установите значение для атрибута brand при создании объекта.
//
//class Appliance {
//
//    private String brand;
//
//    public void setBrand(String brand) {
//        this.brand = brand;
//    }
//
//    public String getBrand() {
//        return this.brand;
//    }
//
//}
//class WashingMachine extends Appliance{
//
//    {
//        super.setBrand("MSI");
//    }
//
//    public String RR (){
//        return this.getBrand();
//    }
//}
//
////8. Создание цепочки наследования
////Создайте класс LivingBeing с атрибутом type (например, "Living").
//// Создайте класс Animal, наследующий LivingBeing, и добавьте атрибут species. Создайте класс Mammal, который наследует Animal, и добавьте атрибут C.
//
//class LivingBeing {
//
//    private String type;
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public String getType() {
//        return this.type;
//    }
//}
//class Animal extends LivingBeing{
//
//    private String species;
//
//    public void setSpecies(String species) {
//        this.species = species;
//    }
//
//    public String getSpecies() {
//        return this.species;
//    }
//}
//class Mammal extends Animal{
//
//    private String name;
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return this.name;
//    }
//}

//9. Проверка принадлежности к классу
//Создайте класс Fruit и его дочерний класс Apple.
// Создайте объект Apple и с помощью функции isinstance() проверьте, принадлежит ли он к классу Fruit.

//Вы на уроке сказали не делать

//10. Дочерний класс с дополнительным методом
//Создайте класс Device с атрибутом name.
// Создайте класс Phone, который наследует Device, и добавьте метод make_call(), который выводит "Calling...".

class Device {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
class Phone extends Device{

    public String make_call(){
        return "Calling...";
    }

}

public class Main {
    public static void main(String[] args) {

//        Dog dog = new Dog("Bobik");
//        System.out.println(dog.toString());
//
//        Car car = new Car("BMW" , "M5");
//        System.out.println(car.Car1());
//
//        Student student = new Student();
//        student.introduce();
//
//        Rectangle rectangle = new Rectangle("Sini");
//        System.out.println(rectangle.Rectangle());
//
//        WashingMachine washingMachine = new WashingMachine();
//        System.out.println(washingMachine.RR());
//
//        Mammal mammal = new Mammal();
//        mammal.setName("setName");
//        mammal.setSpecies("setSpecies");
//        mammal.setType("setType");
//        System.out.println(mammal.getName() + " " + mammal.getSpecies() + " " + mammal.getType());

        Phone phone = new Phone();
        System.out.println(phone.make_call());
    }
}