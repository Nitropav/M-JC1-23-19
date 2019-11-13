package homework6;

import java.util.Date;

public class Massege {
    private String massege;
    private final User user;
    private Date date;

    public String getMassege() {
        return massege;
    }

    public User getUser() {
        return user;
    }

    public Date getDate() {
        return date;
    }

    public void setMassege(String massege) {
        this.massege = massege;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Massege(String massege, User user, Date date){
        this.massege = massege;
        this.user = user;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Massege{" +
                "massege='" + massege + '\'' +
                ", user=" + user +
                ", date=" + date +
                '}';
    }
}
