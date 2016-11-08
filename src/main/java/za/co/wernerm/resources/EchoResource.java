package za.co.wernerm.resources;

import za.co.wernerm.api.EchoEntity;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by bbdnet1339 on 2016/11/02.
 *
 */
@Path("/echo")
@Produces(MediaType.APPLICATION_XML)
@Consumes(MediaType.APPLICATION_XML)
public class EchoResource {
    private EchoEntity echoEntity;

    public EchoResource(){
        echoEntity = new EchoEntity();
        echoEntity.setContent("no seed has been supplied");
    }

    @GET
    public EchoEntity get() {
      return echoEntity;
    }

    @POST
    public Response post(EchoEntity echoEntity){
        this.echoEntity = echoEntity;
        return Response.ok().build();
    }

}
