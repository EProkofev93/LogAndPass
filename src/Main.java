import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String trueName = "admin";
        String truePass = "sinhrofazatron";
        System.out.print("Введите имя пользователя: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        if (!name.equals(trueName)) {
            while (!name.equals(trueName)) {
                System.out.println("Пользователь с таким именем не найден.");
                System.out.print("Введите имя пользователя: ");
                scan = new Scanner(System.in);
                name = scan.nextLine();
            }
            if (name.equals(trueName)) {
                System.out.print("Введите пароль: ");
                String pass = scan.nextLine();
                int i = pass.length();
                if (i < 8) {
                    System.out.println("пароль должен быть больше 8 символов");
                }
                if (i > 15) {
                    System.out.println("пароль должен быть не более 15 символов");
                }
                while (!pass.equals(truePass)) {
                    System.out.println("Неверный пароль.");
                    System.out.print("Введите пароль: ");
                    scan = new Scanner(System.in);
                    pass = scan.nextLine();
                    i = pass.length();
                    if (i < 8) {
                        System.out.println("пароль должен быть больше 8 символов");
                    }
                    if (i > 15) {
                        System.out.println("пароль должен быть не более 15 символов");
                    }

                }

                System.out.println("Добро пожаловать! Ваше Имя: " + name + " Ваш пароль: " + pass);
            }
        }
    }
}












