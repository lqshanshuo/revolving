/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revolvinglamp;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import revolvinglamp.model.GoalPOJO;
import v2.service.generic.library.model.QueryPOJO;
import v2.service.generic.library.model.CUDPOJO;
import v2.service.generic.library.model.http.HttpResponsePOJO;
import v2.service.generic.library.utils.HttpClientUtil;
import v2.service.generic.library.utils.JsonUtil;

/**
 *
 * @author lxy
 */
public class GenericQueryClient {

    static String genericQueryUrl = "http://localhost:60872";

    public static HttpResponsePOJO getGoal(GoalPOJO goal) throws IOException, Exception {
        QueryPOJO query = new QueryPOJO();
        query.setClassName("v2.service.generic.query.entity.Genericentity");
        query.setPageMaxSize(1);
        query.setCurrentPageNumber(1);

        Map eq = new HashMap();
        eq.put("stringalpha", goal.getStringalpha());
        eq.put("name", goal.getName());
        query.setEqMap(eq);

        String jsonRequest = JsonUtil.toJsonWithoutEmpth(query);
        HttpResponsePOJO pojo = HttpClientUtil.jsonRequest(genericQueryUrl + "/service_generic_query/api/query/native", jsonRequest, "POST", null);

        return pojo;
    }

    public static HttpResponsePOJO insertGoal(GoalPOJO goal) throws IOException, Exception {
        CUDPOJO query = new CUDPOJO();
        query.setClassName("v2.service.generic.query.entity.Genericentity");

        Map attr = new HashMap();
        attr.put("stringalpha", goal.getStringalpha());
        attr.put("name", goal.getName());
        attr.put("numberalpha", goal.getNumberalpha());
        query.setAttributes(attr);

        String jsonRequest = JsonUtil.toJsonWithoutEmpth(query);

        Map headers = new HashMap();
        headers.put("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");

        HttpResponsePOJO pojo = HttpClientUtil.jsonRequest(genericQueryUrl + "/service_generic_query/api/cud/add", "queryJson="+jsonRequest, "POST", headers);
        return pojo;
    }

    public static HttpResponsePOJO updateGoal(GoalPOJO goal) throws IOException, Exception {
        CUDPOJO query = new CUDPOJO();
        query.setClassName("v2.service.generic.query.entity.Genericentity");

        Map attr = new HashMap();
                attr.put("id", goal.getId());
        attr.put("stringalpha", goal.getStringalpha());
        attr.put("name", goal.getName());
        attr.put("numberalpha", goal.getNumberalpha());
        query.setAttributes(attr);

        String jsonRequest = JsonUtil.toJsonWithoutEmpth(query);

        Map headers = new HashMap();
        headers.put("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");

        HttpResponsePOJO pojo = HttpClientUtil.jsonRequest(genericQueryUrl + "/service_generic_query/api/cud/update", "queryJson="+jsonRequest, "POST", headers);

        return pojo;
    }

    public static HttpResponsePOJO getGoals() throws IOException, Exception {
        QueryPOJO query = new QueryPOJO();
        query.setClassName("v2.service.generic.query.entity.Genericentity");
        query.setPageMaxSize(1000);
        query.setCurrentPageNumber(1);

        String jsonRequest = JsonUtil.toJsonWithoutEmpth(query);
        HttpResponsePOJO pojo = HttpClientUtil.jsonRequest(genericQueryUrl + "/service_generic_query/api/query/native", jsonRequest, "POST", null);

        return pojo;
    }
}
