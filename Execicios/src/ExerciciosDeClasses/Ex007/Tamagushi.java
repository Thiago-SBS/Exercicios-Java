package ExerciciosDeClasses.Ex007;

public class Tamagushi {
    private String name;
    private int hunger;
    private int health;
    private int age;

    public Tamagushi(String name, int hunger, int health, int age) {
        this.name = name;
        this.hunger = hunger;
        this.health = health;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getHunger() {
        return hunger;
    }

    public int getHealth() {
        return health;
    }

    public int getAge() {
        return age;
    }

    public int getMood() {
        return (health + (100 - hunger)) / 2;
    }
}