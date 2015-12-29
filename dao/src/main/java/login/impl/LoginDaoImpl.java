package login.impl;

import com.taoyong.blog.commom.dao.BaseDao;
import login.LoginDao;

/**
 * Created by taoyong on 15/12/12.
 */
public class LoginDaoImpl extends BaseDao implements LoginDao {
    public String getMsg() {
        return "验证通过!";
    }

}
