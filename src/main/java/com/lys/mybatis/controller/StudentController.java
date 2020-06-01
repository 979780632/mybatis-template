package com.lys.mybatis.controller;

import com.lys.mybatis.core.Result;
import com.lys.mybatis.core.ResultGenerator;
import com.lys.mybatis.model.Student;
import com.lys.mybatis.service.StudentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


/**
* Created by CodeGenerator on 2020/06/01.
*/
@RestController
@RequestMapping("/student")
@Api(value = "Student API接口", tags = "Student")
public class StudentController {
    @Resource
    private StudentService studentService;

    @RequestMapping("test01")
    public String test01(){
        return "测试方法";
    }
    @PostMapping
    public Result add(@RequestBody Student student) {
        studentService.save(student);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        studentService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody Student student) {
        studentService.update(student);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        Student student = studentService.findById(id);
        return ResultGenerator.genSuccessResult(student);
    }

    @GetMapping("/pageManage")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Student> list = studentService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
