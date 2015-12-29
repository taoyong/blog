package user;

import com.taoyong.blog.domain.user.User;

/**
 * Created by taoyong on 15/12/13.
 */
public interface UserDao {
    User getById(int id);

    int deleteById(int id);

    void update(User user);

    void add(User user);
}
