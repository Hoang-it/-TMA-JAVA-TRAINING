package Ex3;

public class Tomcat extends Cat {
    public Tomcat(int age, String name) {
        super(age, name, "male");
    }

    @Override
    public void sound() {
        System.out.println("Mewmewmew");
    }

    @Override
    public String toString() {
        return "Tomcat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
