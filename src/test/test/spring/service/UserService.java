package spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import spring.dao.UserDao;

//在注解里面value属性值可以省略不写
//默认值是类名称，首字母小写
//UserService -- userService
@Repository(value="userService") //<bean id="userService",class="...">
public class UserService {
    @Value(value="abc")
    private String name;

//定义dao类型属性
//    不需要添加set方法
//    添加注入属性注解
    @Autowired
    @Qualifier(value="userDaoImpl")
    private UserDao userDao;

    public void add()
    {
        System.out.println("Add……"+name);
        userDao.add();
    }
}
