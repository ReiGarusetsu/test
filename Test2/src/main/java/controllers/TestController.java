package controllers;

import dto.UserDto;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.awt.*;

@Path("/resources")
public class TestController {


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String checkGet(){
        return "you called get method";
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getHello(@PathParam("id") long id){
        return Response.ok().entity("you sent " + id).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response checkPost(@QueryParam("user") String userName){
        return Response.ok().entity("Hello " + userName).build();
    }

    @POST
    @Path("/checkJsonBody")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response checkPost(UserDto user){
        return Response.ok().entity("Hello " + user.toString()).build();
    }
}
