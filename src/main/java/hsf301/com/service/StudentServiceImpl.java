package hsf301.com.service;

import hsf301.com.pojo.Student;
import hsf301.com.repository.StudentRepository;
import hsf301.com.repository.StudentRepositoryImpl;

import java.util.List;

public class StudentServiceImpl implements StudentSerivce{
    private StudentRepository iStudentRepo = null;

    public StudentServiceImpl(String fileName) {
        iStudentRepo = new StudentRepositoryImpl(fileName);
    }

    @Override
    public List<Student> findAll() {
        return iStudentRepo.findAll();
    }

    @Override
    public void delete(int studentID) {
        iStudentRepo.delete(studentID);
    }

    @Override
    public Student findById(int studentID) {
        return iStudentRepo.findById(studentID);
    }

    @Override
    public void save(Student student) {
        iStudentRepo.save(student);
    }

    @Override
    public void update(Student student) {
        iStudentRepo.update(student);
    }
}
