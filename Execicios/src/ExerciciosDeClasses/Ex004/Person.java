package ExerciciosDeClasses.Ex004;

public class Person {
    private String name;
    private int age;
    private double height;
    private double weight;

    public Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void celebrateBirthday() {
        this.setAge(this.getAge() + 1);

        if (age > 21) {
            this.setHeight(this.getHeight() + 0.5);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}