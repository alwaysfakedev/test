package by.owm.rest;

import com.mongodb.BasicDBObject;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by haria on 17.10.2015.
 */

@Component
@Path("/auth")
public class AuthController {

//    @Autowired
//    private DataService dataService;

    //TODO:refactor code
    @POST
    @Path("/autenticate")
    public Response login(String jsonData)
    {
        JSONObject jsonObject = null;
        Response response;
        boolean result = false;

        try {
            jsonObject = new JSONObject(jsonData);
        }
        catch (JSONException e) {

            e.printStackTrace();
        }

        if(jsonObject != null)
        {
            String login = null;
            String password = null;

            try {
                login = jsonObject.getString("login");
                password = jsonObject.getString("password");
            } catch (JSONException e) {
                e.printStackTrace();
            }

            if(login != null && password != null) {
//                result = dataService.logIn(login, password);
            }
            else
            {
                response = Response.status(Response.Status.NO_CONTENT).build();
            }

        }
        else
        {
            response = Response.status(Response.Status.NO_CONTENT).build();
        }
        if(result) {
            response = Response.ok(new BasicDBObject()).build();
        }
        else {
            response = Response.status(Response.Status.NO_CONTENT).build();
        }
        return response;
    }
}
