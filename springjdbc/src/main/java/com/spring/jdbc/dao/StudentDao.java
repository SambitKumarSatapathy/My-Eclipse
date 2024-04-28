package com.spring.jdbc.dao;

import com.spring.jdbc.entity.Student;

public interface StudentDao {
	public int insert(Student student);//for insert
    public int change(Student student);//for update
    public int delete(int studentId);//for delete
    public Student getStudent(int studentId);
}
