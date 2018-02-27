package com.student;

import java.io.IOException;
import java.util.List;

public interface StudentMapper {

    public Student findUserById(int id) throws IOException;//查询
    public List<Student> findUserByName(String name)throws IOException;
    //模糊查询（查询结果不一定只有一个，所以将查询结果放入List集合中。
    public int insertUser(Student student) throws  Exception;//增加
    public int deleteUser(int id) throws  Exception;//删除指定id的记录
    public int updateUser(Student student) throws Exception;//更改指定id的数据

}
