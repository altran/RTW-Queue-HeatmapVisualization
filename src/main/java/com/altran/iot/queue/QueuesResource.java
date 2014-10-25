package com.altran.iot.queue;

import com.altran.iot.helper.PropertiesHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.Properties;

/**
 * @author <a href="mailto:bard.lind@gmail.com">Bard Lind</a>
 */
@RequestMapping("/")
@RestController
public class QueuesResource {
    private static final Logger log = LoggerFactory.getLogger(QueuesResource.class);

    public QueuesResource() throws IOException {
        Properties properties = PropertiesHelper.findProperties();
        //uibUrl = properties.getProperty("useridentitybackend");
        //httpClient = new HttpClient(new MultiThreadedHttpConnectionManager());

        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:9998").path("resource");
    }

    /*
    @GET
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    @RequestMapping(value = "/users/find/{query}", method = RequestMethod.GET)
    public String findUsers(@PathVariable("apptokenid") String apptokenid, @PathVariable("usertokenid") String usertokenid, @PathVariable("query") String query, HttpServletRequest request, HttpServletResponse response, Model model) {
        logger.trace("Finding users with query: " + query);
        HttpMethod method = new GetMethod();
        String url = getUibUrl(apptokenid, usertokenid, "users/find/"+query);
        makeUibRequest(method, url, model, response);
        return "json";
    }
    */

    @GET
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    @RequestMapping(value = "queues", method = RequestMethod.GET)
    public Queue findQueues( HttpServletRequest request, HttpServletResponse response, Model model) {
        log.trace("findQueues");
        return new Queue("1",2);
    }
}
