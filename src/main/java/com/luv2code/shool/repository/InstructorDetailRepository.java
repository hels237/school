package com.luv2code.shool.repository;

import com.luv2code.shool.model.InstructorDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InstructorDetailRepository extends JpaRepository<InstructorDetails,Integer> {
}
