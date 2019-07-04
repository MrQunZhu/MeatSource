package com.clesun.bigdataservice.dao;

import com.clesun.bigdataservice.entity.CRole;
import com.clesun.bigdataservice.entity.CRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_role
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    int countByExample(CRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_role
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    int deleteByExample(CRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_role
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    int deleteByPrimaryKey(Long roleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_role
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    int insert(CRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_role
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    int insertSelective(CRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_role
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    List<CRole> selectByExample(CRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_role
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    CRole selectByPrimaryKey(Long roleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_role
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    int updateByExampleSelective(@Param("record") CRole record, @Param("example") CRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_role
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    int updateByExample(@Param("record") CRole record, @Param("example") CRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_role
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    int updateByPrimaryKeySelective(CRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_role
     *
     * @mbggenerated Mon Aug 20 09:15:13 CST 2018
     */
    int updateByPrimaryKey(CRole record);
}