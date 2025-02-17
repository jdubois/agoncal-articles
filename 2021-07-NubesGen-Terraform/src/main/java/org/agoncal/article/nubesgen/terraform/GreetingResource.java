package org.agoncal.article.nubesgen.terraform;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.time.Instant;

// tag::adocSnippet[]
@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello NubesGen " + Instant.now();
    }
}
// end::adocSnippet[]
