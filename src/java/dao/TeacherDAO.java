package dao;

import entity.Teacher;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class TeacherDAO implements TeacherDAOInterface {

    @PersistenceContext
    EntityManager em;

    @Override
    public void addTeacher(Teacher t) {
        em.persist(t);
    }

    @Override
    public void editTeacher(Teacher t) {
        em.merge(t);
    }

    @Override
    public void removeTeacher(int id) {

        em.remove(em.find(Teacher.class, id));

    }

    @Override
    public Teacher findById(int id) {
        return em.find(Teacher.class, id);
    }

    @Override
    public List<Teacher> getAllTeacher() {

        return em.createQuery("SELECT t FROM Teacher t").getResultList();
    }
}
