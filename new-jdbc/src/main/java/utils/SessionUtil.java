package utils;

import javax.servlet.http.HttpServletRequest;

public class SessionUtil {

    private static SessionUtil sessionUtil = null;

    public static SessionUtil getInstance(){
        if(sessionUtil == null){
            sessionUtil = new SessionUtil();
        }
        return sessionUtil;
    }

    public static void putValue(HttpServletRequest request, String key, Object value){
        //taij sao phai co request -> de khoi taoj dduowjc sessiton
        request.getSession().setAttribute(key, value);
    }

    public static Object getValue(HttpServletRequest request, String key){
        return request.getSession().getAttribute(key);
    }

    public static void removeValue(HttpServletRequest request, String key){
        request.getSession().removeAttribute(key);
    }
}
