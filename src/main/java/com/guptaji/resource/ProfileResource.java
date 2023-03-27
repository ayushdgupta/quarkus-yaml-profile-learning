package com.guptaji.resource;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/profileDemo")
public class ProfileResource {

    @ConfigProperty(name = "ayush.property", defaultValue = "baniya")
    public String property;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response getProfileData(){
        return Response.ok(property).build();
    }
}
