package spring.dao;

import org.springframework.stereotype.Repository;

@Repository(value="userDaoImpl")
public class UserDaoImpl implements UserDao {

    @Override
    public void add() {
        System.out.println("ADD User……");
    }
}
