// File: src/main/java/hsf301/com/dao/StudentDAO.java
package hsf301.com.dao;

import hsf301.com.pojo.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class StudentDAO {
    private EntityManagerFactory emf;

    public StudentDAO(String persistenceName) {
        emf = Persistence.createEntityManagerFactory(persistenceName);
    }

    public void save(Student student) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(student);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (em.getTransaction().isActive()) em.getTransaction().rollback();
            System.out.println("Error " + ex.getMessage());
        } finally {
            em.close();
        }
    }

    public List<Student> getStudents() {
        EntityManager em = emf.createEntityManager();
        List<Student> students = null;
        try {
            em.getTransaction().begin();
            students = em.createQuery("from Student", Student.class).getResultList();
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (em.getTransaction().isActive()) em.getTransaction().rollback();
            System.out.println("Error " + ex.getMessage());
        } finally {
            em.close();
        }
        return students;
    }

    public void delete(int studentID) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Student student = em.find(Student.class, studentID);
            if (student != null) {
                em.remove(student);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (em.getTransaction().isActive()) em.getTransaction().rollback();
            System.out.println("Error " + ex.getMessage());
        } finally {
            em.close();
        }
    }

    public Student findById(int studentID) {
        EntityManager em = emf.createEntityManager();
        Student student = null;
        try {
            em.getTransaction().begin();
            student = em.find(Student.class, studentID);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (em.getTransaction().isActive()) em.getTransaction().rollback();
            System.out.println("Error " + ex.getMessage());
        } finally {
            em.close();
        }
        return student;
    }

    public void updateStudent(int id, Student student) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Student s = em.find(Student.class, id);
            if (s != null) {
                s.setFirstName(student.getFirstName());
                s.setLastName(student.getLastName());
                s.setMarks(student.getMarks());
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (em.getTransaction().isActive()) em.getTransaction().rollback();
            System.out.println("Error " + ex.getMessage());
        } finally {
            em.close();
        }
    }
}