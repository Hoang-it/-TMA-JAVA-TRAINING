package ex3;

public class Frog extends Animal{
    public Frog(int age, String name, String sex) {
        super(age, name, sex);
    }

    @Override
    public void sound() {
        System.out.println("Owp Owp");
    }

    @Override
    public String toString() {
        return "Frog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
