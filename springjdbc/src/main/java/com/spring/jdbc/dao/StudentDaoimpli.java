package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entity.Student;

public class StudentDaoimpli implements StudentDao{
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insert(Student student) {
		String q="insert into student(Id,name,city) values(?,?,?)";
		int res=this.jdbcTemplate.update(q,student.getId(),student.getName(),student.getCity());
		return res;
	}

	@Override
	public int change(Student student) {
		String q="update student set name=?,city=? where Id=? ";
		int res=this.jdbcTemplate.update(q,student.getName(),student.getCity(),student.getId());
		return res;
	}

	@Override
	public int delete(int studentId) {
		String q="delete from student where Id=? ";
		int res=this.jdbcTemplate.update(q,studentId);
		return res;
	}

	@Override
	public Student getStudent(int studentId) {
		String q="select * from student where Id=?";
		RowMapper<Student> rowMapper=new RowMapperimpli();
		
		Student student=this.jdbcTemplate.queryForObject(q, rowMapper,studentId);
		return student;
	}
	

}
