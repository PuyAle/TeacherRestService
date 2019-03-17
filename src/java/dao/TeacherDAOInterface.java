package dao;

import entity.Teacher;
import java.util.List;

public interface TeacherDAOInterface {

    public Teacher findById(int id);

    public void addTeacher(Teacher t);

    public void editTeacher(Teacher t);

    public void removeTeacher(int id);

    public List<Teacher> getAllTeacher();
}
