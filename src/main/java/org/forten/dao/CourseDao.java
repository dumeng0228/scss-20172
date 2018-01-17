package org.forten.dao;

import org.forten.dto.qo.CourseQoForTeacher;
import org.forten.dto.vo.CourseForTeacher;

import java.util.List;

public interface CourseDao {
    long queryCountForTeacher(CourseQoForTeacher qo);
    List<CourseForTeacher> queryForTeacher(CourseQoForTeacher qo);
    List<CourseForTeacher> queryForExport(CourseQoForTeacher qo);

}
