///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package service;
//
//import dao.TeacherDAOInterface;
//import entity.Teacher;
//import java.util.ArrayList;
//import java.util.List;
//import static org.junit.Assert.assertEquals;
//import org.junit.Before;
//import org.junit.Test;
//
//public class DaoRestTest {
//
//    MockPairDAO mock;
//    DaoRest daoRest;
//
//    @Before
//    public void setUp() throws Exception {
//        mock = new MockPairDAO();
//        daoRest = new DaoRest();
//    }
//
//    @Test
//    public void testCreateTeacher() {
//
//        Teacher t = null;
//        mock.addTeacher(t);
//    }
//
//    @Test
//    public void testGetAll() throws Exception {
//        List<Teacher> list = daoRest.getAll();
//
//        assertEquals(new ArrayList<>(), list);
//
//        // TODO review the generated test code and remove the default call to fail.
//    }
//
////    /**
////     * Test of editTeacher method, of class DaoRest.
////     */
////    @Test
////    public void testEditTeacher() throws Exception {
////        System.out.println("editTeacher");
////        Teacher t = null;
////        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
////        DaoRest instance = (DaoRest) container.getContext().lookup("java:global/classes/DaoRest");
////        instance.editTeacher(t);
////        container.close();
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of removeTeacher method, of class DaoRest.
////     */
////    @Test
////    public void testRemoveTeacher() throws Exception {
////        System.out.println("removeTeacher");
////        Long id = null;
////        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
////        DaoRest instance = (DaoRest) container.getContext().lookup("java:global/classes/DaoRest");
////        instance.removeTeacher(id);
////        container.close();
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
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
//        public List<Teacher> getAllTeacher() {
//            List<Teacher> list = new ArrayList<>();
//            return list;
//        }
//
//    }
//
//}
