package hsf301.com.main;

import hsf301.com.pojo.Student;
import hsf301.com.service.IStudentServiceImpl;

public class Main {
    public static void main(String[] args) {
        String fileName= "JPAs";
        IStudentServiceImpl studentService = new IStudentServiceImpl(fileName);
        Student student1 = new Student("Lam", "Nguyen", 9);
        Student stuUpd = new Student("asd", "temp", 0);
        Student student2 = new Student("Liem", "Huynh", 8);
        Student student3 = new Student("Van", "Ngoc", 10);
        Student student4 = new Student("Dong", "Nguyen", 7);
        Student student5 = new Student("Chau", "Hoang", 9);
        Student student6 = new Student("Khanh", "Nguyen", 8);
        studentService.save(student1);
        studentService.save(student2);
        studentService.save(student3);
        studentService.save(student4);
        studentService.save(student5);
        studentService.save(student6);
        System.out.println("\nAll Students:"+studentService.findAll().toString());
        System.out.println("\nFind Student by ID 5: " + studentService.findById(5).toString());

//        for (int i = 1; i <= 6; i++) {
//            studentService.update(i, stuUpd);
//        }
        for (int i = 1; i <= 6; i++) {
            studentService.delete(i);
        }
    }
}