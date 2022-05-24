package ex3;

public class Cat extends Animal{
    public Cat(int age, String name, String sex) {
        super(age, name, sex);
    }

    @Override
    public void sound() {
        System.out.println("Mew");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
