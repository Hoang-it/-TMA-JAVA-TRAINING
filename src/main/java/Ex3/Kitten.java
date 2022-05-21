package Ex3;

public class Kitten extends Cat{
    public Kitten(int age, String name) {
        super(age, name, "female");
    }

    @Override
    public void sound() {
        System.out.println("Mew mew");
    }

    @Override
    public String toString() {
        return "Kitten{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
