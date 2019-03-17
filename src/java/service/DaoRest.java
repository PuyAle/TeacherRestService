package service;

import dao.TeacherDAOInterface;
import entity.Teacher;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Stateless
@Path("entity.teacher")
public class DaoRest {

    @Inject
    TeacherDAOInterface tdao;

    @POST
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void createTeacher(Teacher t) {
        tdao.addTeacher(t);
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Teacher> getAll() {
        return tdao.getAllTeacher();
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Teacher getTeacher(@PathParam("id") Integer id) {
        return tdao.findById(id);
    }

    @PUT
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void editTeacher(Teacher t) {
        tdao.editTeacher(t);
    }

    @DELETE
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void removeTeacher(@PathParam("id") Integer id) {
        tdao.removeTeacher(id);
    }
}
