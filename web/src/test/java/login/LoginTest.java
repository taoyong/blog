package login;

import action.LoginAction;
import org.junit.Test;
/**
 * Created by taoyong on 15/12/12.
 */
public class LoginTest {
    private LoginAction myTest = new LoginAction();
    @Test
    public void testShow(){
       myTest.index();
    }
}
