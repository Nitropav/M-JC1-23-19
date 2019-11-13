package homework6;

import java.util.Arrays;

public class Dialogs {
    private Massege[] masseges = new Massege[0];

    public void addMasseges(Massege massege){
        this.addMasseges(new Massege[]{massege});
    }

    public void addMasseges(Massege[] masseges){
        if (masseges != null && masseges.length != 0){
            this.masseges = Arrays.copyOf(this.masseges, this.masseges.length + masseges.length);
            int massegeLength = masseges.length;
            for (Massege mes: masseges) {
                this.masseges[this.masseges.length - massegeLength--] = mes;
            }
        }
    }

    public Massege[] getMasseges() {
        return masseges;
    }
}
