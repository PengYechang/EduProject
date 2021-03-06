package com.pyc.edu.mapper;

import com.pyc.edu.model.Course;
import com.pyc.edu.model.CourseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CourseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_course
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    int countByExample(CourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_course
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    int deleteByExample(CourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_course
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_course
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    int insert(Course record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_course
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    int insertSelective(Course record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_course
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    List<Course> selectByExample(CourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_course
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    Course selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_course
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    int updateByExampleSelective(@Param("record") Course record, @Param("example") CourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_course
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    int updateByExample(@Param("record") Course record, @Param("example") CourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_course
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    int updateByPrimaryKeySelective(Course record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_course
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    int updateByPrimaryKey(Course record);
}