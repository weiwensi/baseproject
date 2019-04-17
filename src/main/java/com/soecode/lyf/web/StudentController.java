package com.soecode.lyf.web;



import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@Api("学生接口")
@RequestMapping("student")
public class StudentController {




    @ApiOperation(value = "根据学生的name，获得单个学生的信息", notes = "根据学生的name，查询学生对象的信息。")
    @ApiImplicitParam(name = "name", value = "学生的名称", required = true, dataType = "String")
    @ResponseBody
    @RequestMapping(value = "getStudentByName", method = RequestMethod.POST)
    public String getStudentByName(String name) {
        return "";
    }

    @ApiOperation(value = "根据学生的name和age，获得单个学生的信息", notes = "根据学生的name和age，查询学生对象的信息。")
    @ApiImplicitParams({@ApiImplicitParam(name = "name", value = "学生名称", required = true, dataType = "String"),
            @ApiImplicitParam(name = "age", value = "学生年龄", required = true, dataType = "int")})
    @ResponseBody
    @RequestMapping(value = "getStudentByNameAndAge", method = RequestMethod.POST)
    public String getStudentByName(String name, int age) {
        return "";
    }

    @ApiOperation(value = "新建学生对象到数据库", notes = "新建数据到数据库。")
    @ApiImplicitParam(name = "student", value = "学生对象", required = true, dataType = "Student")
    @ResponseBody
    @RequestMapping(value = "createNewStudent", method = RequestMethod.POST)
    public String create() {
        return "";
    }
}
