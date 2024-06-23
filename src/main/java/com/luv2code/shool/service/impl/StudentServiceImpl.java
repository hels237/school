package com.luv2code.shool.service.impl;

import com.luv2code.shool.dto.StudentDto;
import com.luv2code.shool.model.Student;
import com.luv2code.shool.repository.StudentRepository;
import com.luv2code.shool.service.StudentService;
import lombok.RequiredArgsConstructor;

import java.util.List;

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
        return null;
    }

    @Override
    public Integer delete(Integer id) {
        return 0;
    }
}
