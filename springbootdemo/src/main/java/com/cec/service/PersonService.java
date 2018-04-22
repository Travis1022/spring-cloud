package com.cec.service;

import com.cec.model.Person;
import com.cec.repository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by txw on 2018/4/22.
 */
@Service
public class PersonService {

    @Autowired
    private PersonRepo personRepo;


    /**
     * 数据库事物操作，如果插入成功，则同时插入成功，
     * 如果插入失败，则均不插入
     */
    @Transactional
    public void addTwoPerson() {
        Person person = new Person();
        person.setAge(5);
        person.setName("秋田");
        personRepo.save(person);

        Person personB = new Person();
        personB.setAge(6);
        personB.setName("柴犬");
        personRepo.save(personB);
    }
}
