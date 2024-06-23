package com.luv2code.shool.repository;

import com.luv2code.shool.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CourseRepository extends JpaRepository<Course,Integer> {

}
