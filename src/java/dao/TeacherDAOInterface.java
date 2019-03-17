package dao;

import entity.Teacher;
import java.util.List;

public interface TeacherDAOInterface {

    public Teacher findById(Long id);

    public void addTeacher(Teacher t);

    public void editTeacher(Teacher t);

    public void removeTeacher(Long id);

    public List<Teacher> getAllTeacher();
}
