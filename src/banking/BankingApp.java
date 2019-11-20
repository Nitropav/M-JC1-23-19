package banking;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BankingApp{
    static Random rnd = new Random();

    static Queue<String> namesOfBank = new ConcurrentLinkedQueue<String>(){{
        add("Идея Банк");
        add("Банк БелВЭБ");
        add("Банк Решение");
        add("Банк Дабрабыт");
        add("Абсолютбанк");
        add("Альфа-Банк");
        add("БПС-Сбербанк");
        add("БСБ Банк (БелСвиссБанк)");
        add("БТА Банк");
        add("ВТБ Беларусь");
        add("БелГазпромБанк");
        add("БелАгроПромБанк");
        add("БеларусБанк");
        add("БелИнвестБанк");
        add("Белорусский Банк Малого Бизнеса");
        add("Белорусский Народный Банк");
        add("РРБ-Банк");
        add("ИнтерПэйБанк");
        add("Паритетбанк");
        add("Национальный Банк Республики Беларусь");
        add("ПриорБанк");
        add("МТБанк");
        add("Статусбанк (ЕвроТоргИнвестБанк)");
        add("ФрансаБанк");
        add("ТК Банк");
        add("Хоум Кредит Банк");
        add("ТехноБанк");
        add("ЕвроБанк");
        add("Дельта Банк");
        add("Цептер Банк");
    }};

    static List<String> names = new ArrayList<>(){{
        add("Аарон");
        add("Абрам");
        add("Аваз");
        add("Августин");
        add("Авраам");
        add("Агап");
        add("Агапит");
        add("Агат");
        add("Агафон");
        add("Адам");
        add("Адриан");
        add("Азамат");
        add("Азат");
        add("Азиз");
        add("Айдар");
        add("Айрат");
        add("Акакий");
        add("Аким");
        add("Алан");
        add("Александр");
        add("Алексей");
        add("Али");
        add("Алик");
        add("Алим");
        add("Алихан");
        add("Алишер");
        add("Алмаз");
        add("Альберт");
        add("Амир");
        add("Амирам");
        add("Анар");
        add("Анастасий");
        add("Анатолий");
        add("Анвар");
        add("Ангел");
        add("Андрей");
        add("Анзор");
        add("Антон");
        add("Анфим");
        add("Арам");
        add("Аристарх");
        add("Аркадий");
        add("Арман");
        add("Армен");
        add("Арсен");
        add("Арсений");
        add("Арслан");
        add("Артём");
        add("Артемий");
        add("Артур");
        add("Архип");
        add("Аскар");
        add("Асхан");
        add("Асхат");
        add("Ахмет");
        add("Ашот");
    }};

    public final static List<Person> peoples = Stream.generate(() -> {
        return new Person("MP" + rnd.nextInt(), names.get(rnd.nextInt(names.size())));
    })
            .limit(10_00)
            .collect(Collectors.toList());

    public final static List<Bank> banks = Stream.generate(() -> {
        return new Bank(namesOfBank.poll());
    })
            .limit(namesOfBank.size())
            .collect(Collectors.toList());

    public static void main(String[] args) throws IOException {
        ExecutorService executor = Executors.newCachedThreadPool();

        peoples.stream()
                .filter(p -> rnd.nextBoolean())
                .forEach(p -> {
                    int countCreate = rnd.nextInt(20) + 1;
                    for (int i = 0; i < countCreate; i++) {
                        Bank bank = banks.get(rnd.nextInt(banks.size()));
                        bank.createAccountForPerson(p, rnd.nextDouble() * (rnd.nextInt(10_000) + 10), randomCurrency());
                    }
                });

        SaveOfFile.writeFileBank();
        SaveOfFile.writeFilePeoples();
        for (int i = 0; i < 4; i++) {
            executor.execute(new TransferThread( randomAccount(peoples), randomAccount(peoples), banks.get(rnd.nextInt(banks.size()))));
        }
        executor.shutdown();

        while (true){
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static Currency randomCurrency(){
        Currency currency;
        int a = rnd.nextInt(3);
        switch (a){
            case 0:
                currency = Currency.BYN;
                break;
            case 1:
                currency = Currency.USD;
                break;
            case 2:
                currency = Currency.EUR;
                break;
            case 3:
                currency = Currency.RUB;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + a);
        }
        return currency;
    }

    public static Account randomAccount(List<Person> peoples) {
        Person rndPerson = peoples.get(rnd.nextInt(peoples.size()));
        while (rndPerson.getAccounts().size() < 1) {
            rndPerson = peoples.get(rnd.nextInt(peoples.size()));
        }
        Account rndAccount = rndPerson.getAccounts().get(rnd.nextInt(rndPerson.getAccounts().size()));
        return rndAccount;
    }

    private static class TransferThread implements Runnable{
        private final Account account1;
        private final Account account2;
        private final Bank bank;

        private TransferThread(Account account1, Account account2, Bank bank) {
            this.account1 = account1;
            this.account2 = account2;
            this.bank = bank;
        }

        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()){
                Account acc1 = rnd.nextBoolean() ? account1 : account2;
                Account acc2 = acc1.equals(account1) ? account2 : account1;

                bank.transfer(acc1, acc2, rnd.nextDouble());
            }
        }
    }
}