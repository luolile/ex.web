package com.microhelper.sysuser.persistent.mapper;

import com.microhelper.sysuser.persistent.model.SysUserDept;

public interface SysUserDeptMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_dept
     *
     * @mbggenerated Mon Apr 13 20:56:34 CST 2020
     */
    int deleteByPrimaryKey(Integer userDeptId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_dept
     *
     * @mbggenerated Mon Apr 13 20:56:34 CST 2020
     */
    int insert(SysUserDept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_dept
     *
     * @mbggenerated Mon Apr 13 20:56:34 CST 2020
     */
    int insertSelective(SysUserDept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_dept
     *
     * @mbggenerated Mon Apr 13 20:56:34 CST 2020
     */
    SysUserDept selectByPrimaryKey(Integer userDeptId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_dept
     *
     * @mbggenerated Mon Apr 13 20:56:34 CST 2020
     */
    int updateByPrimaryKeySelective(SysUserDept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_dept
     *
     * @mbggenerated Mon Apr 13 20:56:34 CST 2020
     */
    int updateByPrimaryKey(SysUserDept record);
}