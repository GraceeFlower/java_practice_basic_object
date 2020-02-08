import modul.Student;
import modul.Teacher;
import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
        Student liLy = new Student("李莉", 20, "女");

        System.out.println("-- Lily's Information --");
        System.out.println(liLy.getName() + ","
            + liLy.getAge() + "," + liLy.getSex());
        liLy.Study();
        liLy.Rest();

        ArrayList<Student> studentsList = new ArrayList<>();
        Student wangQi = new Student("王其", 21, "男");
        studentsList.add(liLy);
        studentsList.add(wangQi);
        Teacher teacher = new Teacher("张龙", studentsList);
        Student zhaoYi = new Student("赵毅", 22, "男");
        teacher.addStudent(zhaoYi);

        System.out.println("\n-- " + teacher.getName()+ "的管理学生信息 --");
        for (Student i: teacher.getManageStudentsList()) {
            System.out.println(i.getName() + "，"
                + i.getAge() + "，" + i.getSex());
        }
    }
}
