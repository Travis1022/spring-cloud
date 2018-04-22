package com.cec.controller;

import com.cec.model.Person;
import com.cec.repository.PersonRepo;
import com.cec.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * 人员信息接口
 * Created by txw on 2018/4/22.
 */
@RestController
@RequestMapping(value = "/person")
public class PersonController {

    @Autowired
    private PersonRepo personRepo;

    @Autowired
    private PersonService personService;


    /**
     * 查询人员列表
     *
     * @return
     */
    @GetMapping(value = "/personList")
    private List<Person> selectPersonList() {
        return personRepo.findAll();
    }


    /**
     * 新增一个人员
     *
     * @param name
     * @param age
     * @return
     */
    @PostMapping(value = "/addPerson")
    private Person addPerson(@RequestParam("name") String name,
                             @RequestParam("age") Integer age) {
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        return personRepo.save(person);
    }


    /**
     * 根据Id来查询
     *
     * @param id
     * @return
     */
    @PostMapping(value = "/id/{id}")
    private Optional<Person> findPerson(@PathVariable("id") Integer id) {
        return personRepo.findById(id);
    }


    /**
     * 更新人员信息
     *
     * @param id
     * @param name
     * @param age
     * @return
     */
    @PutMapping(value = "/id/{id}")
    private Person updatePerson(@PathVariable("id") Integer id,
                                @RequestParam("name") String name,
                                @RequestParam("age") Integer age) {
        Person person = new Person();
        person.setId(id);
        person.setName(name);
        person.setAge(age);
        return personRepo.save(person);
    }

    /**
     * 删除人员信息
     *
     * @param id
     */
    @DeleteMapping(value = "/id/{id}")
    private void deletePerson(@PathVariable("id") Integer id) {
        personRepo.deleteById(id);
    }


    /**
     * 根据姓名来查询
     *
     * @param name
     * @return
     */
    @PostMapping(value = "/name")
    private List<Person> findPerson(@RequestParam("name") String name) {
        return personRepo.findByName(name);
    }


    /**
     * 插入两条人员信息（要求：同时插入成功，或者同时插入失败）
     */
    @PostMapping(value = "/two")
    private void twoPerson() {
        personService.addTwoPerson();
    }
}
