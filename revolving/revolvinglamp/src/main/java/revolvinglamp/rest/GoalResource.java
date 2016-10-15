/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revolvinglamp.rest;

import java.io.IOException;
import javax.ejb.Stateless;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.codehaus.jackson.map.JsonMappingException;
import revolvinglamp.GenericQueryClient;
import revolvinglamp.model.GoalPOJO;
import v2.service.generic.library.model.QueryResultPOJO;
import v2.service.generic.library.model.http.HttpResponsePOJO;
import v2.service.generic.library.utils.JsonUtil;

/**
 *
 * @author lxy
 */
@Stateless
@Path("goal")
public class GoalResource {

    @Path("add")
    @POST
    @Produces("application/json")
    public String insertAndUpdate(@FormParam("queryJson") String queryJson) throws JsonMappingException, IOException, Exception {
        System.out.println(queryJson);
        GoalPOJO goal = JsonUtil.toPojo(queryJson, GoalPOJO.class);

        HttpResponsePOJO pojo = GenericQueryClient.getGoal(goal);

        QueryResultPOJO queryResult = JsonUtil.toPojo(pojo.getBody(), QueryResultPOJO.class);

        if (queryResult == null || queryResult.getResult() == null || queryResult.getResult().isEmpty()) {
            //not in database
            pojo = GenericQueryClient.insertGoal(goal);
        } else {
            //already in database, just update
            GoalPOJO po = JsonUtil.toPojo(JsonUtil.toJsonWithoutEmpth(queryResult.getResult().get(0)), GoalPOJO.class);
            goal.setId(po.getId());
            pojo = GenericQueryClient.updateGoal(goal);
        }

        return JsonUtil.toJsonWithoutEmpth(pojo.getBody());
    }

    @POST
    @Produces("application/json")
    @Path("getallgoals")
    public String getGoals() throws JsonMappingException, IOException, Exception {
        HttpResponsePOJO pojo = GenericQueryClient.getGoals();

        return pojo.getBody();
    }
}
