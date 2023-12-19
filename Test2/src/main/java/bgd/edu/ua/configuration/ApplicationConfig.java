package bgd.edu.ua.configuration;


import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/webapi/*")
public class ApplicationConfig extends ResourceConfig {
}
