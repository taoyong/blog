package login.impl;

import login.LoginDao;
import login.LoginService;

/**
 * Created by taoyong on 15/12/12.
 */
public class LoginServiceImpl implements LoginService{

    private LoginDao loginDao;
    public  String show(){
        String msg = loginDao.getMsg();
        return msg;
    }

    public void setLoginDao(LoginDao loginDao) {
        this.loginDao = loginDao;
    }
}
