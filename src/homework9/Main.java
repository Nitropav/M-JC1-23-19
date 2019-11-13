package homework9;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    private static int id = 0;
    public static void main(String[] args) throws IOException{
        String[] arr = {"Аня", "Илья", "Никита", "Максим", "Владимир", "Кристина", "Валентина",
                "Николай", "Дмитрий", "Андрей", "Алексей", "Василий"};
        Map<Integer, Person> personStream = Stream.generate(() -> {
            id++;
            String name = arr[(int) (Math.random() * 11)];
            float score = (float) (Math.round((Math.random() * 10) * 100.0) / 100);
            return new Person(id, name, score);
        })
                .limit(10000)
                .collect(Collectors.toMap(Person::getId, p->p));
        List<String> topStudents = new ArrayList<>();
        personStream.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(new PersonComparatorValue().reversed()))
                .limit(100)
                .sorted(Map.Entry.comparingByValue(new PersonComparatorName()))
                .forEach(p -> topStudents.add(p.getValue().toString()));
        System.out.println(topStudents);

        File file = new File("D:/aaa.txt");

        try {
            FileWriter writer = new FileWriter(file, false);
            writer.write(String.valueOf(topStudents));
            writer.flush();
        }
        catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("----------------------------");

        try(FileReader reader = new FileReader("D:/aaa.txt"))
        {
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

}

