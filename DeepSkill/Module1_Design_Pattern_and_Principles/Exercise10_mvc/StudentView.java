package JavaFSE.DeepsKilling.Module1_Design_Patterns_and_Principles.Exercise10_mvc;

public class StudentView {

    public void displayStudentDetails(String name, int id, String grade) {

        System.out.println("Student Details");
        System.out.println("----------------");
        System.out.println("Name  : " + name);
        System.out.println("ID    : " + id);
        System.out.println("Grade : " + grade);
    }
}