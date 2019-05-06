package cn.org.cerambycidae.uscjavawebspring.dao;

import cn.org.cerambycidae.uscjavawebspring.db.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
