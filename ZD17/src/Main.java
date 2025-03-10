//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Person person = new Person();

//        person.name Напрямую name нельзя вызвать
//        person.phone Нельзя вызвать напрямую
        
        person.setName("Kirill");
        person.age = 21;
        person.email = "03sorokin.2003@mail.ru";
        person.displayInfo();

        Employe employe = new Employe();
        employe.setPhone("8724789317");
        System.out.println(employe.getPhone());
    }
}

class Person {
    private String name;
    protected int age;
    public String email;
    protected String phone;

//    public Person(String name, int age, String email, String phone) {
//        this.name = name;
//        this.age = age;
//        this.email = email;
//        this.phone = phone;
//    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setEmail (String email){
        this.email = email;
    }
    public void displayInfo(){

        System.out.println(getName());
        System.out.println(this.age);
        System.out.println(this.email);
    }
}
class Employe extends Person {
    private String phone;

    public void setPhone (String phone){
        this.phone = phone;

    }
    public String getPhone(){
        return this.phone;
    }
}