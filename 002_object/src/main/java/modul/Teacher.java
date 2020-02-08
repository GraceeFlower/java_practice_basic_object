package modul;

import java.util.ArrayList;

public class Teacher {

    String name;
    ArrayList<Student> manageStudentsList = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setManageStudentsList(ArrayList<Student> manageStudentsList) {
        this.manageStudentsList = manageStudentsList;
    }

    public ArrayList<Student> getManageStudentsList() {
        return manageStudentsList;
    }

}
