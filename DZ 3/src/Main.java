//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Проверка возраста на совершеннолетие:
        int age = 17;
        if (age >= 18) {
            System.out.println("Вы совершеннолетний");
        } else {
            System.out.println("Вы несовершеннолетний");
        }

        //Определение температуры:
        int temperature = -5;
        if (temperature > 30) {
            System.out.println("Жарко");
        } else if (temperature >= 0) {
            System.out.println("Тепло");
        } else {
            System.out.println("Холодно");
        }

        //Сравнение двух чисел:
        int a = 15;
        int b = 10;
        if (a > b) {
            System.out.println("Первое число больше");
        } else if (a < b) {
            System.out.println("Второе число больше");
        } else {
            System.out.println("Числа равны");
        }

        //Определение сезона по месяцу:
        int month = 5;
        if (month == 12 || month <= 2) {
            System.out.println("Зима");
        } else if (month >= 3) {
            System.out.println("Весна");
        } else if (month >= 6) {
            System.out.println("Лето");
        } else if (month >= 9) {
            System.out.println("Осень");
        }
        // 1 и 2 условия могут быть верны при 12 , но аосле выполнения 1 условия Java ругие открывать не будет.

        //Проверка рабочего времени:
        int hour = 14;
        if (hour >= 9 && hour <= 18) {
            System.out.println("Рабочее время");
        } else {
            System.out.println("Вне рабочего времени");
        }

        //Проверка высокого и низкого балла:
        int score = 75;
        if (score >= 90) {
            System.out.println("Высокий балл");
        } else if (score >= 50) {
            System.out.println("Средний балл");
        } else {
            System.out.println("Низкий балл");
        }

        //Определение квадранта в системе координат:
        int x = -3;
        int y = 5;
        if (x > 0 && y > 0) {
            System.out.println("Точка в I квадранте");
        } else if (x < 0 && y > 0) {
            System.out.println("Точка в II квадранте");
        } else if (x < 0 && y < 0) {
            System.out.println("Точка в III квадранте");
        } else if (x > 0 && y < 0) {
            System.out.println("Точка в IV квадранте");
        } else if (x == 0 || y == 0) {
            System.out.println("Точка на оси координат");
        }

        //Проверка скорости автомобиля:
        int speed = 120;
        if (speed >= 100) {
            System.out.println("Превышение скорости");
        } else if (speed >= 60 && speed < 100) {
            System.out.println("Нормальная скорость");
        } else {
            System.out.println("Слишком медленно");
        }

        //Проверка билета и возраста для входа на мероприятие:

        int age1 = 22; // age уже было
        boolean hasTicket = true;
        if (age1 >= 18 && hasTicket == true) {
            System.out.println("Добро пожаловать!");
        } else if (age1 >= 18 && hasTicket == false) {
            System.out.println("Необходимо предъявить билет");
        } else if (age1 < 18) {
            System.out.println("Вход только для совершеннолетних");
        }

        //Проверка уровня влажности:
        int humidity = 80;
        if (humidity > 70) {
            System.out.println("Высокая влажность");
        } else if (humidity >= 30 || humidity <= 70) {
            System.out.println("Средняя влажность");
        } else if (humidity < 30) {
            System.out.println("Низкая влажность");
        }
    }
}