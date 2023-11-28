package org.example;
// Конкретный игрок
public class ConcretePlayer implements Player{
    private String name;
    private int age;
    private String gender;
    private String sport;

    public ConcretePlayer(String name, String gender, int age, String sport) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.sport = sport;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getSport() {
        return sport;
    }
}
