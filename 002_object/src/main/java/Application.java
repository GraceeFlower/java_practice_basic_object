import modul.Student;
import modul.Teacher;
import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
        Student liLy = new Student("李莉", 20, "女");

        System.out.println("-- Lily's Information --");
        System.out.println(liLy);
        liLy.Study();
        liLy.Rest();
        
        ArrayList<Student> studentsList = new ArrayList<>();
        studentsList.add(liLy);
        studentsList.add(new Student("王其", 21, "男"));
        Teacher teacher = new Teacher("张龙", studentsList);
        teacher.addStudent(new Student("赵毅", 22, "男"));

        System.out.println("\n-- " + teacher.getName()+ "的管理学生信息 --");
        teacher.getManageStudentsList().forEach(System.out::println);
    }
}
