package de.telran;

import java.util.Date;
import java.util.List;

/**
 * Representative the person from real world with name and birthday
 * {@link String}
 */
public class Person {
    public Person(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    String name;
    Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * Процесс празднования дня рождения
     * @param people - люди пришедшие на др
     * @throws Exception - если пришел налл то тогда невалидно
     */
    public void selebrateBirhtday(List<Person> people) throws Exception {
        if (people == null) {
            throw new Exception("there are no people on birthday");
        }
        for (Person person : people) {
            person.givePresentTo(this);
        }

    }

    private void givePresentTo(Person person) {
        System.out.println("give present to "+ person.name);
    }
}
