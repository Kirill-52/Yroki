//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Задача 1: Месяц и количество дней
        String mes = "2";
        switch (mes) {
            case "1":
                System.out.println(31);
                break;
            case "2":
                System.out.println(28 + "/" + 29);
                break;
            case "3":
                System.out.println(31);
                break;
            case "4":
                System.out.println(30);
                break;
            case "5":
                System.out.println(31);
                break;
            case "6":
                System.out.println(30);
                break;
            case "7":
                System.out.println(31);
                break;
            case "8":
                System.out.println(31);
                break;
            case "9":
                System.out.println(30);
                break;
            case "10":
                System.out.println(31);
                break;
            case "11":
                System.out.println(30);
                break;
            case "12":
                System.out.println(31);
                break;
            default:
                System.out.println("Не найден такой месяц");
        }

        //Задача 2: Перевод чисел в слова
        String ceslo = "9";
        switch (ceslo) {
            case "0":
                System.out.println("Ноль");
                break;
            case "1":
                System.out.println("Один");
                break;
            case "2":
                System.out.println("Два");
                break;
            case "3":
                System.out.println("Три");
                break;
            case "4":
                System.out.println("Четыре");
                break;
            case "5":
                System.out.println("Пять");
                break;
            case "6":
                System.out.println("Шесть");
                break;
            case "7":
                System.out.println("Семь");
                break;
            case "8":
                System.out.println("Восемь");
                break;
            case "9":
                System.out.println("Девять");
                break;
            default:
                System.out.println("Ошибка");
        }

        //Задача 3: Калькулятор для целых чисел
        int x = 4;
        int z = 2;
        String deistvie = "/";
        switch (deistvie) {
            case "+":
                System.out.println(x + z);
                break;
            case "-":
                System.out.println(x - z);
                break;
            case "/":
                if (x == 0 || z == 0) {
                    System.out.println("Ошибка");
                } else {
                    System.out.println(x / z);
                }
                break;
            case "*":
                System.out.println(x * z);
                break;
            case "%":
                System.out.println(x % z);
                break;
            default:
                System.out.println("Ошибка");
        }

        //Задача 4: Определение части суток

        // Чеоез if было бы лучше :(

       String vremi = "17";
        switch (vremi){
            case "0":
                System.out.println("Ночь");
                break;
            case "1":
                System.out.println("Ночь");
                break;
            case "2":
                System.out.println("Ночь");
                break;
            case "3":
                System.out.println("Ночь");
                break;
            case "4":
                System.out.println("Ночь");
                break;
            case "5":
                System.out.println("Ночь");
                break;
            case "6":
                System.out.println("Утро");
                break;
            case "7":
                System.out.println("Утро");
                break;
            case "8":
                System.out.println("Утро");
                break;
            case "9":
                System.out.println("Утро");
                break;
            case "10":
                System.out.println("Утро");
                break;
            case "11":
                System.out.println("Утро");
                break;
            case "12":
                System.out.println("День");
                break;
            case "13":
                System.out.println("День");
                break;
            case "14":
                System.out.println("День");
                break;
            case "15":
                System.out.println("День");
                break;
            case "16":
                System.out.println("День");
                break;
            case "17":
                System.out.println("День");
                break;
            case "18":
                System.out.println("Вечер");
                break;
            case "19":
                System.out.println("Вечер");
                break;
            case "20":
                System.out.println("Вечер");
                break;
            case "21":
                System.out.println("Вечер");
                break;
            case "22":
                System.out.println("Вечер");
                break;
            case "23":
                System.out.println("Вечер");
                break;
            default:
                System.out.println("Ошибка");
        }

        //Задача 5: Определение типа фигуры
        String figyra = "4";
        switch (figyra) {
            case "3":
                System.out.println("Треугольник");
                break;
            case "4":
                System.out.println("Четырёхугольник");
                break;
            case "5":
                System.out.println("Пятиугольник");
                break;
            case "6":
                System.out.println("Шестиугольник");
                break;
            default:
                System.out.println("Ошибка");
        }

    }
}