package ex3;

public class Dog extends Animal{
    public Dog(int age, String name, String sex) {
        super(age, name, sex);
    }

    @Override
    public void sound() {
        System.out.println("Gow");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
