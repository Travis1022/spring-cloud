package com.txw.dao;

import com.txw.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by txw on 2018/5/6.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
