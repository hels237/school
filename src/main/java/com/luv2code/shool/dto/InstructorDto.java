package com.luv2code.shool.dto;

import com.luv2code.shool.model.Instructor;
import com.luv2code.shool.model.Student;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class InstructorDto {

    private String firstname;
    private String lastname;
    private String email;


/*************************** mapping dto and entity******************************/

    public static InstructorDto fromEntity(Instructor instructor){
        return InstructorDto
                .builder()
                .firstname(instructor.getFirstname())
                .lastname(instructor.getLastname())
                .email(instructor.getEmail())
                .build();
    }

    public static Instructor toEntity(InstructorDto instructorDto){
        return Instructor
                .builder()
                .firstname(instructorDto.getFirstname())
                .lastname(instructorDto.getLastname())
                .email(instructorDto.getEmail())
                .build();
    }

}
