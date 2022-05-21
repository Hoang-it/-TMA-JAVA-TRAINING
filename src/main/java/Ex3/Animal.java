package Ex3;

public class Animal implements ISound{
    protected int age;
    protected String name;
    protected String sex;

    public Animal(int age, String name, String sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;

    }

    @Override
    public void sound() {

    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
