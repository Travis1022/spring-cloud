package com.cec.repository;

import com.cec.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 数据库操作接口
 * Created by txw on 2018/4/22.
 */
public interface PersonRepo extends JpaRepository<Person, Integer> {

    /**
     * 根据姓名来查询
     *
     * @return
     */
    List<Person> findByName(String name);


}
