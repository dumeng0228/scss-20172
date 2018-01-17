package org.forten.action;

import org.forten.bo.CourseBo;
import org.forten.dto.Message;
import org.forten.dto.vo.CourseUpdateForTeacher;
import org.forten.entity.Course;
import org.forten.utils.common.StringUtil;
import org.forten.utils.system.ValidateException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
@RestController
public class CourseAction {
    @Resource
    private CourseBo bo;

    @PostMapping("/course")
    public @ResponseBody
    Message save(@RequestBody Course course) {
        try {
            return bo.doSave(course);
        } catch (ValidateException e) {
            return Message.error(StringUtil.join(e.getMessages(), "<br>"));
        }
    }

    @PutMapping("/course")
    public @ResponseBody
    Message update(@RequestBody CourseUpdateForTeacher vo) {
        try {
            return bo.doUpdate(vo);
        } catch (ValidateException e) {
            return Message.error(StringUtil.join(e.getMessages(), "<br>"));
        }
    }
}
