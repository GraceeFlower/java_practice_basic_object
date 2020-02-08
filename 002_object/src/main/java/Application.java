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

        Teacher teacher = new Teacher();
        teacher.setName("张龙");
        ArrayList<Student> studentsList = new ArrayList<>();
        Student wangQi = new Student("王其", 21, "男");
        studentsList.add(liLy);
        studentsList.add(wangQi);
        teacher.setManageStudentsList(studentsList);
        Student zhaoYi = new Student("赵毅", 22, "男");
        studentsList.add(zhaoYi);
        teacher.setManageStudentsList(studentsList);

        System.out.println("\n-- ZhangLong's Students list --");
        for (Student i: teacher.getManageStudentsList()) {
            System.out.println(i.getName() + "，"
                + i.getAge() + "，" + i.getSex());
        }
    }
}
