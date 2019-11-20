package banking;

import java.util.*;

import static banking.BankingApp.peoples;

public class Bank implements IBank {
    private final String name;
    private Map<Person, List<Account>> data = new HashMap<>();

    public String getName() {
        return name;
    }

    public Bank(String name) {
        this.name = name;
    }

    public void addClient(Person p) throws IllegalArgumentException {
        if (!data.containsKey(p)) {
            data.put(p, new ArrayList<>());
        } else {
            throw new IllegalArgumentException("Клиент уже имеет счета в банке");
        }
    }

    public Account createAccountForPerson(Person p, double startAmount, Currency currency) {
        Account account = new Account(UUID.randomUUID().toString(), startAmount, currency);
        addAccount(p, account);
        return account;
    }

    public void addAccount(Person person, Account account) throws IllegalArgumentException {
        try {
            this.addClient(person);
        } catch (IllegalArgumentException e) {
        }
        ArrayList<Account> accounts = (ArrayList<Account>) this.data.get(person);
        accounts.add(account);
        person.setAccounts(accounts);
    }

    public void delClient(Person person) throws IllegalStateException {
        if (!data.containsKey(person)) {
            throw new IllegalArgumentException(String.format("Нет счетов в банке ", this.name));
        } else {
            double balance = 0;
            for (Account account : person.getAccounts()) {
                balance = account.getBalance();
            }
            if (balance > 0) {
                System.out.println("У клиента " + person.getName() + " остались деньги на счету");
            } else {
                data.remove(person);
                System.out.println("Клиет " + person.getName() + " удален");
            }
        }
    }

    public void transfer(final Account from, final Account to, double sum) {
        Person person = getPersonID(from.getId());
        synchronized (from) {
            synchronized (to) {
                for (int i = 0; i < 13; i++) {
                    if (from.getBalance() > sum) {
                        from.withdraw(sum);
                        to.deposit(sum);
                        System.out.println("=====================");
                        System.out.println("Баланс аккаунта отправителя: " + from.getBalance() + " " + from.getCurrency());
                        System.out.println("Баланс аккаунта получателя: " + to.getBalance() + " " + from.getCurrency());
                        System.out.println("Сумма для перевода: " + convert(from, to, sum) + " " + from.getCurrency());
                        System.out.println("AVG: " + (from.getBalance() + to.getBalance()) / 2 + " " + from.getCurrency());
                        System.out.println(this.toString());
                        break;
                    } else {
                        for (Account account : person.getAccounts()) {
                            if (account.getBalance() >= sum) {
                                System.out.println("Был использован другой аккаунт отправителя, т.к. на " + " выбранном аккаунте недостаточно средств");
                                from.withdraw(sum);
                                to.deposit(sum);
                                System.out.println("=====================");
                                System.out.println("Баланс аккаунта отправителя: " + from.getBalance() + " " + from.getCurrency());
                                System.out.println("Баланс аккаунта получателя: " + to.getBalance() + " " + from.getCurrency());
                                System.out.println("Сумма для перевода: " + convert(from, to, sum) + " " + from.getCurrency());
                                System.out.println("AVG: " + (from.getBalance() + to.getBalance()) / 2 + " " + from.getCurrency());
                                System.out.println(this.toString());
                                break;
                            }
                        }
                    }
                    throw new IllegalArgumentException("Недостаточно средств");
                }
            }
        }

    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                '}';
    }

    public static Person getPersonID(String id) {
        for (Person person : peoples) {
            for (Account account : person.getAccounts()) {
                if (account.getId().equalsIgnoreCase(id)) {
                    return person;
                }
            }
        }
        throw new IllegalArgumentException("Не найден id");
    }

    public static double convert(Account from, Account to, double sum) {
        double result = 0;
        if (to.getCurrency().equals(Currency.BYN)) {
            switch (to.getCurrency()) {
                case BYN:
                    result = sum;
                    return result;
                case USD:
                    result = sum / 2.07;
                    return result;
                case EUR:
                    result = sum / 2.45;
                    return result;
                case RUB:
                    result = sum / 0.3;
            }
        } else if (to.getCurrency().equals(Currency.USD)) {
            switch (to.getCurrency()) {
                case USD:
                    result = sum;
                    return result;
                case EUR:
                    result = sum * 0.7;
                    return result;
                case BYN:
                    result = sum * 2.07;
                    return result;
                case RUB:
                    result = sum * 1.8;
                    return result;
            }
        } else if (to.getCurrency().equals(Currency.EUR)) {
            switch (to.getCurrency()) {
                case EUR:
                    result = sum;
                    return result;
                case USD:
                    result = sum / 0.25;
                    return result;
                case BYN:
                    result = sum * 2.67;
                    return result;
                case RUB:
                    result = sum * 2;
                    return result;
            }
        }else {
            switch (to.getCurrency()){
                case RUB:
                    result = sum;
                    return result;
                case BYN:
                    result = sum * 0.34;
                    return result;
                case EUR:
                    result = sum * 2;
                    return result;
                case USD:
                    result = sum * 1.8;
                    return result;
            }
        }
        throw new IllegalArgumentException("Невозможно произвести конвертацию");
    }
}
