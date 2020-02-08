import modul.Student;

public class Application {

    public static void main(String[] args) {
        Student liLy = new Student("李莉", 20, "女");

        System.out.println(liLy.getName());
        System.out.println(liLy.getAge());
        System.out.println(liLy.getSex());
        liLy.Study();
        liLy.Rest();
    }
}
