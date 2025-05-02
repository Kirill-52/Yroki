import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Perevodcik {

    private Map<String, String> dictionary = new LinkedHashMap<>();

    public Perevodcik() {
        dictionary.put("dog1", "sobaka");
        dictionary.put("mother", "mama");
        dictionary.put("brother", "brat");
        dictionary.put("sister", "sestra");
        dictionary.put("father", "papa");
        dictionary.put("home", "dom2");
    }

    public void Start() {
        Boolean End = true;
        do {
            System.out.println();
            System.out.println("Menu: ");
            System.out.println("1) Perevesti slovo");
            System.out.println("2) Raspecatat vse slova");
            System.out.println("3) Vernut razmer (saize)");
            System.out.println("4) Ydalit po (En) ili po (Ru)");
            System.out.println("5) Pecataet skolko vseqo simvolov v slovare");
            System.out.println("6) Pecataet skolko vseqo cisel v slovare");
            System.out.println("7) Izmenit slowo na ctoto");
            System.out.println("8) End");
            System.out.print(">>>");
            Scanner scanner = new Scanner(System.in);
            String poziciaMenu = scanner.nextLine();
            if (poziciaMenu.contains("1")) {
                PerevestiSlovo();
            } else if (poziciaMenu.contains("2")) {
                Raspecatatvseslova();
            } else if (poziciaMenu.contains("3")) {
                saize();
            } else if (poziciaMenu.contains("4")) {
                Clear();
            } else if (poziciaMenu.contains("5")) {
                Latter();
            } else if (poziciaMenu.contains("6")) {
                nam();
            } else if (poziciaMenu.contains("7")) {
                update();
            } else if (poziciaMenu.contains("8")) {
                End = false;
                break;
            } else {
            }
        } while (End);
    }

    public void update() {
        System.out.println();
        int saiz = 1;
        for (String key : dictionary.keySet()) {
            System.out.println(saiz + ") " + key + " (en) => " + this.dictionary.get(key) + " (ru)");
            saiz++;
        }
        do {
            System.out.println();
            System.out.println("Esli hotite viti vedite \"end\" ");
            System.out.print("Napisite slovo kotoroe hotite zamenit (ru) and (en) : ");
            Scanner scanner = new Scanner(System.in);
            String word = scanner.nextLine();
            word = word.toLowerCase();
            if (dictionary.containsKey(word)) {
                System.out.println();
                System.out.println(word + "(en) => " + dictionary.get(word) + "(ru)");
                System.out.print("Vi hotite zamenit > " + word + "(en)");
                System.out.print("\n1 - Da \n2 - Net \n");
                int select = scanner.nextInt();
                if (select == 1) {
                    System.out.print("Na cto vi hotite zamenit : ");
                    Scanner scanner1 = new Scanner(System.in);
                    String word1 = scanner1.nextLine();
                    if (dictionary.containsKey(word1)){
                        System.out.println("Takoi perevod yze est");
                    }else {
                        System.out.println(word + "(en) >>> Bil zamenen na " + word1);
                        dictionary.put(word1, dictionary.get(word));
                        dictionary.remove(word);
                        break;
                    }
                }
            } else if (dictionary.containsValue(word)) {
                for (String key : this.dictionary.keySet()) {
                    if (this.dictionary.get(key).equals(word)) {
                        System.out.println();
                        System.out.println(key + "(en) => " + dictionary.get(key) + "(ru)");
                        System.out.print("Vi hotite zamenit > " + word + "(ru)");
                        break;
                    }
                }
                System.out.print("\n1 - Da \n2 - Net \n");
                int select = scanner.nextInt();
                if (select == 1) {
                    for (String key : this.dictionary.keySet()) {
                        if (this.dictionary.get(key).equals(word)) {
                            System.out.print("Na cto vi hotite zamenit : ");
                            Scanner scanner1 = new Scanner(System.in);
                            String word1 = scanner1.nextLine();
                            if (dictionary.containsValue(word1)){
                                System.out.println("Takoi perevod yze est");
                            }else {
                                System.out.println(word + "(ru) >>> Bil zamenen na " + word1);
                                dictionary.put(key, word1);
                                dictionary.remove(word);
                                break;
                            }
                        }
                    }
                }
            } else if (word.contains("end")) {
                Start();
                break;
            } else {
                System.out.println("\nTakogo slova net v spiske");
            }
        } while (true);
    }

    public void nam() {
        int latter = 0;
        int saizkay = 0;
        int saizvalue = 0;
        for (String key : dictionary.keySet()) {
            String Value = dictionary.get(key).toString();
            char[] arrValue = Value.toCharArray();
            if (this.dictionary.get(key).equals(Value)) {
                String Key = dictionary.get(key);
                char[] arrKay = key.toCharArray();
                for (int i = 0; i < arrKay.length; i++) {
                    if (arrKay[i] >= 48 && arrKay[i] <= 57) {
                        saizkay++;
                    }
                }
            }
            for (int i = 0; i < arrValue.length; i++) {
                if (arrValue[i] >= 48 && arrValue[i] <= 57) {
                    saizvalue++;
                }
            }
            latter += saizvalue + saizkay;
            saizvalue = 0;
            saizkay = 0;

        }
        System.out.println(latter);
        Start();
    }

    public void Latter() {
        int latter = 0;
        int saizkay = 0;
        int saizvalue = 0;
        for (String key : dictionary.keySet()) {
            String Value = dictionary.get(key).toString();
            char[] arrValue = Value.toCharArray();
            if (this.dictionary.get(key).equals(Value)) {
                String Key = dictionary.get(key);
                char[] arrKay = key.toCharArray();
                for (int i = 0; i < arrKay.length; i++) {
                    saizkay++;
                }
            }
            for (int i = 0; i < arrValue.length; i++) {
                saizvalue++;
            }
            latter += saizvalue + saizkay;
            saizvalue = 0;
            saizkay = 0;

        }
        System.out.println(latter);
        Start();
    }

    public void Clear() {
        System.out.println();
        int saiz = 1;
        for (String key : dictionary.keySet()) {
            System.out.println(saiz + ") " + key + " (en) => " + this.dictionary.get(key) + " (ru)");
            saiz++;
        }
        do {
            System.out.println();
            System.out.println("Esli hotite viti vedite \"end\" ");
            System.out.print("Kakoe slovo hotite ydalit : ");
            Scanner scanner = new Scanner(System.in);
            String word = scanner.nextLine();
            word = word.toLowerCase();
            if (dictionary.containsKey(word)) {
                System.out.println("Vi hotite ydalit > " + word + "(en) => " + dictionary.get(word) + "(ru)");
                System.out.print("1 - Da \n2 - Net \n");
                int select = scanner.nextInt();
                if (select == 1) {
                    System.out.println(word + "(en) => " + dictionary.get(word) + "(ru)" + " >>> Bil udalen");
                    dictionary.remove(word);
                }
            } else if (dictionary.containsValue(word)) {
                for (String key : this.dictionary.keySet()) {
                    if (this.dictionary.get(key).equals(word)) {
                        System.out.println("Vi hotite ydalit > " + word + "(ru) => " + key + "(en)");
                        break;
                    }
                }
                System.out.print("1 - Da \n2 - Net \n");
                int select = scanner.nextInt();
                if (select == 1) {
                    for (String key : this.dictionary.keySet()) {
                        if (this.dictionary.get(key).equals(word)) {
                            System.out.println(word + "(ru) => " + key + "(en)" + " >>> Bil udalen");
                            break;
                        }
                    }
                    dictionary.remove(word);
                }
            } else if (word.contains("end")) {
                Start();
                break;
            } else {
                System.out.println("\nTakogo slova net v spiske");
            }
        } while (true);
    }

    public void saize() {
        System.out.println();
        int saize = 0;
        for (String key : dictionary.keySet()) {
            saize++;
        }
        System.out.print("Razmer = " + saize);
        Start();
    }

    public void Raspecatatvseslova() {
        System.out.println();
        int saiz = 1;
        for (String key : dictionary.keySet()) {
            System.out.println(saiz + ") " + key + " (en) => " + this.dictionary.get(key) + " (ru)");
            saiz++;
        }
        Start();
    }

    public void PerevestiSlovo() {
        boolean End = true;
        do {
            System.out.println();
            System.out.println("Esli hotite viti vedite \"end\" ");
            System.out.print("VVedite slovo dlya perevoda : ");
            Scanner scanner = new Scanner(System.in);
            String word = scanner.nextLine();
            word = word.toLowerCase();
            if (word.contains("end")) {
                Start();
                break;
            } else if (this.dictionary.containsKey(word)) {
                System.out.println(word + "(en) => " + this.dictionary.get(word) + " (ru)");
            } else if (this.dictionary.containsValue(word)) {
                for (String key : this.dictionary.keySet()) {
                    if (this.dictionary.get(key).equals(word)) {
                        System.out.println(word + " (ru) => " + key + " (en)");
                        break;
                    }
                }
            } else {
                DobavleniePriotsytstvii(word);
                break;
            }
        } while (End);
    }

    public void DobavleniePriotsytstvii(String word) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dannoe slovo otsutsvuet , ne xotite li vi eqo dobavit?\n1 - da\n2 - net");
        int select = scanner.nextInt();

        if (select == 1) {
            System.out.print("Vvedite perevod dannoqo slovo : ");
            scanner = new Scanner(System.in);

            String translate = scanner.nextLine();
            translate = translate.toLowerCase();
            if (
                    this.dictionary.containsKey(word) || this.dictionary.containsValue(word) ||
                            this.dictionary.containsKey(translate) || this.dictionary.containsValue(translate)
            ) {
                System.out.println("Dannoe slovo imeet perevod");
            } else {
                System.out.println("Dannoe slovo bilo perevedeno s \n1 - en -> ru\n2 - ru -> en");
                select = scanner.nextInt();
                if (select == 1) {
                    this.dictionary.put(word, translate);
                } else if (select == 2) {
                    this.dictionary.put(translate, word);
                } else {
                    System.out.println("Slovo ne bilo dobavleno vi sdelali ne pravilniy vibor");
                }
                System.out.println("Slovo bilo uspewno dobavleno");
                PerevestiSlovo();
            }
        } else if (select == 2) {
            System.out.println("Vaw vibor.");
        } else {
            System.out.println("Vi sdelali ne pravilniy vibor");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Perevodcik perevodcik = new Perevodcik();
        perevodcik.Start();
    }
}