package ExerciciosDeClasses.Ex008;

import java.util.ArrayList;
import java.util.List;

public class Monkey {
    private String name;
    private List<String> stomach;

    public Monkey(String name) {
        this.name = name;
        this.stomach = new ArrayList<>();
    }

    public void eat(String food) {
        stomach.add(food);
        System.out.println(name + " comeu " + food);
    }

    public void showStomach() {
        if (stomach.isEmpty()) {
            System.out.println(name + " está com o estômago vazio.");
        } else {
            System.out.println("Estômago de " + name + ": " + stomach);
        }
    }

    public void digest() {
        if (stomach.isEmpty()) {
            System.out.println(name + " não tem nada para digerir.");
        } else {
            String removed = stomach.remove(0);
            System.out.println(name + " digeriu " + removed);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}