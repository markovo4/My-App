package app;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private String profession;
    private final int id;
    private static int personCount;



    public Person( String name, int age, String profession ) {
        this.name = name;
        this.age = age;
        this.profession = profession;
        this.id = personCount++;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getProfession() {
        return this.profession;
    }

    public boolean setAge(int age) {
        if(age <= 0 || age > 100) return false;

        this.age = age;
        return true;
    }

    public boolean setProfession(String profession) {
        if(profession.isBlank()) return false;

        this.profession = profession;
        return true;
    }

    public boolean setName(String name) {
        if(name.isBlank()) return false;

        this.name = name;
        return true;
    }

    @Override
    public String toString() {
        return this.id + ". Name: " + this.name + ", Age: " + this.age + ", Profession: " + this.profession;
    }

}
