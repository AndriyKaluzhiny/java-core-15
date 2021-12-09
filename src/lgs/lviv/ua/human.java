package lgs.lviv.ua;

public class human {
    String name;
    int age;

    human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
