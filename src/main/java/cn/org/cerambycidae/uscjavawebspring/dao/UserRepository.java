package cn.org.cerambycidae.uscjavawebspring.dao;

import cn.org.cerambycidae.uscjavawebspring.db.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {
    // 通过名称找到用户
    User findUserByUname(String name);

    // 通过名称和密码找到用户
    User findUserByUnameAndPwd(String name, String pwd);

    // 通过名称模糊查询
    List<User> findUsersByUnameLike(String name);
}
