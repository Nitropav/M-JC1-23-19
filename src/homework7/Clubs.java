package homework7;

public class Clubs {
    private String name;
    private int createYear;
    private int countPlayer;

    public Clubs(String name, int createYear, int countPlayer){
        this.name = name;
        this.createYear = createYear;
        this.countPlayer = countPlayer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreateYear() {
        return createYear;
    }

    public void setCreateYear(int createYear) {
        this.createYear = createYear;
    }

    public int getCountPlayer() {
        return countPlayer;
    }

    public void setCountPlayer(int countPlayer) {
        this.countPlayer = countPlayer;
    }

    public int compareTo(Clubs clubs){
        if(this.getCountPlayer() > clubs.getCountPlayer()){
            return 1;
        }
        if (this.getCountPlayer() < clubs.getCountPlayer()){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Clubs{" +
                "name='" + name + '\'' +
                ", createYear=" + createYear +
                ", countPlayer=" + countPlayer +
                '}';
    }
}
