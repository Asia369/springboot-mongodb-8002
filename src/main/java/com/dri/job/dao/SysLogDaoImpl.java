package com.dri.job.dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import com.dri.common.core.syslog.SysLog;

@Component
public class SysLogDaoImpl implements SysLogDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    public static final String DATEFORMAT_DATE7 = "yyyy-MM";
    public static final SimpleDateFormat fm = new SimpleDateFormat(DATEFORMAT_DATE7);
    
    /**
     * 创建对象
     * @param user
     */
    @Override
    public void saveUser(SysLog sysLog) {
    	String currentMonth=fm.format(new Date());
        mongoTemplate.save(sysLog,currentMonth);
    }

    
    /**
     * 根据用户名查询对象
     * @param userName
     * @return
     */
    @Override
    public SysLog findUserByUserName(String userName) {
        Query query=new Query(Criteria.where("userName").is(userName));
        List<SysLog> list=mongoTemplate.findAll(SysLog.class);
        for (SysLog userEntity : list) {
        	System.out.println(userEntity.toString());
		}
        
        SysLog user =  mongoTemplate.findOne(query , SysLog.class);
        return user;
    }

    /**
     * 更新对象
     * @param user
     */
    @Override
    public void updateUser(SysLog user) {
        Query query=new Query(Criteria.where("id").is(user.getId()));
     //   Update update= new Update().set("userName", user.getUserName()).set("passWord", user.getPassWord());
        //更新查询返回结果集的第一条
       // mongoTemplate.updateFirst(query,update,SysLog.class);
        //更新查询返回结果集的所有
        // mongoTemplate.updateMulti(query,update,UserEntity.class);
    }

    /**
     * 删除对象
     * @param id
     */
    @Override
    public void deleteUserById(Long id) {
        Query query=new Query(Criteria.where("id").is(id));
        mongoTemplate.remove(query,SysLog.class);
    }
}