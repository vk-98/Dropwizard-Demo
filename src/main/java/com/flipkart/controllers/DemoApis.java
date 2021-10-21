package com.flipkart.controllers;

import com.flipkart.beans.PostRequestObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/demo")
public class DemoApis {
    Logger logger = LoggerFactory.getLogger(DemoApis.class);

    @Path("/get")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String get() {
        logger.info("Get Route Called");
        return "Get Endpoint";
    }

    @Path("/post")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String post(@NotNull PostRequestObject requestObject) {
        logger.info("Post Endpoint with name : " + requestObject.getName());
        return "Post Endpoint";
    }

}
