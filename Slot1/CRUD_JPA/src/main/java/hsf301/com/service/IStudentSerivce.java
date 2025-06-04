package hsf301.com.service;
import hsf301.com.pojo.Student;
import java.util.List;

public interface IStudentSerivce {

    public List<Student> findAll();
    public void save(Student student);
    public void delete(int studentID);
    public Student findById(int student);
    public void update(int id, Student student);
}