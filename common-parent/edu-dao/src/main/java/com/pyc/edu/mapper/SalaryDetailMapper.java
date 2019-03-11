package com.pyc.edu.mapper;

import com.pyc.edu.model.SalaryDetail;
import com.pyc.edu.model.SalaryDetailExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SalaryDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_salary_detail
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    int countByExample(SalaryDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_salary_detail
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    int deleteByExample(SalaryDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_salary_detail
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_salary_detail
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    int insert(SalaryDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_salary_detail
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    int insertSelective(SalaryDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_salary_detail
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    List<SalaryDetail> selectByExample(SalaryDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_salary_detail
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    SalaryDetail selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_salary_detail
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    int updateByExampleSelective(@Param("record") SalaryDetail record, @Param("example") SalaryDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_salary_detail
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    int updateByExample(@Param("record") SalaryDetail record, @Param("example") SalaryDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_salary_detail
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    int updateByPrimaryKeySelective(SalaryDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_salary_detail
     *
     * @mbggenerated Mon Mar 11 09:55:01 CST 2019
     */
    int updateByPrimaryKey(SalaryDetail record);
}