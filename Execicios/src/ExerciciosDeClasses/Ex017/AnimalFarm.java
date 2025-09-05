package ExerciciosDeClasses.Ex017;

public class AnimalFarm {
    private String name;
    private int hunger;
    private int boredom;

    public AnimalFarm(String name, int hunger, int boredom) {
        this.name = name;
        this.hunger = hunger;
        this.boredom = boredom;
    }

    public void toFeed(int amount) {
        hunger -= amount;
        if (hunger < 0) hunger = 0;
    }

    public void play(int time) {
        boredom -= time;
        if (boredom < 0) boredom = 0;
    }

    public int getHumor() {
        return (10 - hunger + 10 - boredom) / 2;
    }

    public void status() {
        System.out.println(name + " diz: Meu humor é " + getHumor() + " | Fome: " + hunger + " | Tédio: " + boredom);
    }
}