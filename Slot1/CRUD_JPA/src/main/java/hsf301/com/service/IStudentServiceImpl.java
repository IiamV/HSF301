package hsf301.com.service;

import hsf301.com.pojo.Student;
import hsf301.com.repository.IStudentRepository;
import hsf301.com.repository.IStudentRepositoryImpl;

import java.util.List;

public class IStudentServiceImpl implements IStudentSerivce {
    private IStudentRepository iStudentRepo = null;

    public IStudentServiceImpl(String fileName) {
        iStudentRepo = new IStudentRepositoryImpl(fileName);
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
    public void update(int id, Student student) {
        iStudentRepo.update(id, student);
    }
}
