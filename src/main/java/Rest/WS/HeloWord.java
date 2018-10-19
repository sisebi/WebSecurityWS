/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rest.WS;

import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;


@Path("/helo")
//@PermitAll
public class HeloWord {
    
    @GET
    @Produces("text/plain")
    @Path("/")
    public String get(){
        return "Helo Word Eliezer !";
    }
    @RolesAllowed("admin")
    @GET
    @Produces("text/plain")
    @Path("/admin")    
    public String getAdmin(@Context SecurityContext securityContext){
        return "Helo Word Administrador !!!!"+securityContext.getUserPrincipal().getName();
    }
    @RolesAllowed("teste")
    @GET
    @Produces("text/plain")
    @Path("/zuca")    
    public String getTeste(@Context SecurityContext securityContext){
        return "Helo Word Zuquinha !!!!";
    }
    
}
