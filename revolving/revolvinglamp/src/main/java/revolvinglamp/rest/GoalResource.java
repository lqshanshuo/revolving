/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revolvinglamp.rest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import org.codehaus.jackson.map.JsonMappingException;
import revolvinglamp.GenericQueryClient;
import revolvinglamp.entity.Genericentity;
import revolvinglamp.model.GoalPOJO;
import v2.service.generic.library.model.QueryResultPOJO;
import v2.service.generic.library.model.ResponsePOJO;
import v2.service.generic.library.model.http.HttpResponsePOJO;
import v2.service.generic.library.utils.JsonUtil;

/**
 *
 * @author lxy
 */
@Stateless
@Path("goal")
public class GoalResource {

    @PersistenceContext(unitName = "revolvinglamp_revolvinglamp_war_1.0-SNAPSHOTPU")
    private EntityManager em;

//    @Path("add")
//    @POST
//    @Produces("application/json")
//    public String insertAndUpdateTest(@FormParam("queryJson") String queryJson) throws JsonMappingException, IOException {
//        Genericentity goal = JsonUtil.toPojo(queryJson, Genericentity.class);
//
//        try {
//            Genericentity entity = (Genericentity) em.createQuery("select c from Genericentity c where c.stringalpha=:stringalpha AND c.name=:name")
//                    .setParameter("stringalpha", goal.getStringalpha())
//                    .setParameter("name", goal.getName())
//                    .getSingleResult();
//
//            //update
//            java.util.logging.Logger.getLogger(GoalResource.class.getName()).log(java.util.logging.Level.INFO, "update entity: \n" + queryJson);
//
//            entity.setNumberalpha(goal.getNumberalpha());
//            entity.setNumberbeta(goal.getNumberbeta());
//            em.merge(entity);
//        } catch (NoResultException e) {
//            java.util.logging.Logger.getLogger(GoalResource.class.getName()).log(java.util.logging.Level.INFO, "insert entity: \n" + queryJson);
//
//            em.persist(goal);
//        }
//
//        ResponsePOJO resp = new ResponsePOJO();
//        resp.setHasError(Boolean.FALSE);
//        resp.setStatusCode(200);
//        return JsonUtil.toJsonWithoutEmpth(resp);
//    }    
    
    
    @Path("addtest")
    @POST
    @Produces("application/json")
    public String insertAndUpdate(@FormParam("queryJson") String queryJson) throws JsonMappingException, IOException {
        Genericentity goal = JsonUtil.toPojo(queryJson, Genericentity.class);

        List list = em.createQuery("select c from Genericentity c where c.stringalpha=:stringalpha AND c.name=:name")
                .setParameter("stringalpha", goal.getStringalpha())
                .setParameter("name", goal.getName())
                .getResultList();

        if (list == null || list.isEmpty()) {
            java.util.logging.Logger.getLogger(GoalResource.class.getName()).log(java.util.logging.Level.INFO, "insert entity: \n" + queryJson);

            em.persist(goal);
        } else {
            //update
            java.util.logging.Logger.getLogger(GoalResource.class.getName()).log(java.util.logging.Level.INFO, "update entity: \n" + queryJson);

            int length = list.size();
            Genericentity entity = (Genericentity) list.get(length - 1);
            
            entity.setNumberalpha(goal.getNumberalpha());
            entity.setNumberbeta(goal.getNumberbeta());
            em.merge(entity);
        }

        ResponsePOJO resp = new ResponsePOJO();
        resp.setHasError(Boolean.FALSE);
        resp.setStatusCode(200);
        return JsonUtil.toJsonWithoutEmpth(resp);
    }

    @POST
    @Produces("application/json")
    @Path("getallgoals")
    public String getGoals(@FormParam("last_fetch_time") Long lastFetchTime) throws IOException {
        List list = em.createQuery("select c from Genericentity c where c.numberbeta > :numberbeta")
                .setParameter("numberbeta", lastFetchTime)
                .getResultList();

        ResponsePOJO resp = new ResponsePOJO();
        resp.setResult(list);
        resp.setHasError(Boolean.FALSE);
        resp.setStatusCode(200);
        return JsonUtil.toJsonWithoutEmpth(resp);
    }

//    @Path("add")
//    @POST
//    @Produces("application/json")
//    public String insertAndUpdate(@FormParam("queryJson") String queryJson) throws JsonMappingException, IOException, Exception {
//        System.out.println(queryJson);
//        GoalPOJO goal = JsonUtil.toPojo(queryJson, GoalPOJO.class);
//
//        HttpResponsePOJO pojo = GenericQueryClient.getGoal(goal);
//
//        QueryResultPOJO queryResult = JsonUtil.toPojo(pojo.getBody(), QueryResultPOJO.class);
//
//        if (queryResult == null || queryResult.getResult() == null || queryResult.getResult().isEmpty()) {
//            //not in database
//            pojo = GenericQueryClient.insertGoal(goal);
//        } else {
//            //already in database, just update
//            GoalPOJO po = JsonUtil.toPojo(JsonUtil.toJsonWithoutEmpth(queryResult.getResult().get(0)), GoalPOJO.class);
//            goal.setId(po.getId());
//            pojo = GenericQueryClient.updateGoal(goal);
//        }
//
//        return JsonUtil.toJsonWithoutEmpth(pojo.getBody());
//    }
//
//    @POST
//    @Produces("application/json")
//    @Path("getallgoals0")
//    public String getGoals0() throws JsonMappingException, IOException, Exception {
//        HttpResponsePOJO pojo = GenericQueryClient.getGoals();
//
//        return pojo.getBody();
//    }
//
//    @POST
//    @Produces("application/json")
//    @Path("goals/{department}")
//    public String getGoalsByDepartment(@PathParam("department") String department) throws JsonMappingException, IOException, Exception {
//        HttpResponsePOJO pojo = GenericQueryClient.getGoalsByDepartment(department);
//
//        return pojo.getBody();
//    }
}
