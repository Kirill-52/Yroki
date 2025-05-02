import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public void Start() throws IOException {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Vedite comandy: ");
            String comand = scanner.nextLine();
            String put = "";
            String put1 = "";
            String put2 = "";
            String ima = "";
            String ima1 = "";
            String ima2 = "";
            if (comand.startsWith("create-folder")) {
                //        create-folder <путь> – создать папку
                put = comand.split("  ")[1];
                ima = comand.split("  ")[2];
                File file = new File(put, ima);
                if (file.exists()) {
                    System.out.println("Takai papka yze est");
                } else {
                    if (file.mkdir()) {
                        System.out.println("Papka " + ima + " sozdana");
                    } else {
                        System.out.println("Osibka");
                    }
                }
            } else if (comand.startsWith("create-file")) {
                //        create-file <путь> – создать пустой файл
                //  C:\Users\03sor\IdeaProjects\DZ29\src  test
                put = comand.split("  ")[1];
                ima = comand.split("  ")[2];
                File file = new File(put, ima);
                if (file.exists()) {
                    System.out.println("Takoi fail yze est");
                } else {
                    if (file.createNewFile()) {
                        System.out.println("Fail " + ima + " sozdan");
                    } else {
                        System.out.println("Osibka");
                    }
                }
            } else if (comand.startsWith("delete a")) {
                //        delete <путь> – удалить файл или папку
                put = comand.split("  ")[1];
                ima = comand.split("  ")[2];
                File file = new File(put, ima);
                if (file.delete()) {
                    System.out.println("Fail " + ima + " ydalen");
                } else {
                    System.out.println("Osibka");
                }
            } else if (comand.startsWith("delete r")) {
                //        delete r <путь> – удалить файл или папку (содержимое папки удаляется рекурсивно)
                put = comand.split("  ")[1];
                ima = comand.split("  ")[2];
                File folder = new File(put, ima);
                if (!folder.exists()) {
                    System.out.println("Takoi papki/faila nety");
                    break;
                }
                File copia = folder;
                while (true) {
                    File[] fails1 = folder.listFiles();
                    if (fails1 == null) {
                        break;
                    }
                    for (File file2 : fails1) {
                        if (file2.isDirectory()) {
                            folder = file2;
                            break;
                        } else {
                            file2.delete();
                            folder = copia;
                        }
                    }
                    if (folder.delete()) {
                        folder = copia;
                    }
                }
            } else if (comand.startsWith("rename")) {
                //        rename <старое_имя> <новое_имя> – переименовать файл или папку
                // rename  1  rrr
                ima1 = comand.split("  ")[1];
                ima2 = comand.split("  ")[2];
                File file = new File((ima1));
                if (!file.exists()) {
                    System.out.println("Takoi papki/faila nety");
                    break;
                } else {
                    File newFail = new File(ima2);
                    System.out.println(file.renameTo(newFail));
                }
            } else if (comand.startsWith("move")) {
                //        move <откуда> <куда> – переместить файл или папку
                put1 = comand.split("  ")[1];
                put2 = comand.split("  ")[2];
                File file = new File(put1);
                if (!file.exists()) {
                    System.out.println("Takoi papki/faila nety");
                    break;
                } else {
                    File newFail = new File(put2, file.getName());
                    System.out.println(file.renameTo(newFail));
                }
            } else if (comand.startsWith("list")) {
                //        list <путь> – вывести содержимое папки (файлы и папки)
                put = comand.split("  ")[1];
                File folder = new File(put);
                if (!folder.exists()) {
                    System.out.println("Takoi papki/faila nety");
                    break;
                }
                while (true) {
                    File[] fails1 = folder.listFiles();
                    if (fails1 == null) {
                        break;
                    }
                    for (File file2 : fails1) {
                        System.out.println(file2.getName());
                    }
                    break;
                }
            } else if (comand.startsWith("size")) {
                //        size <путь> – вывести размер файла или папки (считая размер всех вложенных файлов)
                put = comand.split("  ")[1];
                File folder = new File(put);
                if (!folder.exists()) {
                    System.out.println("Takoi papki/faila nety");
                    break;
                }
                int saize = 0;
                while (true) {
                    File[] fails1 = folder.listFiles();
                    if (fails1 == null) {
                        break;
                    }
                    for (File file2 : fails1) {
                        saize += file2.length();
                    }
                    System.out.println(saize);
                    break;
                }
            } else if (comand.startsWith("sort")) {
                //        sort <путь> [name|size] – вывести содержимое папки с сортировкой по имени или размеру
                put1 = comand.split("  ")[1];
                put2 = comand.split("  ")[2];
                File folder = new File(put1);
                if (!folder.exists()) {
                    System.out.println("Takoi papki/faila nety");
                    break;
                }
                if (put2 == "name"){
                    while (true) {
                        File[] fails1 = folder.listFiles();
                        if (fails1 == null) {
                            break;
                        }
                        TreeSet<String> arr1 = new TreeSet<>();
                        for (File file2 : fails1) {
                            arr1.add(file2.getName());
                        }
                        for (String file:arr1) {
                            System.out.println(file);
                        }
                        break;
                    }
                }else {
                    while (true) {
                        File[] fails1 = folder.listFiles();
                        if (fails1 == null) {
                            break;
                        }
                        TreeSet <String> arr2 = new TreeSet<>();
                        for (File file2 : fails1) {
                            arr2.add(file2.getName());
                        }
                        for (String file:arr2) {
                            System.out.println(file);
                        }
                        break;
                    }
                }
            } else if (comand.startsWith("exit")) {
                System.out.println("Dыход из программы");
                break;
            } else {
                System.out.println("Takoi komandi net");
            }
        } while (true);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.Start();
    }
}