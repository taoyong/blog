package action;


import com.taoyong.blog.domain.user.User;
import com.taoyong.blog.service.user.UserService;
import login.LoginService;

/**
 * Created by taoyong on 15/12/12.
 */
public class LoginAction extends BaseAction{
    private LoginService loginService ;
    private UserService userService;
    private User user;

    public String  index(){
        String msg = loginService.show();
        userService.addUser(user);
        System.out.println("欢迎登陆!" + msg);
        return SUCCESS;
    }

    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
