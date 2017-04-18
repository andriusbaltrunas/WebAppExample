package vo;

/**
 * Created by andriusbaltrunas on 4/18/2017.
 */
public class Cat {
    private String name;
    private String kind;
    private int age;
    private double weight;
    private boolean isItLikeMilk;

    public Cat(String name, String kind, int age, double weight, boolean isItLikeMilk) {
        this.name = name;
        this.kind = kind;
        this.age = age;
        this.weight = weight;
        this.isItLikeMilk = isItLikeMilk;
    }

    public String getName() {
        return name;
    }

    public String getKind() {
        return kind;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isItLikeMilk() {
        return isItLikeMilk;
    }
}
