package pl.codegym.task.task15.task1521;

public class Tree {
    public static int globalNumber;
    public int number;

    public Tree() {

        this.number = ++globalNumber;
    }

    public void info(Object s) {
        System.out.println(String.format("Drzewo nr %d , metoda Object, parametr: %s", number, s.getClass().getSimpleName()));
    }

    public void info(Number s) {
        System.out.println(String.format("Drzewo nr %d , metoda Number, parametr: %s", number, s.getClass().getSimpleName()));
    }

    public void info(String s) {
        System.out.println(String.format("Drzewo nr %d , metoda String, parametr: %s", number, s.getClass().getSimpleName()));
    }
}
