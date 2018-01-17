package org.forten.bo;

import org.forten.dao.HibernateDao;
import org.forten.dao.MybatisDao;
import org.forten.dto.Message;
import org.forten.dto.vo.CourseForTeacher;
import org.forten.dto.vo.CourseUpdateForTeacher;
import org.forten.entity.Course;
import org.forten.utils.system.BeanPropertyUtil;
import org.forten.utils.system.ValidateUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("courseBo")
public class CourseBo {
    @Resource
    private HibernateDao dao;
    @Resource
    private MybatisDao mybatisDao;
    @Transactional
    public Message doSave(Course course){
        ValidateUtil.validateThrow(course);
        try{
            dao.save(course);
            return Message.info("保存成功");
        }catch (Exception e){
            e.printStackTrace();
            return Message.error("保存失败");
        }

    }
    @Transactional
    public Message doUpdate(CourseUpdateForTeacher vo){
        ValidateUtil.validateThrow(vo);
        try{
            Course course = dao.loadById(Course.class,vo.getId());
            BeanPropertyUtil.copy(course,vo);
            return Message.info("修改成功");

        }catch(Exception e){
            e.printStackTrace();
            return Message.error("修改失败");
        }
    }





}
