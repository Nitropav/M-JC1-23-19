package homework6;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;

public class Messenger {
    /**
     * 1. Вводить ник
     *  1.1 Должен быть только латинскими буквами
     *  1.2 Должен быть не меньше 5 симвлов
     *  1.3 Не должен начинаться с цифры
     *  1.4 Не должен содержать #,.\
     * 2. Сообщения вводится через консоль
     * 3. Сообщения хранятся в массиве
     * 4. Можно отредактировать свои сообщения если они не старше минуты
     * 5. Можно писать отложенные сообщения
     **/

    public static User getValidUser(){
        User user = null;
        boolean flag = false;
        do {
            user = new User("user1", "password1");
            flag = ValidateUser.checkUser(user);
            if(!flag){
                System.out.println("Ваш пользователь невалиден");
            }
        } while (!flag);
        return user;
    }

    public static void main(String[] args) {
        User user1 = getValidUser();
        User user2 = getValidUser();

        Dialogs dialogs = new Dialogs();
        dialogs.addMasseges(new Massege("aaaaa", user1, new Date()));
        dialogs.addMasseges(new Massege("wwwww", user2, new Date()));
        dialogs.addMasseges(new Massege("sssss", user1, new Date()));

        for (Massege massege:dialogs.getMasseges()) {
            System.out.println(massege.toString());
        }
    }
}
