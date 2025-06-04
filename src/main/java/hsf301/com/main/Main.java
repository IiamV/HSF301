package hsf301.com.main;

import hsf301.com.pojo.Student;
import hsf301.com.service.StudentServiceImpl;

public class Main {
    public static void main(String[] args) {
        String fileName= "JPAs";
        IStudentService studentService = new StudentServiceImpl(fileName);
        Student student = new Student("Lam", "Nguyen", 9);
    }
}