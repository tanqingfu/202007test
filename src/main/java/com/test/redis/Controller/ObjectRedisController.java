package com.test.redis.Controller;

import com.test.redis.dao.PersonDao;
import com.test.redis.meta.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ObjectRedisController {

    protected static Logger logger= LoggerFactory.getLogger(ObjectRedisController.class);
    @Resource PersonDao PersonDao;
    @RequestMapping("/setPerson")

    public void set(String id,String name,Integer age){
        logger.debug("访问setPerson:id={},name={},age={}",id,name,age);
        Person person=new Person(id,name,age);
        PersonDao.save(person);
    }

    @RequestMapping("/getPerson")
    public Person getPerson(String id){
        return PersonDao.getPerson(id);
    }
}
