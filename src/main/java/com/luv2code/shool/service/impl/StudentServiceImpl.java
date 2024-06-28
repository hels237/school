package com.luv2code.shool.service.impl;

import com.luv2code.shool.dto.StudentDto;
import com.luv2code.shool.exception.ObjectNotFoundException;
import com.luv2code.shool.model.Student;
import com.luv2code.shool.repository.StudentRepository;
import com.luv2code.shool.service.StudentService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Supplier;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;


    @Override
    public Integer save(StudentDto studentDto) {
        return studentRepository.save(StudentDto.toEntity(studentDto)).getId();
    }


    @Override
    public List<StudentDto> findAll() {
        return studentRepository.findAll().stream().map(StudentDto::fromEntity).toList();
    }

    @Override
    public StudentDto findById(Integer id) {

        return studentRepository
                .findById(id).map(StudentDto::fromEntity)
                .orElseThrow(()->
                        new ObjectNotFoundException("student not found with ID : "+id,Student.class.getName()));
    }

    @Override
    public Integer delete(Integer id) {
        studentRepository.deleteById(id);
        return id;
    }


}
