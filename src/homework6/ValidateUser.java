package homework6;


public class ValidateUser {
    //TODO Реализовать валидацию

    public static boolean checkUser(User user){
        if (user.getLogin().matches("^[^А-яЁё\\d!#\\\\].+[^А-яЁё\\d!#\\\\]{4,}")) {
            return false;
        } else {
            return true;
        }
    }
}
