///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package JUnitTest;
//
//import dao.TeacherDAOInterface;
//import entity.Teacher;
//import java.util.ArrayList;
//import java.util.List;
//import org.junit.Before;
//import org.junit.Test;
//import service.DaoRest;
//
//public class NewEmptyJUnitTest {
//
//    MockPairDAO mock;
//    DaoRest daoRest;
//    Teacher t;
//
//    @Before
//    public void setUp() {
//        mock = new MockPairDAO();
//        daoRest = new DaoRest();
//        t = new Teacher();
//    }
//
//    @Test
//    public void createTeacher() {
//        mock.addTeacher(t);
//
//    }
//
//    class MockPairDAO implements TeacherDAOInterface {
//
//        @Override
//        public void addTeacher(Teacher t) {
//
//        }
//
//        @Override
//        public void editTeacher(Teacher t) {
//
//        }
//
//        @Override
//        public void removeTeacher(Long id) {
//
//        }
//
//        @Override
//        public Teacher findById(Long id) {
//
//            if (t.getId().equals(id)) {
//                return t;
//            } else {
//                return null;
//            }
//
//        }
//
//        @Override
//        public List<Teacher> getAllTeacher() {
//            List<Teacher> list = new ArrayList<>();
//            return list;
//        }
//
//    }
//}
