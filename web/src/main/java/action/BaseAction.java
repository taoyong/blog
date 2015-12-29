package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

/**
 * Created by taoyong on 15/12/12.
 */
public class BaseAction extends ActionSupport {
    public void toView(String key, Object obj){
        ActionContext actionContext= ActionContext.getContext();
        Map<String,Object> request = (Map) actionContext.get("request");
        request.put(key, obj);
    }
}