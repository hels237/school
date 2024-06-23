package com.luv2code.shool.dto;


import com.luv2code.shool.model.Student;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentDto {

    private String firstname;
    private String lastname;
    private String studentCode;


    /*************************** mapping dto and entity******************************/

    public static StudentDto fromEntity(Student student){
        return StudentDto
                .builder()
                .firstname(student.getFirstname())
                .lastname(student.getLastname())
                .studentCode(student.getStudentCode())
                .build();
    }

    public static Student toEntity(StudentDto studentDto){
        return Student
                .builder()
                .firstname(studentDto.getFirstname())
                .lastname(studentDto.getLastname())
                .studentCode(studentDto.getStudentCode())
                .build();
    }
}
