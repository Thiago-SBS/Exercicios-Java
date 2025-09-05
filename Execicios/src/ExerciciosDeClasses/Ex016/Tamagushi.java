package ExerciciosDeClasses.Ex016;

public class Tamagushi {
    private String name;
    private int hunger;
    private int health;
    private int age;
    private int boredom;

    public Tamagushi(String name, int hunger, int health, int age) {
        this.name = name;
        this.hunger = hunger;
        this.health = health;
        this.age = age;
    }

    public void toFeed(int quantidade) {
        hunger -= quantidade;
        if (hunger < 0) hunger = 0;
        System.out.println(name + " comeu " + quantidade + " de comida. Fome agora: " + hunger);
    }

    public void play(int time) {
        boredom -= time;
        health += time / 2;
        if (boredom < 0) boredom = 0;
        if (health > 10) health = 10;
        System.out.println(name + " brincou por " + time + " minutos. Tédio agora: " + boredom + ", Saúde agora: " + health);
    }

    public void status() {
        System.out.println("Nome: " + name + ", Humor: " + getHumor());
    }

    @Override
    public String toString() {
        return "Tamagushi{" + "name='" + name + '\'' + ", hunger=" + hunger + ", health=" + health + ", age=" + age + ", boredom=" + boredom + '}';
    }

    public int getHumor() {
        return (health + (10 - hunger) + (10 - boredom)) / 3;
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