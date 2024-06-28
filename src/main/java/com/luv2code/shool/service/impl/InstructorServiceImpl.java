package com.luv2code.shool.service.impl;

import com.luv2code.shool.dto.InstructorDto;
import com.luv2code.shool.exception.ObjectNotFoundException;
import com.luv2code.shool.model.Instructor;
import com.luv2code.shool.repository.InstructorRepository;
import com.luv2code.shool.service.InstructorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InstructorServiceImpl implements InstructorService {

    private final InstructorRepository instructorRepository;


    @Override
    public Integer save(InstructorDto instructorDto) {
        return instructorRepository.save(InstructorDto.toEntity(instructorDto)).getId();
    }

    @Override
    public List<InstructorDto> findAll() {
        return instructorRepository.findAll().stream().map(InstructorDto::fromEntity).toList();
    }

    @Override
    public InstructorDto findById(Integer id) {
        return instructorRepository
                .findById(id)
                .map(InstructorDto::fromEntity)
                .orElseThrow(
                        ()->new ObjectNotFoundException("instructor not found with ID: "+id, Instructor.class.getName())
                );
    }

    @Override
    public Integer delete(Integer id) {
        instructorRepository.deleteById(id);
        return id;
    }

}
