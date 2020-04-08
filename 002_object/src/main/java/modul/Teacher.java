package modul;

import java.util.ArrayList;

public class Teacher {

    private String name;
    private ArrayList<Student> manageStudentsList = new ArrayList<>();

    public Teacher(String name, ArrayList<Student> manageStudentsList) {
        this.name = name;
        this.manageStudentsList = manageStudentsList;
    }

    public Teacher() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student newStudent) {
        this.manageStudentsList.add(newStudent);
    }

    public void setManageStudentsList(ArrayList<Student> manageStudentsList) {
        this.manageStudentsList = manageStudentsList;
    }

    public ArrayList<Student> getManageStudentsList() {
        return manageStudentsList;
    }

}
