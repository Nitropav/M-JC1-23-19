package homework6;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Scanner;

public class Messenger {
    private static String mes1;
    private static String mes2;

    /**
     * 1. Вводить ник
     * 1.1 Должен быть только латинскими буквами
     * 1.2 Должен быть не меньше 5 симвлов
     * 1.3 Не должен начинаться с цифры
     * 1.4 Не должен содержать #,.\
     * 2. Сообщения вводится через консоль
     * 3. Сообщения хранятся в массиве
     * 4. Можно отредактировать свои сообщения если они не старше минуты
     * 5. Можно писать отложенные сообщения
     **/


    public static User getValidUser() {
        User user = null;
        boolean flag = false;
        do {
            System.out.println("Введите логин и пароль: ");
            Scanner in = new Scanner(System.in);
            System.out.println("логин");
            String name = in.nextLine();
            System.out.println("пароль");
            String password = in.nextLine();
            user = new User(name, password);
            flag = ValidateUser.checkUser(user);
            if (!flag) {
                System.out.println("Ваш пользователь невалиден");
            }
        } while (!flag);
        return user;
    }

    public static void main(String[] args) {

        User user1 = getValidUser();

        User user2 = getValidUser();

        Scanner scanner = new Scanner(System.in);
        Dialogs dialogs = new Dialogs();
        while (true){
            System.out.println(user1.getLogin() + " пишет ");
            mes1 = scanner.nextLine();
            if (mes1.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.println(user2.getLogin() + " пишет ");
            mes2 = scanner.nextLine();
            if (mes2.equalsIgnoreCase("exit")) {
                break;
            }
            dialogs.addMasseges(new Massege(mes1, user1, new Date()));
            dialogs.addMasseges(new Massege(mes2, user2, new Date()));
        }
        for (Massege massege : dialogs.getMasseges()) {
            System.out.println(massege.toString());
        }
    }
}

