package com.wei.mybatisplus_pratice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wei.mybatisplus_pratice.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
