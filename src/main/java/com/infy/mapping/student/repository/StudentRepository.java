package com.infy.mapping.student.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infy.mapping.student.bean.StudentBean;
@Repository
public interface StudentRepository extends CrudRepository<StudentBean, Long> {

	List<StudentBean> findByName(String name);
}
