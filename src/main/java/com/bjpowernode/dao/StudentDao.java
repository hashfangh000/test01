package com.bjpowernode.dao;
import com.bjpowernode.domain.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Student)表数据库访问层
 *
 * @author makejava
 * @since 2021-08-13 09:25:15
 */
public interface StudentDao {
    List<Student> selectStudents();
    int insertStudent(Student student);
}

