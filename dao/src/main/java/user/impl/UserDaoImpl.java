package user.impl;

import com.taoyong.blog.commom.dao.BaseDao;
import com.taoyong.blog.commom.util.DateUtils;
import com.taoyong.blog.domain.user.User;
import org.springframework.dao.DataAccessException;
import user.UserDao;

/**
 * Created by taoyong on 15/12/13.
 */
public class UserDaoImpl extends BaseDao implements UserDao{

    public User getById(int id){
        return new User();
    }

    public int deleteById(int id){
        return 0;
    }

    public void update(User user) {
        String sql = "insert into userInfo (user_account,user_type,created) values( \"test2\",2,\"2015-12-26 10:47:00\")";
        jdbcTemplate.update(sql);
        System.out.println("******************** update  data success ********************");
        //System.out.println("修改了" + count + "行数据。");
    }
    public  void add(User user){

        String userAccount = user.getUserAccount();
        String userPwd = user.getUserPwd();
        int userType = user.getUserType();
        String createTime = DateUtils.getCurrentDateTimeStr();
        user.setCreated(createTime);
        //String sql = "insert into userInfo (user_account,user_pwd,user_type,created) values(\'"+userAccount+"','"+userPwd+"',"+userType+",'"+createTime+"')";
        String sql = "insert into userInfo (user_account,user_pwd,user_type,created) values(?,?,?,?)";
        try {
            jdbcTemplate.update(sql,userAccount,userPwd,userType,createTime);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        System.out.println("新增用户,user=" + user.toString());
    }

}
