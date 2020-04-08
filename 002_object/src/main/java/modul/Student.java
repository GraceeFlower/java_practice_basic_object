package modul;

public class Student {

    private String name;
    private int age;
    private String sex;

    public Student(String name, int age, String sex) {
      this.name = name;
      this.age = age;
      this.sex = sex;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age + "岁";
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void Study() {
          System.out.println("I love studying!");
    }

    public void Rest() {
          System.out.println("I always listen to music for rest.");
    }

    @Override
    public String toString() {
        return "Student{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", sex='" + sex + '\'' +
            '}';
    }
}
