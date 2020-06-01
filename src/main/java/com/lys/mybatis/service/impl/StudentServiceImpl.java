package com.lys.mybatis.service.impl;

import com.lys.mybatis.mapper.StudentMapper;
import com.lys.mybatis.model.Student;
import com.lys.mybatis.service.StudentService;
import com.lys.mybatis.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/06/01.
 */
@Service
@Transactional
public class StudentServiceImpl extends AbstractService<Student> implements StudentService {
    @Resource
    private StudentMapper studentMapper;

}
