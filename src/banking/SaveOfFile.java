package banking;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import static banking.BankingApp.banks;
import static banking.BankingApp.peoples;

public class SaveOfFile {
    public static void writeFileBank() throws IOException {
        try(FileOutputStream fileOutputStream = new FileOutputStream("infoBank.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)){
            for (Bank bank : banks) {
                objectOutputStream.writeObject(bank.toString());
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void writeFilePeoples(){
        try(FileOutputStream fileOutputStream = new FileOutputStream("infoPerson.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)){
            for (Person person : peoples) {
                objectOutputStream.writeObject(person.toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
